class NullMatrix
{
    public static void main(String args[])
    {
        int[][]a=new int[][]{{0,0,0},{0,0,1},{0,0,0}};
        boolean setValue=true;
        abc:for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]!=0)
                {
                    setValue=false;
                    break abc;
                }
            }
        }
        System.out.println("The Given Matric Value:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        if(setValue==true)
        {
            System.out.println("The Given matrix is a null Matric");
        }
        else
        {
            System.out.println("The Given Matric is not a null matrix");
        }
    }
}