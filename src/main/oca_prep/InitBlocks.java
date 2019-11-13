package oca_prep;

public class InitBlocks {
    public InitBlocks() {
        System.out.println("inside constructor");
        String a = ab("a");
    }
    static String assign = ab("b");
    String c = ab("c");
    {
        System.out.println("instance init block");
        String d = ab("d");
    }
    static {
        System.out.println("static init block");
    }

    static String ab(String b) {
        System.out.println(b);
        return b;
    }


    public static void main(String[] args) {
        InitBlocks initBlocks = new InitBlocks();
    }
}
