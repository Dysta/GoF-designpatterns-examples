package Iterator;

public class Repository implements Collection{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new RepoIterator();
    }

    private class RepoIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }else return null;
        }
    }
}
