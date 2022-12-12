package kg.charginov.command;

import kg.charginov.command.commands.Command;

public class DoCommands {
    Command insert;
    Command delete;
    Command paste;
    Command copy;
    Command redo;
    Command undo;

    public DoCommands(Command insert, Command delete, Command paste, Command copy, Command redo, Command undo) {
        this.insert = insert;
        this.delete = delete;
        this.paste = paste;
        this.copy = copy;
        this.redo = redo;
        this.undo = undo;
    }

    public void insert(){
        insert.execute();
    }
    public void copy(){
        copy.execute();
    }
    public void paste(){
        paste.execute();
    }
    public void delete(){
        delete.execute();
    }
    public void redo(){
        redo.execute();
    }
    public void undo(){
        undo.execute();
    }

}
