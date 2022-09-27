import java.util.*;
class Main{
    public static void SelectionSort(int a[]){
        int n=a.length;
        int temp,min;
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_ind]){
                    min_ind=j;
                }
            }
            temp=a[i];
            a[i]=a[min_ind];
            a[min_ind]=temp;
            
        }
        System.out.println("Elements after sorting using Selection Sort is :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of elements :");
       int n=sc.nextInt();
       System.out.println();
       System.out.print("Enter the elements :");
       int []a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       
       SelectionSort(a);
       
       
    }
}