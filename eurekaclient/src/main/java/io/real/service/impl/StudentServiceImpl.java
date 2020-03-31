package io.real.service.impl;

import io.real.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentServiceImpl implements StudentService{
    public static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",18));
        studentMap.put(2L,new Student(2L,"赵飞",22));
        studentMap.put(3L,new Student(3L,"吕佳力",26));
        studentMap.put(4L,new Student(4L,"赵飞女朋友",30));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveByOne(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteByOne(Long id) {
        studentMap.remove(studentMap.remove(id));
    }

    @Override
    public void updateByOne(Student student) {
        studentMap.put(student.getId(),student);
    }


}
