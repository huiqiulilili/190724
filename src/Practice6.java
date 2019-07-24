//class Outer{
//    private String msg = "Hello World";
//
//    class Inner{
//        public void print(){
//            System.out.println(msg);
//        }
//    }
//
//    public void fun(){
//        Inner in = new Inner();
//        in.print();
//    }
//}

class Outer{
    private  String msg = "Hello World";

    public String getMsg(){
        return this.msg;
    }

    public void fun(){
        Inner in = new Inner(this);
        in.print();
    }
}

class Inner{
    private Outer out;

    public Inner(Outer out){
        this.out = out;
    }

    public void print(){
        System.out.println(out.getMsg());
    }
}
public class Practice6 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.fun();
    }
}
