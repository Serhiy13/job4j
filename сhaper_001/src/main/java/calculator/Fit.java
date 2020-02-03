package calculator;

public class Fit {
    public static double manWeight(double height) {
        return (180 - 100) * 1.15;
    }
    public static double womanWeight(double height) {
        return (160 - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(100);
        System.out.println("Man 180 is" + " " + man);
        double woman = womanWeight(110);
        System.out.println("Woman 160 is" + " " + woman);
    }

}

