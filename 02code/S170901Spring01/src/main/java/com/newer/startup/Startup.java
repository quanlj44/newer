package com.newer.startup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newer.service.IWalkService;

public class Startup {

	public static void main(String[] args) {
		//获得IoC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:config/appCtx-*.xml");
		
		//通过IoC容器获得对应的Bean
		//IWalkService iwalk=ctx.getBean(IWalkService.class);
		IWalkService iwalk=ctx.getBean("iwalkSvr",IWalkService.class);
		
		//调用Bean中的方法
		iwalk.walk("王芳");

	}

}
