package Memento;

// Originator
public class TextFile {
    private String filename;
    private StringBuilder content;

    public TextFile(String filename) {
        this.filename = filename;
        content = new StringBuilder();
    }

    public void appendText(String txt){
        content.append(txt);
    }

    public Memento save(){
        return new Memento(filename,content);
    }

    public void undoToLastState(Object obj){
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }

    @Override
    public String toString(){
        return content.toString();
    }

    private class Memento{
        private String filename;
        private StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;
            this.content = new StringBuilder(content);
        }
    }
}
