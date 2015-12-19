package io.brant.example.postgres94;

import io.brant.example.postgres94.domain.UserTest;
import io.brant.example.postgres94.domain.UserTestRepository;
import io.brant.example.postgres94.domain.UserTestService;
import io.brant.example.postgres94.json.Info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootHibernate5Postgres94ExampleApplication.class)
public class SpringBootHibernate5Postgres94ExampleApplicationTests {

	@Autowired
	private UserTestService testService;

	@Autowired
	private UserTestRepository userTestRepository;

	@Test
	public void saveTest() {
		UserTest userTest = new UserTest();

		Info info = new Info();
		info.setAddress("Seoul");
		info.setAge(27);
		info.setEducations("CS");

		userTest.setTest("testValue");
		userTest.setInfo(info);

		testService.save(userTest);
	}

	@Test
	public void findTest() {
		Info info = new Info();
		info.setAddress("Seoul");
		info.setAge(27);
		info.setEducations("CS");

		List<UserTest> userTestList = userTestRepository.findByInfo(info);

		userTestList.stream().forEach(System.out::println);
	}
}
