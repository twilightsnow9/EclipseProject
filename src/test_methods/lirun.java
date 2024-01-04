package test_methods;

import java.util.Scanner;

public class lirun {

	public static void main(String[] args) {
		System.out.println("输入当月利润（万）");
		Scanner in=new Scanner(System.in);
		int x =in.nextInt();
		double y=0,sun=0;
		if(x>0&&x<=10) {
			y=x*0.1;
		}else if(x>10&&x<=20) {
			y=10*0.1+(x-10)*0.075;
		}else if(x>20&&x<=40) {
			y=10*0.1+10*0.075+(x-20)*0.05;
		}else if(x>40&&x<=60) {
			y=10*0.1+10*0.075+20*0.05+(x-40)*0.03;
		}else if(x>60&&x<=100) {
			y=10*0.1+10*0.075+20*0.05+20*0.03+(x-60)*0.015;
		}else if(x<100) {
			y=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(x-100)*0.01;
		}
        System.out.println("应当发放奖金总数"+y+"万元");
		

	}

}
