package OOP.al5_4;

public class al5_4 {
	String name;
	int age;
	al5_4(String name){
		this.name=name;
	}
	al5_4(String name,int age){
		this(name);
		this.age=age;
	}
	void speak(){
		System.out.println("大家好，我叫"+name+"我今年"+age+"岁了");
		
	}

}
