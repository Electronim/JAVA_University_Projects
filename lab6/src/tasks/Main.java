package tasks;

import tasks.model.User;

public class Main {
    private static void performAuth(User user) {
        try {
            user.performAuthentication();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        User user = new User(User.AuthType.DB);
        performAuth(user);

        user.setAuthType(User.AuthType.LDAP);
        performAuth(user);

        user.setAuthType(User.AuthType.DEFAULT);
        performAuth(user);
    }
}
