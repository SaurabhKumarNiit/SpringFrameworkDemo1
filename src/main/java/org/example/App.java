package org.example;

import org.example.config.Customer;
import org.example.domain.userMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Customer.class);
        userMain data=context.getBean("customer1", userMain.class);
        System.out.println(data);

        AnnotationConfigApplicationContext context2=new AnnotationConfigApplicationContext(Customer.class);
        userMain data2=context2.getBean("customer2", userMain.class);
        System.out.println(data2);

        AnnotationConfigApplicationContext context3=new AnnotationConfigApplicationContext(Customer.class);
        userMain data3=context3.getBean("customer3", userMain.class);
        System.out.println(data3);

    }
}
