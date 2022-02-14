package org.example;

public class fibonacci {
    public double fibo( int n1,int n2)
    {
        int n3,i,count=5;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }
        return 0;
    }
}
