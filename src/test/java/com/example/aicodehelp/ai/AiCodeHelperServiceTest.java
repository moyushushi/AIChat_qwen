package com.example.aicodehelp.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AiCodeHelperServiceTest {

    @Resource
    private AiCodeHelperService aiCodeHelperService;

    @Test
    void chat() {
        String result= aiCodeHelperService.chat("你好我是程序员摸鱼");
        System.out.println(result);
    }
    @Test
    void chatWithMemory() {
        String result= aiCodeHelperService.chat("你好我是程序员，叫摸鱼");
        System.out.println(result);
        System.out.println("*************************************************************");
        result= aiCodeHelperService.chat("你好我是谁来着？");
        System.out.println(result);
    }
}