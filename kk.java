import java.util.*;

public class kk {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int index = sc.nextInt();
            System.out.println("The array element at index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");
        }
        System.out.println("The array element successfully accessed");
    }
}