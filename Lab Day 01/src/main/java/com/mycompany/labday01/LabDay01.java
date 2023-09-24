package com.mycompany.labday01;
public class LabDay01 
{
    public static void main(String[] args) 
    {
        //Question1
        System.out.println("Hello World!");
        //Question2
        System.out.println("Name - Dulan Nithila Liyanarachchi");
        System.out.println("Degree Program - Bachelor Of Information Technology(Major In Cyber Security)");
        //Question3
        int j=0;
        System.out.println("For Loop");
        for(int i=0;i<=4;i++)
        {
            System.out.println("Executing Loop "+i);
        }
        System.out.println("");
        System.out.println("While Loop");
        while(j<=4)
        {
            System.out.println("Executing Loop "+j);
            j++;
        }
        //Question4
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
        if( x == 30 ){
        break;
        }
        System.out.print( x );
        System.out.print("\n");
        }
        System.out.print("I’m out of the Loop now");
    }
}
