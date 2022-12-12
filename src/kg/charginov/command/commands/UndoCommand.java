package kg.charginov.command.commands;

public class UndoCommand implements Command{

    private TextProcessor text;

    public UndoCommand(TextProcessor text) {
        this.text = text;
    }

    @Override
    public void execute() {
        text.backupUndo();
    }
}
