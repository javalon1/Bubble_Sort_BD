package com.sda.algorytmy;

import java.util.Random;

public class App
{
    public static int[] BubbleSort(int [] tab, int n)
{
    int tmp;
    int counter =0;
    while(n>2)
    {
        boolean t= false;
        for(int i =0; i<n-1;i++)
        {
            if(tab[i]>tab[i+1])
            {
                t=true;
                tmp = tab[i];
                tab[i] = tab[i+1];
                tab[i+1] = tmp;

            }
            counter++;
        }
        if(t != true)
        {
            break;
        }


        n--;
    }

    System.out.println(counter);
    return tab;
}
    public static int[] BubbleSort1(int [] tab, int n)
    {
        int tmp;
        int counter =0;
        while(n>2)
        {
            boolean t = false;
            for(int i =0; i<n-1;i++)
            {
                if(tab[i] != tab[i+1] || !(tab[i]>tab[i+1]))
                {
                    if(tab[i]>tab[i+1])
                    {
                        t=true;
                        tmp = tab[i];
                        tab[i] = tab[i+1];
                        tab[i+1] = tmp;

                    }
                }

                counter++;
            }
            if(t != true)
            {
                break;
            }
            n--;
        }

        System.out.println(counter);
        return tab;
    }


    public static void main( String[] args )
    {

        int n = 100;
        int max = 50;
        int min = -50;
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
        /*long startTime1 = System.currentTimeMillis();
        BubbleSort(tab, n);
        long endTime1 = System.currentTimeMillis();
        long Time1 = endTime1-startTime1;*/
        BubbleSort1(tab,n);
        //System.out.println("Czas sortowania tablicy(w sekundach): "+Time1/1000+" oraz w milisekundach "+Time1);
        for(int i = 0; i<n;i++)
        {
            System.out.println(tab[i]);
        }
    }
}
