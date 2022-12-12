package kg.charginov.command;

import kg.charginov.command.commands.*;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TextProcessor text = new TextProcessor("Тесктовый редактор работает с двумя текстовыми файлами. В первом находится строка, над которой он проводит все операции. Во втором - пследовательность комманд, которые нужно выполнить. Необходимо реализовать поддержку следующих комманд");
        DoCommands commands = new DoCommands(
                new InsertCommand(text,"999",1),
                new DeleteCommand(text,2,7),
                new PasteCommand(text,6),
                new CopyCommand(text,1,3),
                new RedoCommand(text),
                new UndoCommand(text)
        );
        System.out.println("=============================================================================");
        commands.copy();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.insert();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.paste();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.undo();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.redo();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.delete();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.undo();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.undo();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.redo();
        System.out.println("ТЕКСТ: " + text.getText());
        System.out.println("БУФЕР ОБМЕНА: " + text.getClipboard());
        System.out.println("=============================================================================");
        commands.redo();
    }
}
