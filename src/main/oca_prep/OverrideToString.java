package oca_prep;

public class OverrideToString {
    public int a;
    public int b;
    public OverrideToString(int a, int b) {
        this.a = a;
        this.b = b;
//    }
//    public String toString() {
//        return this.a + " " + this.b;
//    }
        }
}

class Run {
    public static void main(String[] args) {
        int a = 1024;
        float b = 1.24f;
        double c = 123.8;

        a = (int)b;
        b = a;
        c = a;
        a = (int) c;
        c = b;
        b = (float) c;
    }
}
