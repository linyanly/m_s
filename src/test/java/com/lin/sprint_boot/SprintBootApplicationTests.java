package com.lin.sprint_boot;


import com.lin.ms.Common.utils.SpringUtils;
import com.lin.ms.SprintBootApplication;
import com.lin.ms.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SprintBootApplication.class)
public class SprintBootApplicationTests {


    @Autowired
    IUserService userService;


	@Test
	public void contextLoads() {
		BigDecimal a = new BigDecimal(1.151);
		BigDecimal b = new BigDecimal(1.151);
		BigDecimal add = a.add(b);
		add.toString();
		System.out.println(add);
	}

	@Test
	public void printAbc(){
	    String str = "baddefcc";
        String[] strArr = str.split("");
        List<String> newStrArr = new ArrayList<>();
        Arrays.sort(strArr);
        System.out.println(strArr.length);
        for(int i = 0;i < strArr.length;i++){
            int count = 0;
            for(int j = 0;j < strArr.length;j++){
                if(i == j){
                    continue;
                }
                if(strArr[i].equals(strArr[j])){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("====>" + strArr[i]);
                newStrArr.add(strArr[i]);
            }

        }
        System.out.println("******" + newStrArr.get(newStrArr.size() - 1));
    }

    @Test
    public void test2(){
	    int a = 2;
        int b = ++a;
        System.out.println("------" + a);
        System.out.println("------" + b);

    }


    @Test
    public void test3(){
        userService.fuckAspect("for future");
    }






}
