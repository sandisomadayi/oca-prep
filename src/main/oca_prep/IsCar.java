package oca_prep;


import java.util.ArrayList;
import java.util.List;

public interface IsCar {
    int a = 4;
    default void inter() {
        System.out.println("inter interface");
    }
    void doing();
}

class atIs implements IsCar {
//    public void inter() {
//        System.out.println("inter class");
//    }
    public void inter(String a) throws Exception {

    }
    public void doing() {
        try {
            doing("something");
        }
        catch (Exception e) {
            System.out.println("caught it");
        }
        System.out.println("after catching");
    }
    public void doing(String a) throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        try {
            while (true) {
                list.add("my string");
            }
        }
        catch (OutOfMemoryError ex) {
            System.out.println("runtime error");
        }catch (RuntimeException ru) {
            System.out.println("runtime");
        }
        catch (Exception ex) {
            System.out.println("exception");
        }
        System.out.println("done");
    }
}