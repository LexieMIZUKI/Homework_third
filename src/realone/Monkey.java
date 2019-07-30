package realone;

import interone.IACT;
import mainone.Animal;

//继承父类,连接接口
public class Monkey extends Animal implements IACT{
	//新增属性：品种
	private String type;
	//无参构造函数
	public Monkey() {}
	//带参构造函数
	public Monkey(String type) {
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
		return "骑独轮车过独木桥";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Monkey m = new Monkey("金丝猴");
		m.setName("Tom");
		m.setAge(1);
		System.out.println("表演者："+m.getName()+"\n年龄："+m.getAge()+"岁"+"\n品种："+m.getType()+"\n技能："+m.skill()+"\n爱好："+m.love());
		
	}
	//继承方法
	@Override
	public String love() {
		return "喜欢模仿别人的动作表情";
		// TODO Auto-generated method stub
		
	}
	
}
