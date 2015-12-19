package io.brant.example.postgres94.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserTestService {

	@Autowired
	private UserTestRepository testRepository;

	@Transactional
	public void save(UserTest test) {
		testRepository.save(test);
	}
}
