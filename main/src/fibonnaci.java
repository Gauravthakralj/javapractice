public class fibonnaci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = a + b;
        while (c <= 50) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }

    }
}
