package realone;

import interone.IACT;
import mainone.Animal;

//继承父类,连接接口
public class Bear extends Animal implements IACT {
	//继承父类属性的无参构造函数
    public Bear() {
    	super();
    }
	
	//接口方法
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "挽着花篮，打着雨伞，直立走秀";
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		Bear b = new Bear();
		b.setName("Bill");
		b.setAge(1);
		System.out.println("表演者："+b.getName()+"\n年龄："+b.getAge()+"岁"+"\n技能："+b.skill()+"\n爱好："+b.love());
		
	}

	//继承方法
	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢卖萌";
	}

}
