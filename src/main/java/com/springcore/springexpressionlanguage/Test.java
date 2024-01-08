package com.springcore.springexpressionlanguage;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springexpressionlanguage/spelconfig.xml");
	 
	 Demo d1 = context.getBean("demo",Demo.class);
	 System.out.println(d1);
	 
	 SpelExpressionParser temp = new SpelExpressionParser();
    	
	 System.out.println(temp.parseExpression("33+44").getValue());
	}

}
