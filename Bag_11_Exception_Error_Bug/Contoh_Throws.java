package Bag_11_Exception_Error_Bug;

public class Contoh_Throws {

    static void lemparError() throws ClassNotFoundException {
        System.out.println("Ada Yang Error Ni!");
        throw new ClassNotFoundException("Saya Tangkap");
    }

    public static void main(String[] args) {
        try {
            Contoh_Throws.lemparError();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
