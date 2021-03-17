class cool{
    static int length=100;
}
public class ex2 {
    public static void main(String[] args) {
        cool x=new cool();
        x.length=200;
        cool y=new cool();
        System.out.println(x.length+" "+y.length);
    }
}