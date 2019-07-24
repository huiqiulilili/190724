//class Person{
//    String name;
//    int age;
//    public void getPersonInfo(){
//        System.out.println("姓名：" + name + ",年龄：" + age);
//    }
//
//}
//class Person{
//    private String name;
//    private int age;
//    public void getPersonInfo(){
//        System.out.println("姓名：" + name + ",年龄：" + age);
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age){
//        if (age > 0 && age <= 200){
//            this.age = age;
//        }else{
//            this.age = 0;
//        }
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

class Person{
    private String name;
    private int age;

    //构造方法
    public Person(String name,int age){
        this.name = name;
        setAge(age);
    }
    public void getPersonInfo(){
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        if (age > 0 && age <= 200){
            this.age = age;
        }else{
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }
}
public class Practice1 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "张三";
//        person.age = -200;
//        person.getPersonInfo();
//        Person person = new Person();
//        person.setName("张三");
//        person.setAge(-200);
//        person.getPersonInfo();
//        Person person = new Person("张三",-200);
//        person.getPersonInfo();
        new Person("李四",20).getPersonInfo();
    }
}
