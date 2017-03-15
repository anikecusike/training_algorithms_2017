/**
 * Created by Anna on 3/13/2017.
 */
public class NaiveSearcher
        {

    public static int naiveSearch(int[] data, int key)
    {
        int result = -1;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] == key)
            {
                result = i;
            }
        }
        System.out.println(result);

        return result;
    };
}
