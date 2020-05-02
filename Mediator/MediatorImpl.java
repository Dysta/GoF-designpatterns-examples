package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    private List<User> users;

    public MediatorImpl(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User u:users) {
            if(u != sender){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
