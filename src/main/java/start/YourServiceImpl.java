package start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class YourServiceImpl implements YourService{

    @Autowired
    private ConfigurableEnvironment configurableEnvironment;

    @Override

    public void printHelloWorld() {
        System.out.println(configurableEnvironment.getSystemProperties());
        System.out.println("YourService Hello World");
    }
}
