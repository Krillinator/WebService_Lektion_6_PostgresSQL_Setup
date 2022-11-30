package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student studentBean() {                  // <-- ID for the Bean
        return new Student("Bean_Benny");    // <-- Setting new value for Bean Object
    }

}


