package com.simple.asyncexams.simple;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRootContextConfig.class)
public class TestFakeNotification {
	@Inject
	NotificationService notiService;
	
	@Test
	public void test(){
		System.out.println("dd");
		assertThat(notiService, is(notNullValue()));
		notiService.sendNotification("subject", "message", null);
	}
}
