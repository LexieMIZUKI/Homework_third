package realone;

import interone.IACT;
import mainone.Animal;

//�̳и���,���ӽӿ�
public class Monkey extends Animal implements IACT{
	//�������ԣ�Ʒ��
	private String type;
	//�޲ι��캯��
	public Monkey() {}
	//���ι��캯��
	public Monkey(String type) {
		super();
		this.type = type;
	}
	//���Ե�set/get
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	//�ӿڷ���
	@Override
	public String skill() {
		return "����ֳ�����ľ��";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Monkey m = new Monkey("��˿��");
		m.setName("Tom");
		m.setAge(1);
		System.out.println("�����ߣ�"+m.getName()+"\n���䣺"+m.getAge()+"��"+"\nƷ�֣�"+m.getType()+"\n���ܣ�"+m.skill()+"\n���ã�"+m.love());
		
	}
	//�̳з���
	@Override
	public String love() {
		return "ϲ��ģ�±��˵Ķ�������";
		// TODO Auto-generated method stub
		
	}
	
}
