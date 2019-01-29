package Mediator;

public interface Mediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
