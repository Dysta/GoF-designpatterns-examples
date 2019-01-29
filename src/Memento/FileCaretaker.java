package Memento;

public class FileCaretaker {
    private Object obj;

    public void save(TextFile txt){
        this.obj = txt.save();
    }

    public void undo(TextFile txt){
        txt.undoToLastState(obj);
    }
}
