package start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = ctx.getBean(MyService.class);
        String[] beanNamesForType = ctx.getBeanNamesForType(MyService.class);
        System.out.println(beanNamesForType.length);
        System.out.println(beanNamesForType[0]);
        MyService myService2 = ctx.getBean("myService", MyService.class);

//        Object myService3 = ctx.getBean("&myService");
        Object myService4 = ctx.getBean("myService");

        System.out.println(myService==myService2);
//        System.out.println(myService==myService3);
        System.out.println(myService==myService4);
//        myService.printHelloWorld();
    }


}
