package corespring;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Resource r = new ClassPathResource("applicationContext.xml");
     BeanFactory bean = new XmlBeanFactory(r);
     Student st = (Student) bean.getBean("studentbean");
     st.displayInfo();
     Employee e = (Employee) bean.getBean("e");
     e.show();
	}

}
