package com.lcl.kafkademo;

import com.lcl.kafkademo.entity.User;
import com.lcl.kafkademo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaDemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        for (User user : userMapper.selectList(null)) {
            System.out.println(user.toString());
        }
    }

}
