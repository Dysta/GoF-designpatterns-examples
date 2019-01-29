package Mediator;

public class UserImpl extends User {

    public UserImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println(name + " send message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
