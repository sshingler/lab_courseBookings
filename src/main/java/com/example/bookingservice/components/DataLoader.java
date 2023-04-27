package com.example.bookingservice.components;

import com.example.bookingservice.models.Booking;
import com.example.bookingservice.models.Course;
import com.example.bookingservice.models.Customer;
import com.example.bookingservice.repositories.BookingRepository;
import com.example.bookingservice.repositories.CourseRepository;
import com.example.bookingservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Kayaking for beginners", "Llangollen", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Climbing for beginners", "Betws-y-Coed", 3);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Dave", "Conwy", 33);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Roger", "Llanberris", 31);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("01-05-23", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("03/05/23", course2, customer2);
        bookingRepository.save(booking2);


    }
}
