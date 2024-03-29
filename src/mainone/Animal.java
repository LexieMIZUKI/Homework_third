package mainone;

//抽象父类
public abstract class Animal {
	//成员属性：昵称，年龄
	private String name;
	private int age;
	
	public Animal() {};
	public Animal(String name, int age) {
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

	//抽象方法：描述爱好
	public abstract String love();
	
}
