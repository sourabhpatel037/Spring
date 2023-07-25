package maccess;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("C:\\Users\\Sourabh Patel\\eclipse-workspace\\Spring1\\beans.xml\\beans.xml");
				
				Object obj = beanFactory.getBean("addr");
				Address address = (Address) obj;
				address.printAddress();
				System.out.println(address);
				System.out.println(address.hashCode());
				
				Object productObj =  beanFactory.getBean("product");
				Product p = (Product)productObj;
				System.out.println(p);

	}

}
