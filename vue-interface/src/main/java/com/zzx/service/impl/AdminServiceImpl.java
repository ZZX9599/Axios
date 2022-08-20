package com.zzx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzx.domain.Admin;
import com.zzx.service.AdminService;
import com.zzx.mapper.AdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author ZZX
* @description 针对表【tbl_admin】的数据库操作Service实现
* @createDate 2022-07-18 11:02:22
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
implements AdminService{


    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin getByUserAndPwd(Admin admin) {
        return adminMapper.getByUsernameAndPassword(admin.getUsername(),admin.getPassword()).get(0);
    }
}
