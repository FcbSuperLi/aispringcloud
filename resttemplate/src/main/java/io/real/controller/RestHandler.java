package io.real.controller;


import io.real.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@RequestMapping("/rest")
@RestController
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }


    @GetMapping("/findById")
    public Student getBuId(@RequestParam Long id){
        System.out.println("有趣");
        return restTemplate.getForEntity("http://localhost:8010/student/findById?id="+id,Student.class,id).getBody();
    }

    @PostMapping("/save")
    public void Save(@RequestBody Student student){
       restTemplate.postForEntity("http://localhost:8010/student/save",student,null);
    }


    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        restTemplate.delete("http://localhost:8010/student/delete?id="+id,null,id);

    }




}
