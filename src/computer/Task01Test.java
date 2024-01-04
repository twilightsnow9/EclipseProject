package computer;

public class Task01Test {
    public static void main(String[] args) {
        // 创建一个电脑对象
        Computer c = new Computer();        
        c.add(new Mouse());
        c.add(new Mic());
        c.add(new KeyBoard());
        System.out.println("开机");
//        c.powerOn();
        System.out.println("关机");
//        c.powerOff();
    }
}
