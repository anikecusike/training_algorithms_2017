/**
 * Created by odsptc15 on 3/13/2017.
 */
public class NaiveSearch {

    public NaiveSearch(){};

    public int naiveSearch(int[]data, int key )
    {
        for(int i = 0; i< data.length; i++)
        {
            if(data[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}
