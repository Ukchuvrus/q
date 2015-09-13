package computingMethods;
import java.lang.*;
import java.math.*;



public class ImagineCondition extends AbstractEvaluationClass {


    public ImagineCondition(String a, String b) {
        str = a;
        str1 = b;
    }

    @Override
    public void addition() {
        double orderX = 0, orderY = 0;
        int set = 0;
        int n = 0;
        int k = 0;
        int j = 0;
        int signX = 1, signY = 1;
        Character b;
        int[] bufferX = new int[10];
        int[] bufferY = new int[10];
        int[] bufferX1 = new int[10];
        int[] bufferY1 = new int[10];
        while (n != str.length()) {
            if (str.charAt(n) == 'i') {
                n++;
            }
            if (n != 0) {

                if (str.charAt(n) == '+' && str.charAt(n - 1) == 'i') {
                    signY = 1;
                    set = 1;
                    n++;
                }

                if (str.charAt(n) == '-' && str.charAt(n - 1) == 'i') {
                    signY = -1;
                    set = 1;
                    n++;
                }
            }

            if (str.charAt(n) == '-') {
                signX = -1;
                n++;
            }

            if (set == 1) {
                b = str.charAt(n);
                bufferY[k] = Character.getNumericValue(b);
                k++;
                n++;
                orderY++;
            } else {
                b = str.charAt(n);
                bufferX[j] = Character.getNumericValue(b);
                n++;
                j++;
                orderX++;

            }
        }
        for (n = 0; n < orderX; n++) {
            x += (int) (bufferX[n] * Math.pow(10, (double) (orderX - (n + 1))));
        }
        x *= signX;
        for (n = 0; n < orderX; n++) {
            y += (int) (bufferY[n] * Math.pow(10, (double) (orderY - (n + 1))));
        }
        y *= signY;
        System.out.println(x);
        System.out.println(y);
    }


    @Override
    public void substcruction() {

    }

    @Override
    public void multiplication() {

    }

    @Override
    public void division() {

    }


    public static void main(String argv[]) {
        ImagineCondition a = new ImagineCondition("-1488i-1488", "15i+11");
        a.addition();
    }
}

