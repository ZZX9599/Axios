package com.zzx.controller;

import com.zzx.domain.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: ZZX
 * @Date: 2022/7/16 21:52
 */
@RestController
@RequestMapping("/axios")
@CrossOrigin
public class MyController {

    @GetMapping("/first")
    public String axios01(@RequestParam(value = "id",required = false) Integer id){
        System.out.println(id);
        Student student=new Student();
        student.setName("周志雄");
        student.setAge(20);
        return student.toString();
    }

    @PostMapping("/two")
    public String axios02(@RequestBody Student student){
        return student.toString();
    }
}
