package kaigee.top;

import org.babyfish.jimmer.client.EnableImplicitApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableImplicitApi
public class KaigeBoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaigeBoxApplication.class, args);
    }

}
