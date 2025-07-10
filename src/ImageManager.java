import java.util.HashMap;
import java.util.Map;

public class ImageManager {
    private Map<String, String> imagePaths;

    public ImageManager() {
        imagePaths = new HashMap<>();
        initializeImagePaths();
    }

    private void initializeImagePaths() {
        imagePaths = new HashMap<>();

        imagePaths.put("istanbul_start", "src/images/istanbul_start.jpg");

        imagePaths.put("chapter_1", "src/Image/Chapter-1_01.jpg");
        imagePaths.put("chapter_2", "src/Image/Chapter-2_02.png");
        imagePaths.put("chapter_3", "src/Image/Chapter+3.jpg");
        imagePaths.put("chapter_4", " ");
        imagePaths.put("chapter_5", " ");


        imagePaths.put("ventilator", "src/Image/Ventilator.png");
        imagePaths.put("verstecken", "src/Image/Verstecken.png");
        imagePaths.put("durchsuchen", "src/Image/durchsuchen.png");

        imagePaths.put("anschalten", "src/Image/WeiterKapitel2.png");

        imagePaths.put("nur putzen", " ");
        imagePaths.put("daten einsehen", " ");
        imagePaths.put("nur schwitzen", " ");

        imagePaths.put("fliehe", " ");

        imagePaths.put("brühen", " ");
        imagePaths.put("salz hinzufügen", " ");
        imagePaths.put("tee machen", " ");

        imagePaths.put("gaziantep", " ");

        imagePaths.put("höre den kodex", " ");
        imagePaths.put("reise nach istanbul", " ");

        imagePaths.put("aktiviere den generator", " ");
        imagePaths.put("eine rede halten", " ");
        imagePaths.put("tanzen", " ");

        imagePaths.put("default", " ");
    }


    public String getImagePath(String imageName) {
        return imagePaths.getOrDefault(imageName, imagePaths.get("default"));
    }

    public void addImage(String name, String path) {
        imagePaths.put(name, path);
    }

    public void removeImage(String name) {
        imagePaths.remove(name);
    }

    public boolean hasImage(String name) {
        return imagePaths.containsKey(name);
    }
}