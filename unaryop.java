public class unaryop {
    public static void main(String[] args) {
        int p = 5;
        int q = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++ q);
        System.out.println(q);
        int x = p++;
        int y = ++q;
        System.out.println(x);
        System.out.println(y);
    }
}