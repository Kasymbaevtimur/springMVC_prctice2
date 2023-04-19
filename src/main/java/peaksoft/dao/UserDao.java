package peaksoft.dao;

import org.springframework.stereotype.Component;
import peaksoft.config.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDao {

    List<User> users;
    {
        users = new ArrayList<>();
        users.add(new User(1,"Timurlan","Kasymbaev"));
        users.add(new User(2,"Saidibakas","Satybaldiev"));
        users.add(new User(3,"Jumagul","Borubaeva"));

    }
    public List<User> getAllUser(){
        return users;
    }
    public User getUser(int id){
        User user=null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId()==id){
                user=users.get(i);
            }

        }
        return user;
    }


}
