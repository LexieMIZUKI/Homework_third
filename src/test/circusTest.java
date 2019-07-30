package test;

import java.util.Scanner;

import realone.Bear;
import realone.Clown;
import realone.Lion;
import realone.Monkey;
import realone.Parrot;

public class circusTest {
	//表演提示
	public void presentation() {
		System.out.println("********欢迎来到太阳马戏团********");
		System.out.println("**********请选择表演者**********");
		System.out.println("********   1.棕熊              ********");
		System.out.println("********   2.狮子              ********");
		System.out.println("********   3.猴子              ********");
		System.out.println("********   4.鹦鹉              ********");
		System.out.println("********   5.小丑              ********");
	}
	//是否继续提示
	public void conti() {
		System.out.println("\n*****   是否继续观看（0/1）        *****");
	}
	//输入错误提示
	public void wrong() {
		System.out.println("\n****  输入信息不正确，请重新输入     ****");
	}
	//结束提示
	public void end() {
		System.out.println("\n********  欢迎下次光临     ********");
	}
	//表演信息筛选
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
		// 第一步操作
		circusTest ct = new circusTest();
		ct.presentation();
		ct.actor();
		ct.conti();
		//第一次以后的操作
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

