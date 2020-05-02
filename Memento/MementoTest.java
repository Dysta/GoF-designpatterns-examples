package Memento;

public class MementoTest {
    public static void main(String[] args){
        TextFile txtFile = new TextFile("file.txt");
        txtFile.appendText("First text...");
        FileCaretaker caretaker = new FileCaretaker();
        caretaker.save(txtFile);

        txtFile.appendText("+ Some content");

        System.out.println(txtFile.toString());

        caretaker.undo(txtFile);

        System.out.println(txtFile.toString());
    }
}
