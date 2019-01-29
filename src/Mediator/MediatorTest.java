package Mediator;

public class MediatorTest {
    public static void main(String[] args){
        Mediator chatMediator = new MediatorImpl();
        User tom = new UserImpl("Tom",chatMediator);
        User simon = new UserImpl("Simon",chatMediator);
        User kate = new UserImpl("Kate",chatMediator);

        chatMediator.addUser(simon);
        chatMediator.addUser(kate);

        tom.sendMessage("Hi!");
    }
}
