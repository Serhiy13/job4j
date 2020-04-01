package condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ab>(ac+bc) && ac>(ab+bc) && bc>(ab+ac);
        return false;
    }
}
