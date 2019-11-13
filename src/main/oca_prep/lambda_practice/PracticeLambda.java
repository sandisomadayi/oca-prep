package oca_prep.lambda_practice;

@FunctionalInterface
interface PracticeLambda {
    int go(String a);
}

interface PracticePred<T, R> {
    R going(T a);
}

class A {

    public static void main(String[] args) {
        PracticePred<String, Integer> practicePred = (n) -> n.length();
        PracticeLambda practiceLambda = (a -> a.length());
        System.out.println(practicePred.going("sandiso"));
    }
}

