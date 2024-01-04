package test_methods;

import java.util.Scanner;

public class chushihua {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double y, r;
		int a, n;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入贷款总金额（元）：");
		a = in.nextInt();
		System.out.print("请输入贷款总月数:");
		n = in.nextInt();
		System.out.print("请输入月利率:");
		r = in.nextDouble();
		y = a * r *Math.pow(1 + r ,  n) / (Math.pow(1 + r , n) - 1);
		System.out.println("每月的还款金额为:" + y + "元。");

	}

}
