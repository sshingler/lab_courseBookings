package com.example.bookingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="name")
    private String name;
    @Column (name="town")
    private String town;
    @Column (name="rating")
    private int rating;

    @JsonIgnoreProperties({"course"})
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Course(String name, String town, int starRating){
        this.name = name;
        this.town = town;
        this.rating = starRating;
        this.bookings = new ArrayList<>();
    }


    public Course (){

    }

    public Long getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void addBookings(Booking ...bookings) {
        this.bookings.addAll(List.of(bookings));
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
