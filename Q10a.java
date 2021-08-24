public class Q10a {
    public static void main(String ... s){
        int x1,x2;
        try{
        x1=Integer.parseInt(s[0]);
        x2=Integer.parseInt(s[1]);
        float r=x1/x2;
        System.out.print(r);
        }
        catch(ArithmeticException e){
            System.out.print("Arithmetic exception occured \n "+e);
        }
        catch(NumberFormatException e1){
            System.out.print("num format  exception occured  \n"+e1);

        }
    }
}
