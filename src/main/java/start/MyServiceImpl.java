package start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyServiceImpl implements MyService{

    @Autowired
    private ConfigurableEnvironment configurableEnvironment;

    @Override

    public void printHelloWorld() {
        System.out.println(configurableEnvironment.getSystemProperties());
        System.out.println("helloWorld");
    }
}
