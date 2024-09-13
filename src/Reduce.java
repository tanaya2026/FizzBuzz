public class Reduce {
    public static void main(String[] args) {
        int m = 100;
        int counter = 0;
        while (m != 0) {
            if (m % 2 == 0) {
                m = m / 2;
                counter = counter + 1;
            } else {
                m = m - 1;
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}
