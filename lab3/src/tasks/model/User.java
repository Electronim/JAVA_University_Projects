package tasks.model;

public class User {
    private Integer id;
    private String username;
    private String password;

    public User() {

    }

    public User(Integer _id, String _username, String _password) {
        id = _id;
        username = _username;
        password = _password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
