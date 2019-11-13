package oca_prep;

import static java.lang.System.out;

public abstract class LabelledBreakAndContinue implements Make {
    public static void main(String[] args) {
        byte a = Byte.MAX_VALUE;
        char b = 'c';
        short c = Short.MAX_VALUE;
        int d;
        double e = Double.MAX_VALUE;
        float f = Float.MAX_VALUE;
        long g = Long.MAX_VALUE;

        Make make = me -> me.length();

        d = b;
        b = (char) d;
        out.println(make.me("sandiso"));
    }
}

@FunctionalInterface
interface Make {
    int me(String a);
}

abstract class Break {
    private void doingBreak() {
        System.out.println("on private break");
    }
    public void doingBreakPub() {
        System.out.println("on public break");
    }
    public abstract void njee();
}

class Breaking extends Break {
    private void doingBreaking() {
        System.out.println("on private breaking");
    }
    public void doingBreakingPub() {
        System.out.println("on public breaking");
    }

    @Override
    public void njee() {

    }
}
