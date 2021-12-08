package main.stage.utils;

public enum ResourcesPath {
    DESKTOP_ICONS("src/main/resources/icons/desktop-icons/");

    private final String path;

    ResourcesPath(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
