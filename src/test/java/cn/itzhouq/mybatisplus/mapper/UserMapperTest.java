package cn.itzhouq.mybatisplus.mapper;

import cn.itzhouq.mybatisplus.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * @Description: Test
 * @Author: itzhouq
 * @Date: 2020/7/13 23:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {


    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("------ selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}