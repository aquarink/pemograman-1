package Bag_10_String_Buffer;

public class Contoh_Runtime {

    public static void main(String[] ini_terserah) {
        Runtime ini_runtime = Runtime.getRuntime();

        long ini_cek_memory = ini_runtime.freeMemory();
        long ini_cek_processor = ini_runtime.availableProcessors();

        System.out.println("MEMORY/RAM DALAM JVM == " + ini_cek_memory + " byte");

        long memory_dalam_giga = ini_cek_memory / (1024*1024);

        System.out.println("MEMORY/RAM DALAM JVM == " + memory_dalam_giga + " mega");

        System.out.println("JUMLAH CORE PROSESOR DALAM JVM == " + ini_cek_processor);
    }
}
