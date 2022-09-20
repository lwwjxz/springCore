package beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        GenericBeanDefinition parentBeanDefinition = new GenericBeanDefinition();
        parentBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        parentBeanDefinition.setAttribute("na13m1e", "co13de1bear");
        parentBeanDefinition.setAbstract(true);
        parentBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue(1);
        parentBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue("CodeBear");

        GenericBeanDefinition childBeanDefinition = new GenericBeanDefinition();
        childBeanDefinition.setParentName("parent");
        childBeanDefinition.setBeanClass(ChildService.class);

        context.registerBeanDefinition("parent", parentBeanDefinition);
        context.registerBeanDefinition("child", childBeanDefinition);

        context.refresh();

        BeanDefinition child = context.getBeanFactory().getMergedBeanDefinition("child");
        for (String s : child.attributeNames()) {
            System.out.println(s + ":" + child.getAttribute(s));
        }
        System.out.println("scope:" + child.getScope());

        System.out.println("-------------------");

        ChildService service = context.getBean(ChildService.class);
        System.out.println(service.getName());
        System.out.println(service.getId());
    }
}
