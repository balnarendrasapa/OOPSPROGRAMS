import java.util.*;
public class ex1 {
    public void Studentage(){
        int age=0;
        age=age+5;
        System.out.println(age);
        System.out.println(20>>2);
    }
//    use static for calling the method without having to instantiate a object
    public static void main(String[] args){
        Vector<Integer> v=new Vector();
        v.add(1);
        cool q=new cool();
        System.out.println(q.length);
        System.out.println(v);
        System.out.println(v.size());
        v.add(1,100);
        Boolean X=new Boolean("");
        System.out.println(X);
        ex1 ob=new ex1();
        ob.Studentage();
        int i=0;
        String a[]={"djf","iou"};
        for(String x:a)
        {
            System.out.println(x);
        }
    }
}
