package tasks.task2.customer;

import tasks.task2.model.User;

public class Customer extends User {
    CustomerDetails customerDetails;

    public Customer() {}

    public Customer(CustomerDetails customerDetails, String firstName, String lastName) {
        super(firstName, lastName, customerDetails.getDateOfBirth());
        this.customerDetails = customerDetails;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }
}
