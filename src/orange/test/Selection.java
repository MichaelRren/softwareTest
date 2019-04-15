package orange.test;

import edu.princeton.cs.algs4.StdOut;

public class Selection {
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;  //  比较两个数的大小
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];

        a[i] = a[j];

        a[j] = t;
    }

    public static void sort(Comparable[] a)
    {
        //将a[] 按升序排列
        int length = a.length;

        for(int i = 0; i < length; i++)
        {
            int min = i;

            for (int j = i; j < length; j++)
            {
                if (less(a[j], a[min]))
                {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static void  show(Comparable[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            StdOut.println(a[i] + " ");
        }

        StdOut.println();
    }

    public static void main(String[] args)
    {
        String[] strs  = args;

        sort(strs);

        show(strs);
    }
}
