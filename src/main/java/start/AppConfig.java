package start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}