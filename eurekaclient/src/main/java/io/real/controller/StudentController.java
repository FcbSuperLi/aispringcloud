package io.real.controller;

import io.real.entity.Student;
import io.real.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
       return service.findAll();
    }

    @GetMapping("/findById")
    public Student findById(@RequestParam Long id){
        return service.findById(id);
    }


    @PostMapping("/save")
    public void Save(@RequestBody Student student){
         service.saveByOne(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        service.updateByOne(student);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        service.deleteByOne(id);
    }


    @GetMapping("/index")
    public String index(){
        return "当前的端口:"+this.port;
    }





}
