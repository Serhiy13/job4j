package condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int tmp = first>=second? first : second;
        tmp = tmp>=third? tmp : third;
        return tmp;
    }
}