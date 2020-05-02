package Prototype;

import java.util.ArrayList;
import java.util.List;

public class WorkerDatabase implements Cloneable{
    private List<Worker> workers;

    public WorkerDatabase(){
        workers = new ArrayList<>();
    }

    public WorkerDatabase(List<Worker> list){
        workers = list;
    }

    public void add(Worker w){
        workers.add(w);
    }

    public void remove(Worker w){
        workers.remove(w);
    }

    public void listWorkers(){
        for (Worker w: workers){
            System.out.println(w.getFirstName()+" "+w.getLastName());
        }
        System.out.println();
    }

    @Override
    protected Object clone(){
        List<Worker> workers = new ArrayList<>(this.workers);
        return new WorkerDatabase(workers);
    }
}
