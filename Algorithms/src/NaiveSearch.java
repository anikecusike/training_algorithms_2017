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
                System.out.println("Index " + i);
                return i;

            }
        }
        System.out.println("Index not found");
        return -1;
    }

    public int naiveSearch1(int[]data, int key )
    {
        int last = data[data.length];
        data[data.length] = key;
        int i = 0;
      while(data[i] != key)
      {
          ++i;
      }
      if (i != data.length)
      {
          return i;
      }
      return -1;
    }
}
