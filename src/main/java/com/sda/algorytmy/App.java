package com.sda.algorytmy;

import java.util.Random;

public class App
{
    public static int[] BubbleSort(int [] tab, int n)
    {
        int tmp;
        while(n>0)
        {
            for(int i =0; i<n-1;i++)
            {
                if(tab[i]>tab[i+1])
                {
                    tmp = tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1] = tmp;
                }
            }
            n--;
        }
        return tab;
    }


    public static void main( String[] args )
    {

        int n = 10000;
        int max = 5000;
        int min = -5000;
        int [] tab = new int[n];
        Random r= new Random();
        long startTime = System.currentTimeMillis();
        for(int i =0; i<n;i++)
        {
            int t=r.nextInt(max-min+1)-min;
            tab[i]=t;

        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("Czas wykonania: "+totalTime);
        /*for(int i =0; i<n;i++) {
            System.out.println(tab[i]);

        }*/
        long startTime1 = System.currentTimeMillis();
        BubbleSort(tab, n);
        long endTime1 = System.currentTimeMillis();
        long Time1 = endTime1-startTime1;
        System.out.println("Czas sortowania tablicy(w sekundach): "+Time1/1000+" oraz w milisekundach "+Time1);
        for(int i = 0; i<n;i++)
        {
            System.out.println(tab[i]);
        }
    }
}
