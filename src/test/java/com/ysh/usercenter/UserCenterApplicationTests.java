package com.ysh.usercenter;

import com.ysh.usercenter.entity.User;
import com.ysh.usercenter.mapper.UserMapper;
/**
 * spring-boot-starter-test自带junit
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

}
