package com.example.test;

import com.example.test.model.User;
import com.example.test.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    /*@Bean
    CommandLineRunner run(UserRepository userRepository){
        return args -> {
            User user1 = User.builder()
                    .username("kardiatouka")
                    .birthdate(LocalDate.of(1991, 2, 10))
                    .country("France")
                    .age(19)
                    .gender("FEMALE")
                    .phoneNumber("422-150-4046")
                    .build();
            User user2 = User.builder()
                    .username("farmataka")
                    .birthdate(LocalDate.of(1993, 1, 8))
                    .country("France")
                    .age(28)
                    .gender("MALE")
                    .phoneNumber("122-150-4045")
                    .build();
            userRepository.save(user1);
            userRepository.save(user2);
        };
    }*/
}
