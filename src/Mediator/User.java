package Mediator;

public abstract class User {
    String name;
    Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void sendMessage(String message);
    abstract void receiveMessage(String message);
}
