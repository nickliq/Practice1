package Practice1;

import java.util.ArrayList;

public class BraceChecker {

    static ArrayList<String> list1 = new ArrayList<>();

    public static Boolean isValid(String braces) {

        Boolean t = true;

        String[] nlist = braces.split("");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < nlist.length; i++) {
            list.add(i, nlist[i]);
        }

        boolean l = false;

        int k = -1;
        int currListSize;
        currListSize = list.size();

        for (; ; ) {

            k++;
            l = false;

            if (k + 1 == currListSize) break;

            if (list.get(k).equals("(") & list.get(k + 1).equals(")")) {
                list.remove(k);
                list.remove(k);
                currListSize -= 2;
                k = -1;
            } else if (list.get(k).equals("{") & list.get(k + 1).equals("}")) {
                list.remove(k);
                list.remove(k);
                currListSize -= 2;
                k = -1;
            } else if (list.get(k).equals("[") & list.get(k + 1).equals("]")) {
                list.remove(k);
                list.remove(k);
                currListSize -= 2;
                k = -1;
            }

            if (currListSize == 0) break;

        }
        if (currListSize == 0) {
            l = true;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{()}))[]{()}"));
    }

}
