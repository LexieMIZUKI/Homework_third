package realone;

import interone.IACT;
import mainone.Animal;

//�̳и���,���ӽӿ�
public class Bear extends Animal implements IACT {
	//�̳и������Ե��޲ι��캯��
    public Bear() {
    	super();
    }
	
	//�ӿڷ���
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���Ż�����������ɡ��ֱ������";
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		Bear b = new Bear();
		b.setName("Bill");
		b.setAge(1);
		System.out.println("�����ߣ�"+b.getName()+"\n���䣺"+b.getAge()+"��"+"\n���ܣ�"+b.skill()+"\n���ã�"+b.love());
		
	}

	//�̳з���
	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "ϲ������";
	}

}
