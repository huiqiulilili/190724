//class Person2{
//    private String name;
//    private int age;
//
//    public Person2(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getPersonInfo(){
//        return "姓名：" + name + "年龄：" + age;
//    }
//}

class Person2{
    private String name;
    private int age;

    public Person2(String name,int age){
        this.name = name;
        this.age = age;
        this.print();
    }

    public void print(){
        System.out.println("****************");
    }

    public String getPersonInfo(){
        return "姓名：" + name + "年龄：" + age;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Person2 person = new Person2("张三",20);
        System.out.println(person.getPersonInfo());
    }
}
