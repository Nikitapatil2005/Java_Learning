public class DataTypes{
    public static void main(String[] args) {
        byte b = 100; // Size is 1 byte 
        short s = 30000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 3.14f;           // 4 bytes
        double d = 3.14159265359;  // 8 bytes

        char c = 'A';              // 2 bytes (Unicode character)
        boolean flag = true;       // 1 bit

      

         // -------- Output --------
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

    }
}
