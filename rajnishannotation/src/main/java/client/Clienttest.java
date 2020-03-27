package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import accountservice.Accountservice;
import model.Account;

public class Clienttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Bean.xml");
Accountservice accountserviceimpl= ctx.getBean("accountservice", accountservice.Accountserviceimpl.class);
accountserviceimpl.showAccountDetails(new Account(100,87500));
ctx.close();
	}

}
