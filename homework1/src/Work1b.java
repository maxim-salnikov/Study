public class Work1b {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        System.out.println(a | b); // = -9; 11010110 доп. код. | 11110001 доп. код = 11110111
        System.out.println(a & b); // = -48; 11010110 доп. код. &  11110001 доп. код = 11010000
        System.out.println(a ^ b); // = 39; 11010110 доп. код. ^  11110001 доп. код = 00100111
        System.out.println(a = a << 2); // = -168; 11010110 доп. код. <<2 = 101011000
        a = -42;
        System.out.println(a <<= 2); // = -168; 11010110 доп. код. <<=2 = 101011000
        a = -42;
        System.out.println(a = a >> 2); // = -11; 11010110 доп. код. >>2 = 11110101
        a = -42;
        System.out.println(a >>= 2); // = -11; 11010110 доп. код. >>=2 = 11110101
        a = -42;
        System.out.println(a = a >>> 2); // = -1073741813; 11010110 доп. код. >>>2 =
        System.out.println(b = b << 2); // =-60;  11110001 доп. код <<2 = 11000100
        b = -15;
        System.out.println(b = b >> 2); // = -4; 11110001 доп. код >>2 = 11111100
        b = -15;
        System.out.println(b >>= 2); // = -4;  11110001 доп. код>>2 = 11111100
        b = -15;
        System.out.println(b = b >>> 2); // = 1073741820;  11110001 доп. код >>>2 =
        b = -15;
        System.out.println(b  >>>= 2); // = 1073741820;  11110001 доп. код >>>=2 =
    }
}
