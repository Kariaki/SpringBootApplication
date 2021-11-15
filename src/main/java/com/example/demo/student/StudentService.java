package com.example.demo.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(new Student(
                1L,"Confidence",
                LocalDate.of(2002, Month.APRIL,5),

                "Kariaki.confidence@gmail.com",
                21
        ));
    }
}
