/*public class Q11a {
    public static void main(String ...s){
        Goodmorning g1=new Goodmorning();
        Hello h1=new Hello();
        Welcome w1=new Welcome();
        g1.start();
        h1.start();
        w1.start();
    }
    
}
class Goodmorning extends Thread{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            sleep(1000);
            System.out.println("good morning");
        }
    }
    catch(Exception e){}
    }
}
class Hello extends Thread{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            sleep(2000);
            System.out.println("Hello");
        } }
        catch(Exception e){}
    }
}
class Welcome extends Thread{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            sleep(3000);
            System.out.println("welcome");
        }
    }
    catch(Exception e){}
    }
} */
public class Q11a {
    public static void main(String ...s){
        Goodmorning g1=new Goodmorning();
        Hello h1=new Hello();
        Welcome w1=new Welcome();
        Thread t1=new Thread(g1);
        Thread t2=new Thread(h1);
        Thread t3=new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }
    
}
class Goodmorning implements Runnable{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            Thread.sleep(1000);
            System.out.println("good morning");
        }
    }
    catch(Exception e){}
    }
}
class Hello implements Runnable{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            Thread.sleep(2000);
            System.out.println("Hello");
        } }
        catch(Exception e){}
    }
}
class Welcome implements Runnable{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            Thread.sleep(3000);
            System.out.println("welcome");
        }
    }
    catch(Exception e){}
    }
}

