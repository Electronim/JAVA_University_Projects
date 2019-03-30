package tasks.task2;

import tasks.task2.auth.Authenticable;
import tasks.task2.customer.Customer;
import tasks.task2.customer.CustomerDetails;
import tasks.task2.model.User;
import tasks.task2.services.UserService;

import java.util.Date;

public class Main {
    public static void main(String args[]) {
        Date dateOfBirth = new Date(98, 9, 8);
        CustomerDetails CD = new CustomerDetails("Milestii Mici", "007", dateOfBirth);
        // System.out.println(CD.getCnp() + " " + CD.getLocation() + " " + CD.getDateOfBirth());

        User U = new User("Sandu", "Petrasco", dateOfBirth);
        U.setUserName("GODzilla");
        U.setHashPassword("sjadbahdkj1231jhsda1");
        // System.out.println(U.getUserName() + " " + U.getHashPassword() + " " + U.getToken());

        Customer C = new Customer(CD, "Sandu", "Petrasco");
        C.setUserName("GODzilla");
        C.setHashPassword("skhabdksdb1238sajd91823kjhasd");

        System.out.println("CNP:" + " " + C.getCustomerDetails().getCnp());
        System.out.println("Locatia:" + " " + C.getCustomerDetails().getLocation());
        System.out.println("Data de nastere:" + " " + C.getCustomerDetails().getDateOfBirth());
        System.out.println("Username:" + " " + C.getUserName());
        System.out.println("Hash parola:" + " " + C.getHashPassword());

        UserService US = new UserService();
        System.out.println(US.checkDefToken(C));

        System.out.println(Authenticable.passwordHashing("abcdefg"));
        System.out.println(U.greetingMessage());
    }
}
