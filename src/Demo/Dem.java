package Demo;

public class Dem {
    private int a;
    private String b;

//    public Dem() {}
    public Dem(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    Dem(){
    }
    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Dem{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}

class a {
    public static void main(String[] args) {
        Dem d = new Dem();
        Dem d2 = new Dem(1, "balu");
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d2.getClass());
    }
}