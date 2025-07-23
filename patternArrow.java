import java.util.scanner;
public class patternArrow
{
    public static void main(Sting[]args)
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.println(" "+j);
            System.out.println("\n");
        }
        for(i=n-1;i>=n;i--)
        {
            System.out.println(""+j);
            System.out.println("\n");
        }
    }
}