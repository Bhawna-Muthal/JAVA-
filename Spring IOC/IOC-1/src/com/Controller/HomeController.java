package com.Controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.entity.Student;

public class HomeController {

	public static void main(String[] args) {

		// core Container -> BeanFactory.

//		what is Meant By Container ? -> It reads XMLconf. It Creates Beans , It maintains Beans LifeCycle And after completion of work it will destroy bean.

	Resource resource = new ClassPathResource("beans.xml");

		BeanFactory bf = new XmlBeanFactory(resource);

		Student student = (Student) bf.getBean("stu");

		student.studentDetails();

		// J2EE contianer -> ApplicationContext.

//		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
//		Student bean = apc.getBean("stu", Student.class);
//		bean.studentDetails();

	}

}
