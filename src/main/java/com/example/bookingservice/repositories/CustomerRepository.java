package com.example.bookingservice.repositories;


import com.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllBookingsCourseID(Long courseId);
    List<Customer> findAllByTownAndBookingsCourseID(String town, Long courseId);

//    List<Customer>findAllByTownAndAgeGreaterThan
}
