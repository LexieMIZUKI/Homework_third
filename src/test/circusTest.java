package test;

import java.util.Scanner;

import realone.Bear;
import realone.Clown;
import realone.Lion;
import realone.Monkey;
import realone.Parrot;

public class circusTest {
	//������ʾ
	public void presentation() {
		System.out.println("********��ӭ����̫����Ϸ��********");
		System.out.println("**********��ѡ�������**********");
		System.out.println("********   1.����              ********");
		System.out.println("********   2.ʨ��              ********");
		System.out.println("********   3.����              ********");
		System.out.println("********   4.����              ********");
		System.out.println("********   5.С��              ********");
	}
	//�Ƿ������ʾ
	public void conti() {
		System.out.println("\n*****   �Ƿ�����ۿ���0/1��        *****");
	}
	//���������ʾ
	public void wrong() {
		System.out.println("\n****  ������Ϣ����ȷ������������     ****");
	}
	//������ʾ
	public void end() {
		System.out.println("\n********  ��ӭ�´ι���     ********");
	}
	//������Ϣɸѡ
	Bear b = new Bear();
	Lion l = new Lion();
	Monkey m = new Monkey();
	Parrot p = new Parrot();
	Clown c = new Clown();
	
	public void actor() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		boolean bo = true;
		while(bo) {
			switch(x) {
			case 1:
				b.act();
				bo = false;
				break;
			case 2:
				l.act();
				bo = false;
				break;
			case 3:
				m.act();
				bo = false;
				break;
			case 4:
				p.act();
				bo = false;
				break;
			case 5:
				c.act();
				bo = false;
				break;
				default:
					this.wrong();
					this.actor();
					bo = false;
					break;
			}
		}
	}
	public static void main(String[] args) {
		// ��һ������
		circusTest ct = new circusTest();
		ct.presentation();
		ct.actor();
		ct.conti();
		//��һ���Ժ�Ĳ���
		boolean bl = true;
		while(bl) {
			Scanner scan2 = new Scanner(System.in);
			int y = scan2.nextInt();
			switch(y) {
			case 0:
				ct.end();
				bl = false;
				break;
			case 1:
				System.out.println();
				ct.presentation();
				ct.actor();
				ct.conti();
				break;
				default:
					ct.wrong();
					ct.actor();
					ct.conti();
					break;
			}
		}
	 }

	}

