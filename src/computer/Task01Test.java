package computer;

public class Task01Test {
    public static void main(String[] args) {
        // ����һ�����Զ���
        Computer c = new Computer();        
        c.add(new Mouse());
        c.add(new Mic());
        c.add(new KeyBoard());
        System.out.println("����");
//        c.powerOn();
        System.out.println("�ػ�");
//        c.powerOff();
    }
}
