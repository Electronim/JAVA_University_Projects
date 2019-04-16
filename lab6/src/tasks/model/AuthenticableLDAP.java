package tasks.model;

public interface AuthenticableLDAP extends Authenticable {
    private void performLDAPAuth() {
        System.out.println("perforfLDAPAuth");
    }

    @Override
    default void performAuthentication() throws Exception{
        performLDAPAuth();
    }
}
