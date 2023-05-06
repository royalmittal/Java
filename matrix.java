import java.util.*;


    public static boolean Search(int matrix[][], int key)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Key is Found at ("+i+","+j")");
                    return true;
                }
            }
        }
        else
        return false;
    }

    public static void createMatrix(int n,int m)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static void printMatrix(matrix[][])
    {
        for(int i=0;i<n;i++)

        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        createMatrix(3,3);
        printMatrix();
        System.out.println("Enter the element for search:");
        int key=sc.nextInt();
        search(matrix,key);
    }
}
