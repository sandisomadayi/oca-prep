package oca_prep;

public class OCAQuestions {
    public static void main(String[] args) {
        Runnable runnable = new Running();
        runnable.runFast();
    }
}

interface Runnable {
    void runFast();
    void runSlow();
}

abstract class Runner implements Runnable {
    public void runFast() {
        System.out.println("running fast in Runner");
    }
}

class Running extends Runner {
    public void runSlow() {
        System.out.println("running slow in running");
    }
}