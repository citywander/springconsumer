package com.sfsf.spring.cdc.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.sfsf.spring.cdc:producer:+:stubs:8080"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL, repositoryRoot = "pact://")
public class SpringconsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

}

