package kyu8.returnNegative;

public class ReturnNegative {

    public static int makeNegative(final int x) {

        if (x == 0) {
            return 0;
        } else if (x < 0) {
            return x;
        } else
            return -(x);
    }
}

