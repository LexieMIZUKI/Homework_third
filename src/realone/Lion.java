package realone;

import interone.IACT;
import mainone.Animal;

//�̳и���,���ӽӿ�
public class Lion extends Animal implements IACT {
	//�������ԣ���ɫ���Ա�
	private String color;
	private String sex;
	//�޲ι��캯��
	public Lion() {}
	//�̳и�������Ե��вι��캯��
	public Lion(String color, String sex) {
		super();
		this.color = color;
		this.sex = sex;
	}
	//���Ե�set/get
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
	
	//�ӿڷ���
	@Override
	public String skill() {
		return "�ó����Ȧ";
		// TODO Auto-generated method stub
		
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		Lion l = new Lion("��ɫ","��ʨ");
		l.setName("Lain");
		l.setAge(2);
		System.out.println("�����ߣ�"+l.getName()+"\n���䣺"+l.getAge()+"��"+"\n�Ա�"+l.getSex()+"\nëɫ��"+l.getColor()+"\n���ܣ�"+l.skill()+"\n���ã�"+l.love());
		
	}
	//�̳з���
	@Override
	public String love() {
		return "ϲ���Ը�������";
		// TODO Auto-generated method stub
		
	}
	
}
