package tasks.task2.auth;

public interface Authenticable {
    public static final String DEFAULT_TOKEN = "TEST";

    String getUserName();
    String getHashPassword();
    String getToken();

    default String greetingMessage() {
        return "Hi, I'm " + getUserName();
    }

    static String passwordHashing(String password) {
        StringBuffer hash = new StringBuffer();
        int move = 13;
        for (int i = 0; i < password.length(); ++i) {
            hash.append( (char)((password.charAt(i) - 'a' + move) % 26 + 'a') );
        }

        return hash.toString();
    }

}
