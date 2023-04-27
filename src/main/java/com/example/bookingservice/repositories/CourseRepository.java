package com.example.bookingservice.repositories;
import com.example.bookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByStarRating (int rating);
    List<Course> findAllByBookingsCustomerId(Long customerId);

}
