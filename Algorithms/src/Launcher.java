/**
 * Created by Anna on 3/13/2017.
 */
public class Launcher {
    public static void main(String []args)
    {
        Expression naiveSearch = NaiveSearcher::naiveSearch;

        //key not exists in array
        int searchKey = 1;

        //degerate
        Tester.test(-1,naiveSearch,new int[]{},searchKey);

        //trivial
        Tester.test(-1,naiveSearch, new int[]{2},searchKey);

        //trivial-2
        Tester.test(-1,naiveSearch,new int[]{2,8},searchKey);

        //general
        Tester.test(-1,naiveSearch,new int[]{2,8,5,7,9},searchKey);

        //general
        Tester.test(-1,naiveSearch,new int[]{9,10,11,12},searchKey);

        //general
        Tester.test(-1,naiveSearch,new int[]{4,5,7,2},searchKey);


        //key exists in array

        //degerate
        Tester.test(-1,naiveSearch,new int[]{},searchKey);

        //trivial
        Tester.test(0,naiveSearch,new int[]{searchKey},searchKey);

        //trivial-2
        Tester.test(1,naiveSearch,new int[]{2,searchKey},searchKey);

        //general
        Tester.test(3,naiveSearch,new int[]{2,8,5,searchKey,7,9},searchKey);

        //general
        Tester.test(0,naiveSearch,new int[]{searchKey,9,10,11,12},searchKey);

        //general
        Tester.test(4,naiveSearch,new int[]{4,5,7,2,searchKey},searchKey);
    }
}
