package tasks.task2.services;

import tasks.task2.auth.Authenticable;

public class UserService {
    public Boolean checkDefToken(Authenticable auth) {
        return auth.getToken().equals("TEST");
    }
}
