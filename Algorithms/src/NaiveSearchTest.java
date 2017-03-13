/**
 * Created by odsptc15 on 3/13/2017.
 */
import org.junit.*;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class NaiveSearchTest {

   @Test
    public void test()
   {
       NaiveSearch search = new NaiveSearch();
       int [] testData = new int[]{1,7,8,45,23,78,4,89,12,67,5,10};
       assertEquals(-1,search.naiveSearch(testData, 11));
   }

   public void testUnit(int expectedResult, Method method, int[] testData, int key )
           throws IllegalAccessException, InvocationTargetException
   {

       int result = (int)method.invoke(testData, key);
       System.out.println("expected result : " + expectedResult
       + "actual result : " + result);
   }

}
