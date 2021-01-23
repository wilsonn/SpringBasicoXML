package com.whnm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whnm.model.Persona;
import com.whnm.service.IPersonaService;

public class App {

	public static void main(String[] args) {
		
//		IPersonaService service = new PersonaServiceImpl();
//		service.crear();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPersonaService service =  (IPersonaService) context.getBean("personaService");
		service.crear();
		
		Persona per = (Persona) context.getBean("persona");
		
		System.out.println(per);
		((ConfigurableApplicationContext)context).close();
	}

}
