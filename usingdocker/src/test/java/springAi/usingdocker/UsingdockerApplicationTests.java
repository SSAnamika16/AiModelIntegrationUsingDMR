package springAi.usingdocker;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsingdockerApplicationTests {

//	@Test
//	void contextLoads() {
//	}

    @Autowired
    private ChatClient chatClient;

    @Test
    public void testChatClient() {
        IO.println("Started testing chat client");

        var query ="Tell me about microservices in 10 lines only?";

//        IO.println("Enter your query");
//        var query = IO.readln();

        var response = this.chatClient
                .prompt()
                .user(query)
                .call()
                .content();
        IO.println(response);

    }

}
