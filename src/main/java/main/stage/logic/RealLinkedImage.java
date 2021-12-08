package main.stage.logic;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class RealLinkedImage implements LinkedImage {

    private final String imagePath;

    public RealLinkedImage(String imagePath) {
        String currentDir = System.getProperty("user.dir") + File.separatorChar;
        if (imagePath.startsWith(currentDir)) {
            imagePath = imagePath.substring(currentDir.length());
        }
        this.imagePath = imagePath;
    }


    @Override
    public boolean isReal() {
        return true;
    }

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String toString() {
        return String.format("RealLinkedImage[path=%s]", imagePath);
    }

    @Override
    public Node createNode() {
        Image image = new Image("file:" + imagePath);
        ImageView result = new ImageView(image);
        return result;
    }
}
