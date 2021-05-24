package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

	I18nController i18nController = (I18nController) ctx.getBean("i18nController");

	System.out.println(i18nController.sayHello());

	MyController myController = (MyController) ctx.getBean("myController");

	System.out.println("------- Primary Bean");
	System.out.println(myController.sayHello());

	System.out.println("------- Property");

	PropertyInjectedController propertyInjectedcontroller = (PropertyInjectedController) ctx
		.getBean("propertyInjectedController");

	System.out.println(propertyInjectedcontroller.getGreeting());

	System.out.println("------- Setter");

	SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
		.getBean("setterInjectedController");

	System.out.println(setterInjectedController.getGreeting());

	System.out.println("------- Constructor");

	ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
		.getBean("constructorInjectedController");

	System.out.println(constructorInjectedController.getGreeting());
    }

}
