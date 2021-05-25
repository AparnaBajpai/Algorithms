package com.Algorithm;

public class Kadens {

    public static void main(String args[])
    {
        int ar[] = {-2,-3,-1,4,-2,1,6,-3};
        int msf = Integer.MIN_VALUE;
        int meh = 0;
        int firstIndex = -1;
        int lastInddex = -1;
        for(int i = 0; i< ar.length; i++)
        {
            meh = meh +ar[i];

            if(meh < ar[i])
            {
                meh = ar[i];
                firstIndex =i;
            }
            if(msf < meh)
            {
                msf = meh;
                lastInddex = i;
            }
        }

        System.out.println(msf);
        System.out.println(firstIndex+ " last index is " +lastInddex);

        for(int i = firstIndex ; i <= lastInddex ;i++)
        {
            System.out.print(ar[i] +" ");
        }
    }
}
