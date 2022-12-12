package kg.charginov.command.commands;

public class InsertCommand implements Command{

    private TextProcessor text;
    private String textToInsert;
    private int idx;

    public InsertCommand(TextProcessor text, String textToInsert, int idx) {
        this.text = text;
        this.textToInsert = textToInsert;
        this.idx = idx;
    }

    @Override
    public void execute() {
        text.backup();
        String start = text.getText().substring(0,idx);
        String end = text.getText().substring(idx);
        text.setText(start + " " + textToInsert + " " + end);
        text.getTextHistory().push(start + " " + textToInsert + " " + end);
        System.out.println("Текст успешно вставлен!\n");
    }
}
