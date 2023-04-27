package com.example.bookingservice;

import com.example.bookingservice.models.Course;
import com.example.bookingservice.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingserviceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createCourse(){
		Course kayakingForBeginners = new Course("Kayaking for beginners", "Llangollen", 3);
		courseRepository.save(kayakingForBeginners);
	}

}
