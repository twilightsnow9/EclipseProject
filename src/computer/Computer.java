package computer;

public class Computer {
//    新建一个usb数组用于存放开机的各项操作
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
