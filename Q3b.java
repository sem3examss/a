import java.util.Scanner;
public class Q3b {
    public static void main(String...s){
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int arr[][]=new int[r][c];
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             arr[i][j]=sc.nextInt();
          }
      }
      int max=arr[0][0];
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }}
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(max==arr[i][j]){
                    System.out.print(i+2000 +" "+ j);
                }
            }}
      sc.close();
    }
    
}
