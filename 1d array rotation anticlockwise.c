
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    printf("enter n:");
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        printf("enter %d:",i);
        scanf("%d",&a[i]);
        
    }
    int k;
    printf("\nenter k:");
    scanf("%d",&k);
    int temp=0;
    for(int j=0;j<k;j++){
         temp=a[0];
        
         for(int i=0;i<n;i++){
             a[i]=a[i+1];
         }
         a[n-1]=temp;
        
    }
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
        
    }
    
        
    
    
    

    return 0;
}
