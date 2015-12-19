package io.brant.example.postgres94.domain;

import io.brant.example.postgres94.json.Info;
import io.brant.example.postgres94.jsonb.types.JSONBUserType;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_test")
@TypeDef(name = "jsonb", typeClass = JSONBUserType.class, parameters = {
		@Parameter(name = JSONBUserType.CLASS, value = "io.brant.example.postgres94.json.Info")})
public class UserTest {

	@Id
	@GeneratedValue
	private Long id;

	private String test;

	@Type(type = "jsonb")
	private Info info;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserTest userTest = (UserTest) o;

		if (id != null ? !id.equals(userTest.id) : userTest.id != null) return false;
		if (test != null ? !test.equals(userTest.test) : userTest.test != null) return false;
		if (info != null ? !info.equals(userTest.info) : userTest.info != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (test != null ? test.hashCode() : 0);
		result = 31 * result + (info != null ? info.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "UserTest{" +
				"id=" + id +
				", test='" + test + '\'' +
				", info=" + info +
				'}';
	}
}
