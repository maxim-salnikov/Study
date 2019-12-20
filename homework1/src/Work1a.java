public class Work1a {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        System.out.println(a | b); // =47; 00101010 | 00001111 = 00101111
        System.out.println(a & b); // =10; 00101010 & 00001111 = 00001010
        System.out.println(a ^ b); // =37; 00101010 ^ 00001111 = 00100101
        System.out.println(a = a << 3); // =336; 00101010 << 3 = 10101000
        a = 42;
        System.out.println(a <<= 3); // =336; 00101010 << 3 = 10101000
        a = 42;
        System.out.println(a = a >> 3); // =5; 00101010 >> 3 = 00000101
        a = 42;
        System.out.println(a >>= 3); // =5; 00101010 >> 3 = 00000101
        a = 42;
        System.out.println(a = a >>> 3); // =5; 00101010 >>> 3 = 00000101
        System.out.println(b = b << 3); // =120; 00001111 << 3 = 01111000
        b = 15;
        System.out.println(b = b >> 3); // =1; 00001111 >> 3 = 00000001
        b = 15;
        System.out.println(b >>= 3); // =1; 00001111 >> 3 = 00000001
        b = 15;
        System.out.println(b = b >>> 3); // =1; 00001111 >>> 3 = 00000001
        b = 15;
        System.out.println(b  >>>= 3); // =1; 00001111 >>> 3 = 00000001
    }
}
