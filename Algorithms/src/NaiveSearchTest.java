/**
 * Created by odsptc15 on 3/13/2017.
 */
import org.junit.*;


public class NaiveSearchTest {

   @Test
    public void test()
   {
       NaiveSearch search = new NaiveSearch();
       int [] testData = new int[]{1,7,8,45,23,78,4,89,12,67,5,10};
       search.naiveSearch(testData, 11);
   }

}
