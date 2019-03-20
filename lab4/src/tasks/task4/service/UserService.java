package tasks.task4.service;

import tasks.task4.model.User;

public class UserService {
    private static User[] listOfUsers = new User[4];

    private static UserService ourInstance = new UserService();

    public static UserService getInstance() {
        return ourInstance;
    }

    private UserService()
    {
        listOfUsers[0] = new User(1, "Ioana", "password");
        listOfUsers[1] = new User(2, "Adelin", "password");
        listOfUsers[2] = new User(3, "Marcu", "password");
        listOfUsers[3] = new User(4, "Doru", "password");
    }

    public User getOne(Integer id) {
        User ans = new User();
        for (int i = 0; i < 4; i++) {
            if (id == listOfUsers[i].getId()) {
                ans = listOfUsers[i];
            }
        }

        return ans;
    }

    public User getOne(String username) {
        User ans = new User();
        for (int i = 0; i < 4; i++) {
            if (username.equals(listOfUsers[i].getUsername())) {
                ans = listOfUsers[i];
            }
        }

        return ans;
    }
}
