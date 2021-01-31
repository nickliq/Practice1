package Practice1;

import java.util.ArrayList;

public class SquareDigit {

    public static void main(String[] args) {
        System.out.println(squareDigit(9119));
    }

    public static int squareDigit (int n) {

        StringBuilder temp = new StringBuilder(String.valueOf(n));
        //System.out.println(temp);

        String[] list = temp.toString().split("");

        temp = new StringBuilder();
        int t;

        for (String s : list) {
            t = Integer.parseInt(s);
            temp.append(String.valueOf(t * t));
        }

        t = Integer.parseInt(temp.toString());

        return t;

    }

}
