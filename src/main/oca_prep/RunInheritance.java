package oca_prep;

public class RunInheritance extends Inherit {
    static int mine = 3;
    int they = 4;
    int them = 1;

    public int instanceMethod(int it) {
        return 3;
    }
    public static void staticMethod(int a) throws Exception {
        throw new Exception();
//        return 4;
    }

}

class Inherit {
    static int mine = 1;
    int they = 2;
    int a;
    public Inherit() {
        a++;
    }

    public int instanceMethod(int it) {
        return 1;
    }
    public static void staticMethod(int a) throws Exception {
//        return 2;
    }
}

class Done extends RunInheritance implements IT {
    int they = 9;
    public static void main(String[] args) throws Exception {
        Inherit inherit = new Done();
        RunInheritance runInheritance = (RunInheritance) inherit;
        Done done = new Done();
        Long z = new Long(4L);
        Integer x = new Integer(4);
        System.out.println(z.equals(x));
    }
}

interface IT {
    int jab = 4;
}

