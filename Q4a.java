public class Q4a{
    public static void main(String...s){
        Box b=new Box(3,6,7);
        System.out.print(b.volume());
    } 
} 
class Box{ 
    float height,width,depth;
    public Box(float h,float w,float d)
    {
      height=h;
      width=w;
      depth=d;
    }
    public float volume(){
        return height*width*depth;
    }
}