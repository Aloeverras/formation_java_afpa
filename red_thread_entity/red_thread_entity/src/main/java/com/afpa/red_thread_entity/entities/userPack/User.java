package com.afpa.red_thread_entity.entities.userPack;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name="id", unique = true, length = 3)
    private Long id;
    @Column(name="age", length = 2)
    private Byte age;
    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;
    @Column(name = "nationality", nullable = false, length = 50)
    private String nationality;
    @Column(name = "gender", nullable = false, length = 50)
    private String gender;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "dateOfBirthe", nullable = false, length = 50)
    private LocalDate dateOfBirth;
    @Column(name = "phoneNumber", nullable = false, length = 50)
    private String phoneNumber;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
