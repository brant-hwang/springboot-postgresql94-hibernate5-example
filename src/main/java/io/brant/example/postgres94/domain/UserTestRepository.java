package io.brant.example.postgres94.domain;

import io.brant.example.postgres94.json.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTestRepository extends JpaRepository<UserTest, Long> {

	List<UserTest> findByInfo(Info info);
}
