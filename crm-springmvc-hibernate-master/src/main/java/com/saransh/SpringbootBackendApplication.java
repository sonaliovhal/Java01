package com.saransh;

import com.saransh.entity.Customer;
import com.saransh.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 class Main {

    public static void main(String[] args) {
        // Initialize the Spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.saransh"); // Scan for components in the specified package
        context.refresh(); // Refresh the application context to initialize beans

        // Retrieve and use beans as needed
        // For example:
         CustomerService customerService = context.getBean(CustomerService.class);
         Customer customer = new Customer("John", "Doe", "john.doe@example.com");
         customerService.addCustomer(customer);

        // Close the application context when done
        context.close();
    }
}
