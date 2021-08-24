public class Q6b {
    public static void main(String... s){
        Figure_3D obj[]=new Figure_3D[3];
        obj[0]=new Cylinder(3,4);
        obj[1]=new Cone(3,4,5);
        obj[2]=new sphere(2);
        obj[0].volume();
        obj[0].area();
        obj[1].volume();
        obj[1].area();
        obj[2].volume();
        obj[2].area();
    }   
}
class Figure_3D{
    int r,h;
    Figure_3D(int r){
        this.r=r;
    }
    Figure_3D(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void volume(){ }
    void area() {  }
}
class Cylinder extends Figure_3D{
    Cylinder(int r,int h){
        super(r,h);
    }
    public void volume(){
        System.out.print("Cylinder volume");
     }
    void area(){
        System.out.print("Cylinder area");
    }
}
class Cone extends Figure_3D{
    int l;
    Cone(int r,int h,int l){
        super(r,h);
        this.l=l;
    }
    public void volume(){
        System.out.print("Cone volume");
     }
    void area(){
        System.out.print("Cone area");
    }
}
class sphere extends Figure_3D{
    sphere(int r){
        super(r);
    }
    public void volume(){
        System.out.print("Sphere volume");
     }
    void area(){
        System.out.print("Sphere area");
    }
}
