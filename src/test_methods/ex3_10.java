package test_methods;

public class ex3_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>1000) {
				System.out.println("i="+i+"sum="+sum);
				break;
			}
		}

	}

}
