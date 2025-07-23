class MatricAdd
{
    public static void main(String args[])
    {
        int[][] a= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] b= new int[][]{{10,11,12},{13,14,15},{16,17,18}};
        int[][] c= new int[3][3];
        if(a.length == b.length && a[0].length==b[0].length)
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
        }
        else
        {
            System.out.println("'A' and 'B'Matric are not SAME");
            return;
        }
        System.out.println("The Matric 'A'Value:");
        for(int i=0;j<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Addition Matric of 'A' and 'B' value:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}