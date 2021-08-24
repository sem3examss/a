public class Q10b {
    public static void main(String ... s){
        try{
        int n=Integer.parseInt(s[0]);
        division(n);
        }
        catch(Exception e){
            System.out.print("error occured  "+e);
        }

    }
     static void division(int n) throws NumDivBytwoException{
        if(n%2!=0){
            throw new NumDivBytwoException("save neeku");
        }
        else{
            System.out.print("ayyindhile");
        }
    }
}
class NumDivBytwoException extends Exception{
    NumDivBytwoException(String s1){
        System.out.print(s1);
    }
}