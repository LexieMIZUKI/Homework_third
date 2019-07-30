package realone;

import interone.IACT;
//连接接口
public class Clown implements IACT {
	private String name;
	private int years;
	
	//无参构造函数
	public Clown() {}

	//带参构造函数
	public Clown(String name, int years) {
		this.name = name;
		this.years = years;
	}

	//属性的set/get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	//新增方法
	public String dress() {
		return "身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
		
	}
	//接口方法
	@Override
	public String skill() {
		return "脚踩高跷，进行杂技魔术表演";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Clown c = new Clown("Kahle",5);
		System.out.println("表演者："+c.getName()+"\n艺龄："+c.getYears()+"年"+"\n着装："+c.dress()+"\n技能："+c.skill());
		
	}
}
