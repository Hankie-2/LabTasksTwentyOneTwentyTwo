package kg.charginov.command.commands;

public class PasteCommand implements Command{

    private TextProcessor text;
    private int idx;

    public PasteCommand(TextProcessor text, int idx) {
        this.text = text;
        this.idx = idx;
    }

    @Override
    public void execute() {
        if(!text.getClipboard().isEmpty()){
            text.backup();
            String start = text.getText().substring(0,idx);
            String end = text.getText().substring(idx);
            text.setText(start + " " + text.getClipboard() + " " + end);
            text.getTextHistory().push(start + " " + text.getClipboard() + " " + end);
            System.out.println("Скопированный текст успешно вставлен!\n");
        }
    }
}
