/**
 * Created by Anna on 3/13/2017.
 */
public class Launcher {
    public static void main(String []args)
    {
        int[]testData = {1, 19, 45, 5, 89, 10};
        int searchKey = 5;
        Expression expression = NaiveSearcher::naiveSearch;
        Tester.test(expression,testData,searchKey);
    }
}
