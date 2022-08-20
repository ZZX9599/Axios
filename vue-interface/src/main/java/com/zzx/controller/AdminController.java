package com.zzx.controller;

import com.zzx.domain.Admin;
import com.zzx.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: ZZX
 * @Date: 2022/7/18 11:03
 */

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin){
        Admin byUserAndPwd = adminService.getByUserAndPwd(admin);
        return byUserAndPwd;
    }
}
