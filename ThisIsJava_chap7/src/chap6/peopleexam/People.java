package chap6.peopleexam;

public class People {
	private String name;
	private String ssn;

	public People() {
	}

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}
}
