package com.zbl.rabbitmq;

import com.zbl.rabbit.many.NeoSender;
import com.zbl.rabbit.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private NeoSender zblSender;

	@Autowired
	private NeoSender2 zblSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			zblSender.send(i);
		}
	}

	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			zblSender.send(i);
			zblSender2.send(i);
		}
	}

}