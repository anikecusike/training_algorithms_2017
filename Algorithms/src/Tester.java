/**
 * Created by Anna on 3/13/2017.
 */
public class Tester {

    public static void test(int expectedResult, Expression func, int[] data, int key)
    {
        System.out.print("exp : " + expectedResult + " ");

        func.isEqual(data, key);
    };
}
