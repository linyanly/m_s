package com.lin.sprint_boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SprintBootApplicationTests.class)
public class SprintBootApplicationTests {

	@Test
	public void contextLoads() {
		BigDecimal a = new BigDecimal(1.151);
		BigDecimal b = new BigDecimal(1.151);
		BigDecimal add = a.add(b);
		add.toString();
		System.out.println(add);
	}


}
