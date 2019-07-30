package realone;

import interone.IACT;
import mainone.Animal;

//继承父类,连接接口
public class Parrot extends Animal implements IACT{
	//新增属性：品种（和猴子类一样）
	private String type;
	//无参构造函数
	public Parrot() {}
	//继承父类属性的带参构造函数
	public Parrot(String type) {
		super();
		this.type = type;
	}
	//属性的set/get
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	//接口方法
	@Override
	public String skill() {
		return "擅长模仿";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Parrot p = new Parrot("牡丹鹦鹉");
		p.setName("Rose");
		p.setAge(1);
		System.out.println("表演者："+p.getName()+"\n年龄："+p.getAge()+"岁"+"\n品种："+p.getType()+"\n技能："+p.skill()+"\n爱好："+p.love());
		
	}
	//继承方法
	@Override
	public String love() {
		return "喜欢吃坚果和松子";
		// TODO Auto-generated method stub
		
	}
	
}
