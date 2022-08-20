package com.zzx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzx.domain.Admin;

/**
* @author ZZX
* @description 针对表【tbl_admin】的数据库操作Mapper
* @createDate 2022-07-18 11:02:22
* @Entity com.zzx.domain.Admin
*/
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
