//class Person3{
//    private String name;
//    private int age;
//
//    public Person3(){
//        System.out.println("产生一个新对象");
//    }
//
//    public Person3(String name){
//        System.out.println("产生一个新对象");
//        this.name = name;
//    }
//
//    public Person3(String name,int age){
//        System.out.println("产生一个新对象");
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getPersonInfo(){
//        return "姓名:" + name + ",age:" + age;
//    }
//}

// 修改的代码

class Person3{
    private String name;
    private int age;

    public Person3(){
        System.out.println("产生一个新对象");
    }

    public Person3(String name){
        this();
        this.name = name;
    }

    public Person3(String name,int age){
        this(name);
        this.age = age;
    }

    public String getPersonInfo(){
        return "姓名:" + name + ",age:" + age;
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3();
        Person3 p2 = new Person3("张三");
        Person3 p3 = new Person3("李四",20);
        System.out.println(p1.getPersonInfo());
        System.out.println(p2.getPersonInfo());
        System.out.println(p3.getPersonInfo());
    }
}
