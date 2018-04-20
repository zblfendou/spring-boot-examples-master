package com.zbl.web;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zbl.util.NeoProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

	
	@Autowired
    private NeoProperties zblProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(zblProperties.getTitle());
        Assert.assertEquals(zblProperties.getTitle(), "纯洁的微笑");
        Assert.assertEquals(zblProperties.getDescription(), "分享生活和技术");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }

}