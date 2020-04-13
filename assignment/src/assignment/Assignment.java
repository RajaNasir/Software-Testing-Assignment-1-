/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;


public class Assignment {
public static boolean functionAdd(int a, int b)
{
    int ans=a+b;
    System.out.println(ans);
    return true;
}
public static boolean functionMultiply(int a,int b)
{
    int ans=a*b;
    System.out.println(ans);
    return true;
}
public static boolean functionDivision(int a, int b)
{
    if(b!=0)
    {
        double ans=a/b;
       System.out.println(ans);
    return true;
    }
    else
    {
        System.out.println("Zero cannot be divident");
        return false;
    }
}
        
   
    
}
