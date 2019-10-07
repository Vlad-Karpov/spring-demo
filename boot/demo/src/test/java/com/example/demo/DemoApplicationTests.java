package com.example.demo;

import com.example.demo.hello.ConsoleHelloService;
import com.example.demo.hello.HelloAutoConfiguration;
import com.example.demo.hello.HelloService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoApplicationTests {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	private final ApplicationContextRunner contextRunner = new ApplicationContextRunner().withConfiguration(AutoConfigurations.of(HelloAutoConfiguration.class));

	@Test
	public void contextLoads() {
	}

	@Test
	public void defaultServiceAutoConfigured() {
		this.contextRunner
				.withPropertyValues("hello.prefix=Test")
				.run(context -> {
			assertThat(context).hasSingleBean(HelloService.class);
			context.getBean(HelloService.class).sayHello("World");
			assertThat(outputCapture.toString()).contains("Test World!");
		});
	}

	@Test
	public void userServiceAutoConfigured() {
		this.contextRunner
				.withUserConfiguration(UserConfiguration.class)
				.run(context -> {
			assertThat(context).hasSingleBean(HelloService.class);
			context.getBean(HelloService.class).sayHello("Works");
			assertThat(outputCapture.toString()).contains("Mine Works**");
		});
	}

	@Test
	public void defaultServiceIsNotAutoConfiguredIfPrefixIsMissing() {
		this.contextRunner.run(context -> {
			assertThat(context).hasSingleBean(HelloService.class);
		});
	}

	@Test
	public void defaultServiceIsNotAutoConfiguredWithWrongPrefix() {
		this.contextRunner
				.withPropertyValues("hello.prefix=booo")
				.run(context -> {
			assertThat(context).hasSingleBean(HelloService.class);
		});
	}

	@Configuration
	static class UserConfiguration {
		@Bean
		public ConsoleHelloService myConsoleHelloService() {
			return new ConsoleHelloService("Mine", "**");
		}
	}

}
