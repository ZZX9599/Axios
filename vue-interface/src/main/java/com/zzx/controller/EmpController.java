package com.zzx.controller;

import com.zzx.domain.Emp;
import com.zzx.service.EmpService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ZZX
 * @Date: 2022/7/16 23:32
 */

@RestController
@CrossOrigin
@RequestMapping("/emps")
public class EmpController {

    @Resource
    private EmpService empService;

    @GetMapping("/list")
    public List<Emp> list(){
        List<Emp> list = empService.list();
        return list;
    }

    @GetMapping("get/{id}")
    public Emp getById(@PathVariable("id") Integer id){
        Emp emp = empService.getById(id);
        return emp;
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        empService.removeById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Emp emp){
        Integer id = emp.getId();
        if (StringUtils.isEmpty(id)) {
            empService.save(emp);
        }else {
            empService.updateById(emp);
        }
    }
}
