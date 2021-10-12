import java.util.Scanner;
 public class ArrayInputExample1 {
    public static void main(String[] args) {
        int n,i,s,sum=0;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of the Array : ");
        n=sc.nextInt();
        int arr[] = new int[10];
        int arr2[] = new int[10];
        for(i = 0; i < arr.length; i++) {
            arr2[i] = 0;
        }
        System.out.println("Enter the elements of the Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are : ");
        for ( i = 0; i < n; i++ ) {
            sum = sum + arr[i];
            arr2[i] = arr2[i] + sum;
            System.out.println(arr2[i]);
        }
        System.out.println("Enter the element to search : ");
        s=sc.nextInt();

        for( i = 0; i < n; i++) {
            if(arr2[i] == s) {
                System.out.println("The position is : " + i);
                flag++;
                break;
            }
        }

        if (flag==0) {
            System.out.println("Wrong");
        }
        System.out.println("Hi");
    }
}
    
