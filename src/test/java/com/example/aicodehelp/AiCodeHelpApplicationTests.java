package com.example.aicodehelp;

import com.example.aicodehelp.ai.AiCodeHelper;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelpApplicationTests {

    @Resource
    private AiCodeHelper aiCodeHelper;

    @Test
    void chat() {
        aiCodeHelper.chat("你好，我是程序员");
    }

    @Test
    void chatWithMessage(){
        UserMessage userMessage=UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://n.sinaimg.cn/sinacn10116/600/w1920h1080/20190326/2c30-hutwezf6832339.jpg")
        );
        aiCodeHelper.chatWithMessage(userMessage);

    }

}
