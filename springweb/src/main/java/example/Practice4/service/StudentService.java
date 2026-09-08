package example.practice4.service;

import org.springframework.stereotype.Service;

import example.practice4.model.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class StudentService {
    public final StudentRepository studentRepository;

}
