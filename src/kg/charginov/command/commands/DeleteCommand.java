package kg.charginov.command.commands;

public class DeleteCommand implements Command{
    private TextProcessor text;
    private int idx1;
    private int idx2;

    public DeleteCommand(TextProcessor text, int idx1, int idx2) {
        this.text = text;
        this.idx1 = idx1;
        this.idx2 = idx2;
    }

    @Override
    public void execute() {
        text.backup();
        String start = text.getText().substring(0,idx1);
        String end = text.getText().substring(idx2);
        text.setText(start + " " + end);
        System.out.println("Текст успешно удален!\n");
    }
}
