package computer;

public class Computer {
//    �½�һ��usb�������ڴ�ſ����ĸ������
    public USB[] usbArr = new USB[4];
    public void add(USB usb) {
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i] == null) {
                usbArr[i] = usb;
                break; 
            }
        }
    }
}
