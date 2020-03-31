package io.real.service.impl;

import io.real.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface StudentService {

    public Collection<Student> findAll();

    public Student findById(Long id);

    public void saveByOne(Student student);

    public void deleteByOne(Long id);

    public void updateByOne(Student student);

}
