package Practice1;

public class MultipliesThreeFive {

    public static void main(String[] args) {
        System.out.println(solution(20));
    }

    public static int solution(int number) {

        int sum = 0;
        boolean both = false;

        for (int i = 1; i < number; i++) {

            if (i % 3 == 0 | i % 5 == 0) both = true;

            if (both) sum+=i;

            both = false;

        }

        return sum;
    }
}
