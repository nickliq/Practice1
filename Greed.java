package Practice1;

public class Greed {

    public static void main(String[] args) {
        System.out.println(Greed.greedy(new int[]{5, 1, 3, 4, 1}));
    }

    public static int greedy (int[] dice) {

        int ones, twos, threes, fours, fives, sixes;
        ones = 0; twos = 0; threes = 0; fours = 0; fives = 0; sixes = 0;

        int score = 0;

        for (int i = 0 ; i < 5 ; i++) {
            if (dice[i] == 1) ones++;
            if (dice[i] == 2) twos++;
            if (dice[i] == 3) threes++;
            if (dice[i] == 4) fours++;
            if (dice[i] == 5) fives++;
            if (dice[i] == 6) sixes++;
        }

        switch (ones) {
            case(3) : score+=1000; break;
            case(2) : score+=200; break;
            case(1) : score+=100; break;
            case(4) : score+=1100; break;
            case(5) : score+=1200; break;
        }

        if (twos == 3) score += 200;

        if (threes == 3) score += 300;

        if (fours == 3) score += 400;


        switch (fives) {
            case(3) : score+=500; break;
            case(2) : score+=100; break;
            case(1) : score+=50; break;
            case(4) : score+=550; break;
            case(5) : score+=600; break;
        }

        if (sixes == 3) score += 600;


        return score;
    }
}
