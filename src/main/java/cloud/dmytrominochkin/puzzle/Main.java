package cloud.dmytrominochkin.puzzle;

import cloud.dmytrominochkin.puzzle.service.ArithmeticService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println("ArithmeticService output:");

        ArithmeticService arithmeticService = (ArithmeticService) appContext.getBean("arithmeticService");

        System.out.println("result: " + arithmeticService.function(3, 2, 1));

        System.out.println();

        System.out.println("ExtraFastArithmeticService output:");

        ArithmeticService extraFastArithmeticService = (ArithmeticService) appContext.getBean("extraFastArithmeticService");

        System.out.println("result: "+extraFastArithmeticService.function(3, 2, 1));


        //Question 1: Why are outputs different for services if implementations are the same?
        //Question 2: How to fix output?
        //Question 3: Which alternatives can be used to achieve @LogPerformance functionality?
    }
}

