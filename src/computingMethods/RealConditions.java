/**
 * Created by 111 on 12.09.15.
 */
package computingMethods;

import computingMethods.AbstractEvaluationClass;

public class RealConditions extends AbstractEvaluationClass {

    public RealConditions(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public void addition() {
        int add = x + y;
        System.out.println("Addition is " + add);
    }

    @Override
    public void substcruction() {
        int sub = x - y;
        System.out.println("Substruction is " + sub);
    }

    @Override
    public void multiplication() {
        int mult = x*y;
        System.out.println("Multiplication is " + mult);
    }

    @Override
    public void division() {
        int div = x/y;
        System.out.println("Division is " + div);
    }
}
