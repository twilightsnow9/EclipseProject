package test_methods;

public class ex3_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				continue;
			sum+=i;
		}
		System.out.println("1~100内所有的奇数的和为"+sum);

	}

}
