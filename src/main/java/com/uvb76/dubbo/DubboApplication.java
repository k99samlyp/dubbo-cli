package com.uvb76.dubbo;

import com.uvb76.dubbo.service.RadioService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class DubboApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DubboApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"customer.xml"});

        context.start();

        RadioService rs1 = (RadioService) context.getBean("radioService");

        System.out.println("运行结果" + rs1.radioOn());

    }

}
