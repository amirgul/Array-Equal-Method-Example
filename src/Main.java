public class Main
{

    public static void main(String[] args)
    {
        int[] value = new int[5];
        int[] value2 = new int[5];
        setArray(value);
        setArray(value2);
        for(int i = 0; i<value.length; i++)
        {
            System.out.println("Value at index: "+ (i));
            System.out.println(value[i]);
        }
        if(equals(value, value2))
            System.out.println("Arrays are equal by equal method");
        else
            System.out.println("Arrays are not equal by equal method");


    }
    public static void setArray(int[] anArray)
    {
        for(int i = 0; i<anArray.length; i++)
            anArray[i] = i+ 5*i;
    }
    public static boolean equals(int[] a, int[] b)
    {
        boolean elementMatch = true;
        if(a.length != b.length)
            elementMatch = false;
        else
        {
            int i = 0;
            while (elementMatch && i<a.length)
            {
                if(a[i] != b[i])
                    elementMatch = false;
                else
                    i++;

            }
        }
        return  elementMatch;
    }
}
