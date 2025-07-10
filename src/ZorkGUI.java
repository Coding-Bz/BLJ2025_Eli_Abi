import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZorkGUI extends JFrame {
    private JLabel imageLabel;
    private JTextArea textArea;
    private JTextField inputField;
    private ImageManager imageManager;
    private CommandParser parser;
    private CommandVocabulary vocab;
    private Story story;
    private Player player;
    private int currentChapter = 1;

    private JScrollPane scrollPane;

    public ZorkGUI() {
        initializeComponents();
        setupLayout();
        setupGame();
    }

    private void initializeComponents() {
        setTitle("Zork");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setPreferredSize(new Dimension(780, 300));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(780, 200));

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));
        inputField.addActionListener(new InputListener());

        imageManager = new ImageManager();
        vocab = new CommandVocabulary();
        parser = new CommandParser(vocab);
        story = new Story();
        player = new Player("", false, 1, false);
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Zork", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titleLabel, BorderLayout.NORTH);

        add(imageLabel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(scrollPane, BorderLayout.CENTER);
        bottomPanel.add(inputField, BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void setupGame() {
        displayChapter(1);
        updateImage("istanbul_start");
    }

    private void displayChapter(int chapter) {
        textArea.setText("");
        switch(chapter) {
            case 1:
                story.Kapitel1();
                break;
            case 2:
                story.Kapitel2();
                break;
            case 3:
                story.Kapitel3();
                break;
            case 4:
                story.Kapitel4();
                break;
            case 5:
                story.Kapitel5();
                break;
        }
    }

    private void updateImage(String imageName) {
        String imagePath = imageManager.getImagePath(imageName);
        if (imagePath != null) {
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(780, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
        }
    }

    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText().trim();
            if (!input.isEmpty()) {
                processInput(input);
                inputField.setText("");
            }
        }
    }

    private void processInput(String input) {
        textArea.append("> " + input + "\n");

        ParsedCommand result = parser.parse(input);

        if (result.getType() == com.zork.parser.CommandType.UNKNOWN) {
            textArea.append("I don't understand that command.\n");
        } else {
            textArea.append("Recognized: " + result.getMatchedWord() + "\n");
        }
        updateImageForInput(input);

        textArea.append("\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }


    private void updateImageForInput(String input) {
        String key = input.toLowerCase().trim();

        switch (key) {
            case "ventilator":
                updateImage("ventilator");
                break;
            case "verstecken":
            case "durchsuchen":
                updateImage("chapter_1");
                break;
            case "anschalten":
            case "nur putzen":
            case "daten einsehen":
            case "nur schwitzen":
                updateImage("chapter_2");
                break;
            case "fliehe":
                updateImage("chapter_3");
                break;
            case "brühen":
            case "salz hinzufügen":
            case "tee machen":
                updateImage("tea");
                break;
            case "gaziantep":
                updateImage("gaziantep");
                break;
            case "höre den kodex":
            case "reise nach istanbul":
                updateImage("chapter_4");
                break;
            case "aktiviere den generator":
            case "eine rede halten":
            case "tanzen":
                updateImage("chapter_5");
                break;
            default:
                updateImage("default");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ZorkGUI().setVisible(true);
        });
    }
}