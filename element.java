
package com;
import java.util.Scanner;
public class element {
    public static void main(String[] args) {
        int size,loc,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        size=r.nextInt();

        int a[]=new int[size];
        System.out.print("Enter Array Elements:");
        for(i=0;i<size;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Enter Array location:");
        loc=r.nextInt();
        for(i=loc;i<size-1;i++){
            a[i]=a[i+1];
        }
        size--;
        for(i=0;i<size;i++){
            System.out.print( a[i]+" ");
        }
    }

}
