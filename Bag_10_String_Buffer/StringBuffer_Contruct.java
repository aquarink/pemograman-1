package Bag_10_String_Buffer;

public class StringBuffer_Contruct {
    public static void main(String args[]) {

        // String()
        String st1 = new String();
        st1 = "Constructor St1";

        // String(String Value)
        String st2 = new String("Constructor St2");

        char ch[] = { 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'o', 'r' , '3'};
        // String(char value[])
        String st3 = new String(ch);

        // String(char value[], int offset, int count)
        String st4 = new String(ch, 0, ch.length);
        byte bytes[] = { 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'o', 'r' , '4'};

        // String(byte ascii[], int hibyte, int offset, int count)
        String st5 = new String(bytes, 0, 0, bytes.length);

        // String(byte ascii[], int hibyte)
        String st6 = new String(bytes, 0);

        // String(StringBuffer buffer)
        String st7 = new String(new StringBuffer("Constructor St7"));

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);
        System.out.println(st6);
        System.out.println(st7);
    }
}
