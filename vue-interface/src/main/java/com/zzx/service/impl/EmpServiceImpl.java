package com.zzx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzx.domain.Emp;
import com.zzx.service.EmpService;
import com.zzx.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author ZZX
* @description 针对表【tbl_emp】的数据库操作Service实现
* @createDate 2022-07-16 23:25:23
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
implements EmpService{

}
