package kg.charginov.command.commands;

import java.util.Stack;

public class TextProcessor {
    private String text;
    private String clipboard;
    private Stack<String> textHistory = new Stack<>();
    private String backup;
    private String backup2;

    public TextProcessor(String text) {
        this.text = text;
    }

    public void backup(){
        backup2 = backup;
        backup = text;
    }

    public void backupUndo(){
        text = backup2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public Stack<String> getTextHistory() {
        return textHistory;
    }
}
