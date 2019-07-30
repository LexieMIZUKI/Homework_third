package realone;

import interone.IACT;
import mainone.Animal;

//继承父类,连接接口
public class Lion extends Animal implements IACT {
	//新增属性：颜色，性别
	private String color;
	private String sex;
	//无参构造函数
	public Lion() {}
	//继承父类的属性的有参构造函数
	public Lion(String color, String sex) {
		super();
		this.color = color;
		this.sex = sex;
	}
	//属性的set/get
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//接口方法
	@Override
	public String skill() {
		return "擅长钻火圈";
		// TODO Auto-generated method stub
		
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		Lion l = new Lion("灰色","公狮");
		l.setName("Lain");
		l.setAge(2);
		System.out.println("表演者："+l.getName()+"\n年龄："+l.getAge()+"岁"+"\n性别："+l.getSex()+"\n毛色："+l.getColor()+"\n技能："+l.skill()+"\n爱好："+l.love());
		
	}
	//继承方法
	@Override
	public String love() {
		return "喜欢吃各种肉类";
		// TODO Auto-generated method stub
		
	}
	
}
