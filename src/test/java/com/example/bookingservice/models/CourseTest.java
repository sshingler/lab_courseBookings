package com.example.bookingservice.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    Course course;
    Customer customer;
    Booking booking1;
    Booking booking2;

    @BeforeEach
    public void setup(){
        customer = new Customer("Dave", "Conwy", 33);
        course = new Course("Climbing for beginners", "Betws-y-Coed", 3);
        booking1 = new Booking("01-05-23", course, customer);
        booking2 = new Booking("03-05-23", course, customer);
        course.addBookings(booking1, booking2);
    }

    @Test
    public void hasName() {
        assertEquals("Climbing for beginners", course.getName());
    }

    @Test
    public void hasBookings(){
        assertEquals(2, course.getBookings().size());
    }
}
