package realone;

import interone.IACT;
import mainone.Animal;

//�̳и���,���ӽӿ�
public class Parrot extends Animal implements IACT{
	//�������ԣ�Ʒ�֣��ͺ�����һ����
	private String type;
	//�޲ι��캯��
	public Parrot() {}
	//�̳и������ԵĴ��ι��캯��
	public Parrot(String type) {
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
		return "�ó�ģ��";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Parrot p = new Parrot("ĵ������");
		p.setName("Rose");
		p.setAge(1);
		System.out.println("�����ߣ�"+p.getName()+"\n���䣺"+p.getAge()+"��"+"\nƷ�֣�"+p.getType()+"\n���ܣ�"+p.skill()+"\n���ã�"+p.love());
		
	}
	//�̳з���
	@Override
	public String love() {
		return "ϲ���Լ��������";
		// TODO Auto-generated method stub
		
	}
	
}
