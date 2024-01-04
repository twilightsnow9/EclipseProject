package test_methods;

public class qiuqiu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int x,y,z;
		 System.out.println("满足条件的情况有：");
		 for(x=0;x<=10;x++) {
			 for(y=0;y<=20;y++) {
				 z=30-x-y;
				 if(3*x+2*y+z==50) {
					 System.out.println("男人："+x+"女人："+y+"小孩"+z);
				 }
			 }
		 }

	}

}
