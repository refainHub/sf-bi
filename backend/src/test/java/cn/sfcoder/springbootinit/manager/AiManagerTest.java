package cn.sfcoder.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: refain
 * @Description:
 * @Date: 2024/1/27 17:34
 * @Version: 1.0
 */
@SpringBootTest
class AiManagerTest {

    @Resource
    private  AiManager aiManager;
    @Test
    void doChart() {
        String answer = aiManager.doChat(1651468516836098050L,"邓紫棋");
        System.out.println(answer);

    }
}