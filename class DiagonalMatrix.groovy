class DiagonalMatrix
{
    public static void main(String args[])
    {
        int[][]a=new int[][]{{1,0,1},{0,3,0},{0,0,3}};
        boolean setValue=true;
        abc:for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    if(a[i][j]==0)
                    {
                        setValue=false;
                        break abc;
                    }
                }
                else if(a[i][j]!=0)
                {
                    setValue=false;
                    break abc;
                }
            }
        }
        System.out.println("The Given matrix value:");
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
            System.out.println("The Given matrix is a Diagonal matrix");
        }
        else
        {
            System.out.println("The given matrix is not a Diagonal matrix");
        }
    }
}