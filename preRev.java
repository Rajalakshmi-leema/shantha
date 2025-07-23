import java.util Scanner;
public class PreRev
{
    Public static void main(String[]args)
{
    int s=1;
    int n;
    Scanner sc=neew Scanner(System.in);
    System.out.println("enter the N values");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        while(s<=i)
        {
            System.out.print(s);
            s++;
        }
        s--;
        whilw(s>1)
        {
            System.out.println(--s);
        }
        System.out.println();
    }
}}