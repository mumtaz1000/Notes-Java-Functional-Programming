package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer shereen = new Customer("Shereen", "99999");
        greetCustomerConsumer.accept(shereen);
        greetCustomerBiConsumer.accept(shereen,false);
    }

    static BiConsumer<Customer,Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+
            ", thanks for registering phone number "+
                    (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "+customer.customerName+
            ", thanks for registering phone number "+
            customer.customerPhoneNumber);
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+
                ", thanks for registering phone number"+
                customer.customerPhoneNumber);

    }
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
