package Prototype;

public class PrototypeTest {
    public static void main(String[] args){
        WorkerDatabase db = new WorkerDatabase();
        Worker w1 = new Worker(1,"John","Doe");
        Worker w2 = new Worker(2,"Jan","Kowalski");
        Worker w3 = new Worker(3,"Martin","Smith");

        db.add(w1);
        db.add(w2);
        db.add(w3);

        db.listWorkers();

        WorkerDatabase clonedDB = (WorkerDatabase) db.clone();
        clonedDB.listWorkers();
    }
}
