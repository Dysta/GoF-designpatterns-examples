package Iterator;

public class IteratorTest {
    public static void main(String[] args){
        Repository repo = new Repository();
        for(Iterator it = repo.getIterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
