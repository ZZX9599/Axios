package com.zzx;

import com.zzx.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class VueInterfaceApplicationTests {

    @Resource
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        empMapper.selectList(null);
    }
}
