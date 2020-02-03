package converter;

public class Converter {
        public static int rubleToEuro(int value) {
            return value / 70;
        }
        public static int rubleToDollar(int value) {
            return value / 60;
        }
        public static int euroToRuble(int value) {
            return value * 70;
        }
        public static int dollarToRuble(int value) {
            return value * 60;
        }

        public static void main(String[] args) {
            int euro = rubleToEuro(140);
            System.out.println("140 rubles are" + " " + euro + " " + "euro.");
            int dollar = rubleToDollar(120);
            System.out.println("120 rubles are" + " " + dollar + " " + "dollars.");
            int rubleE = euroToRuble(1);
            System.out.println("1 euro are" + " " + rubleE + " " + "rubles.");
            int rubleD = dollarToRuble(1);
            System.out.println("1 dollar are" + " " + rubleD + " " + "rubles.");
        }

}


