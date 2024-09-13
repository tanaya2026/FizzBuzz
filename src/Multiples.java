public class Multiples {

    public static void main(String[] args) {
        int counter = 0;
        int i = 3;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                counter = counter + 1;
            }
            i = i + 1;
        }

        System.out.println(counter);

    }
}

