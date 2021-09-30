import java.util.*;
class bubble{
  public void disp(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
      for(int j=0;j<n-1;j++){
        if(a[j]>a[j+1){
          int t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
        }
     }
   }
      for(i=0;i<n;i++){
        System.out.println(a[i]+" ");
       }
      }
     }
