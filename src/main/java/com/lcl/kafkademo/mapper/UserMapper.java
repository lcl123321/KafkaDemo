package com.lcl.kafkademo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lcl.kafkademo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
