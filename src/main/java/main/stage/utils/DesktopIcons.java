package main.stage.utils;

public enum DesktopIcons {
    REDO("arrow_redo.png"),
    UNDO("arrow_undo.png"),
    CUT("cut_red.png"),
    SAVE("diskette.png"),
    NEW("page.png"),
    COPY("page_copy.png"),
    PASTE("page_paste.png"),
    ADD_PICTURE("picture_add.png"),
    ALIGN_CENTER("text_align_center.png"),
    ALIGN_JUSTIFY("text_align_justify.png"),
    ALIGN_LEFT("text_align_left.png"),
    ALIGN_RIGHT("text_align_right.png"),
    BOLD("text_bold.png"),
    INDENT("text_indent.png"),
    INDENT_REMOVE("text_indent_remove.png"),
    ITALIC("text_italic.png"),
    STRIKETHROUGH("text_strikethrough.png"),
    UNDERLINE("text_underline.png");

    private final String fileName;

    DesktopIcons(String fileName) {
        this.fileName = fileName;
    }

    public String fileName() {
        return fileName;
    }
}
