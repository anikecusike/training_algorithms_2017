/**
 * Created by odsptc15 on 3/13/2017.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[]args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
       NaiveSearchTest naiveSearchTest = new NaiveSearchTest();
        NaiveSearch search = new NaiveSearch();
        Class[] parameterTypes = new Class[2];
        parameterTypes[0] = int[].class;

        parameterTypes[1] = int.class;
        Method method1 = NaiveSearch.class.getMethod("naiveSearch",parameterTypes );
        //, int[]data, int key );

        int [] testData = new int[]{1,7,8,45,23,78,4,89,12,67,5,10};
        naiveSearchTest.testUnit(2, method1,testData, 11 );
    }
}
