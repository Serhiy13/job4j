package condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first>=second? first : third;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (third > first && second > third) {
            result = third;
        }
        return result;
    }
}
