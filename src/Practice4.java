//class Person4{
//    public void print(){
//        System.out.println("方法："+ this);//this 就表示当前执行的对象
//    }
//}

//class Person4{
//    static String Country = "中国";
//    String name;
//    int age;
//
//    public void getPresonInfo(){
//        System.out.println("姓名：" + name + ",年龄："+ age + ",国家："+ Country);
//    }
//}

class Person4{
    private static String Country = "中国";
    private String name;
    private int age;

    public Person4(String name,int age){
        this.name= name;
        this.age = age;
    }

    public static void setCountry(String c){
        Country = c;
    }



    public void getPresonInfo(){
        System.out.println("姓名：" + name + ",年龄："+ age + ",国家："+ Country);
    }
}
public class Practice4 {
    public static void main(String[] args) {
//        Person4 p1 = new Person4();
//        System.out.println("方法：" + p1);
//        p1.print();
//        System.out.println("===============================");
//        Person4 p2 = new Person4();
//        System.out.println("方法：" + p2);
//        p2.print();


//        Person4 p1 = new Person4();
//        p1.name = "张三";
//        p1.age = 10;
//        p1.Country = "中华人民共和国";
//        Person4.Country = "中华民国";
//        Person4 p2 = new Person4();
//        p2.name = "李四";
//        p2.age = 20;
//        p1.getPresonInfo();
//        p2.getPresonInfo();

        Person4.setCountry("中华民国");
        Person4 person = new Person4("张赞",20);
        person.getPresonInfo();
    }
}
