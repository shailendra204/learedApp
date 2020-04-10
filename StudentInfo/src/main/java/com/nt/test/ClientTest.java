package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.bean.StudentVo;
import com.nt.service.StudentService;

public class ClientTest {

	public static void main(String[] args) {
		StudentService stv1=null;
		BeanFactory factory=null;
		StudentVo stv=new StudentVo();
		stv.setName("shailendra");
		stv.setId(12345);
		stv.setFee(2000.9f);
		stv.setCourse("java");
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cgfs/applicationContext.xml"));
		stv1=factory.getBean("stserv", StudentService.class);
		System.out.println(stv1.getInfo(stv));

	}

}
