package Bag_10_String_Buffer;

public class Contoh_Runtime_Exec {

    public static void main(String[] zzzzzzzzzzz) {

        Runtime ini_runtimenya = Runtime.getRuntime();

        try {
            ini_runtimenya.exec("notepad 'ini_akan_jadi_nama_file.txt'");
        } catch (Exception e) {
            System.out.println("INI ERRORNYA == " + e);
        }
    }

}
