public class Q11b {
    public static void main(String... s){
        Example ex=new Example();
        Sync t1=new Sync(ex);
        Sync t2=new Sync(ex);
        Sync t3=new Sync(ex);
        t1.start();
        t2.start();
        t3.start();
    }
    
}

class Example{
    void display(){
        synchronized(this){
            System.out.print(Thread.currentThread().getName());
            try{
            for(int i=0;i<4;i++){
                System.out.print(Thread.currentThread().getName()+"   "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
        }
    }
}

class Sync extends Thread{
    Example e;
    Sync(Example ex){
        e=ex;
    }
    public void run(){ e.display();}
}