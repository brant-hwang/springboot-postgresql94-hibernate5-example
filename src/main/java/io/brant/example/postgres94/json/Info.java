package io.brant.example.postgres94.json;

public class Info {

	private String address;

	private int age;

	private String educations;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducations() {
		return educations;
	}

	public void setEducations(String educations) {
		this.educations = educations;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Info info = (Info) o;

		if (age != info.age) return false;
		if (address != null ? !address.equals(info.address) : info.address != null) return false;
		return !(educations != null ? !educations.equals(info.educations) : info.educations != null);

	}

	@Override
	public int hashCode() {
		int result = address != null ? address.hashCode() : 0;
		result = 31 * result + age;
		result = 31 * result + (educations != null ? educations.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Info{" +
				"address='" + address + '\'' +
				", age=" + age +
				", educations='" + educations + '\'' +
				'}';
	}
}
