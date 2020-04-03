package condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first>=(second+third)?  first :(second+third):
                     second>=(first+third)? second : (first+third):
                     third>=(first+second)? third : (first+second):
        return result;


        }
}
