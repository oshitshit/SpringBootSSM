package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void getHellow() throws Exception{
		Assert.assertEquals(blogProperties.getName(),"程序猿DD");
		Assert.assertEquals(blogProperties.getTitle(),"Spring Boot教程");
	}

}
