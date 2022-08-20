package com.zzx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzx.domain.Admin;

/**
* @author ZZX
* @description 针对表【tbl_admin】的数据库操作Service
* @createDate 2022-07-18 11:02:22
*/
public interface AdminService extends IService<Admin> {

    Admin getByUserAndPwd(Admin admin);
}
