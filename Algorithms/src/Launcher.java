/**
 * Created by odsptc15 on 3/13/2017.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Launcher {
    public static void main(String[]args)
    {
        //Result result = JUnitCore.runClasses(NaiveSearchTest.class);
        //for (Failure failure : result.getFailures()) {
         //   System.out.println(failure.toString());
       // }

//        System.out.println(result.wasSuccessful());
       NaiveSearchTest naiveSearchTest = new NaiveSearchTest();
        naiveSearchTest.test();
    }
}
