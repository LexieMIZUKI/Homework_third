package realone;

import interone.IACT;
//���ӽӿ�
public class Clown implements IACT {
	private String name;
	private int years;
	
	//�޲ι��캯��
	public Clown() {}

	//���ι��캯��
	public Clown(String name, int years) {
		this.name = name;
		this.years = years;
	}

	//���Ե�set/get
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
	
	//��������
	public String dress() {
		return "����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ";
		
	}
	//�ӿڷ���
	@Override
	public String skill() {
		return "�Ųȸ��Σ������Ӽ�ħ������";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		Clown c = new Clown("Kahle",5);
		System.out.println("�����ߣ�"+c.getName()+"\n���䣺"+c.getYears()+"��"+"\n��װ��"+c.dress()+"\n���ܣ�"+c.skill());
		
	}
}
