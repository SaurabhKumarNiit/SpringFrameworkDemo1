package org.example.config;

import org.example.domain.userMain;
import org.springframework.context.annotation.Bean;

public class Customer {

    @Bean("customer1")
    public userMain getCustomer_1_Data(){
        return new userMain(7,"Jack","Adam","Jack@gmail.com",7785694152L);

    }
    @Bean("customer2")
    public userMain getCustomer_2_Data(){
        return new userMain(21,"Swag","Adam","swag@gmail.com",7785494152L);

    }
    @Bean("customer3")
    public userMain getCustomer_3_Data(){
        return new userMain(45,"Akash","MoonLight","moon@gmail.com",8785694152L);

    }
}
