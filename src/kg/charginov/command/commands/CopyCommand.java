package kg.charginov.command.commands;

public class CopyCommand implements Command{
    private TextProcessor text;
    private int idx1;
    private int idx2;
    private String undoText;

    public CopyCommand(TextProcessor text,int idx1,int idx2){
        this.text = text;
        this.idx1 = idx1;
        this.idx2 = idx2;
    }

    @Override
    public void execute() {
        text.setClipboard(text.getText().substring(idx1,idx2));
        System.out.println("'Успешно скопировано в буфер обмена!\n");
    }
}
