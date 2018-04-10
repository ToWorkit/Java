package demo09;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if(age != other.age) {
			return false;
		}
		if(name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Student [name" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student s) {
		int num = this.age - s.age;
		// ������Ϊ��Ҫ����
		return num == 0 ? this.name.compareTo(s.name) : num; 
	}

}
