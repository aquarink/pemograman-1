package Bag_9_Abstract_Interface;

public class Interface_Dua {

    private Interface_Satu interface_1;

    public Interface_Dua(Interface_Satu iface1) {
        this.interface_1 = iface1;
    }

    void turnOnThePhone() {
        this.interface_1.powerOn();
    }

    void turnOffThePhone() {
        this.interface_1.powerOff();
    }

    void makePhoneLouder() {
        this.interface_1.volumeUp();
    }

    void makePhoneSilent() {
        this.interface_1.volumeDown();
    }
}
