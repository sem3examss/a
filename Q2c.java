import java.util.Scanner;
public class Q2c {
    public static void main(String... s){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        arr[i]=x;
    }
    int fre[]=new int[n];
    int visited=-1;
    for(int i=0;i<n;i++){
       int count=1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j]){
                fre[j]=visited;
                count++;
            } 
        }
        if(fre[i]!=visited){
            fre[i]=count;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(fre[i]>fre[j]){
                fre[i]=fre[i]+fre[j];
                fre[j]=fre[i]-fre[j];
                fre[i]=fre[i]-fre[j];

                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
        }
    }
    for(int i=0;i<fre.length;i++)
    {
    if(fre[i]!=visited)
    {
     System.out.print(arr[i]+" "+fre[i]+"\n");
    
    }
    }
    sc.close();
    }
}