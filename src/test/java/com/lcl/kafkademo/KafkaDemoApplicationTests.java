package com.lcl.kafkademo;

import com.alibaba.fastjson.JSON;
import com.lcl.kafkademo.entity.User;
import com.lcl.kafkademo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import javax.annotation.Resource;

@SpringBootTest
class KafkaDemoApplicationTests {
    private final static Logger logger = LoggerFactory.getLogger(KafkaDemoApplicationTests.class);
    @Autowired
    private UserMapper userMapper;

    @Resource
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Test
    public void test(){
        for (User user : userMapper.selectList(null)) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void test1(){
        String str = "test123";
        //KafkaTemplate调用send时默认采用异步发送，如果需要同步获取发送结果，调用get方法
        kafkaTemplate.send("test", JSON.toJSON(str));
    }

    @Test
    public void testLog1(){
        for (int i=0;i<5;i++){
            logger.info("这是一条数据"+i);
        }
    }

    @Test
    public void testLog2(){
        logger.info("测试{}输出","日志");
    }

}
