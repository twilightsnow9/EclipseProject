package test_methods;

public class ex3_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				continue;
			sum+=i;
		}
		System.out.println("1~100�����е������ĺ�Ϊ"+sum);

	}

}
