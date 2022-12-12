package kg.charginov.command.commands;

public class RedoCommand implements Command{

    private TextProcessor text;

    public RedoCommand(TextProcessor text) {
        this.text = text;
    }

    @Override
    public void execute() {
        text.backup();
    }
}
