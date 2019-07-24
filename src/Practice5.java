/***
 * 构造代码块优先于构造函数执行
 * 每产生一个新对象就调用一次构造块
 *
 *
 * 静态代码块优先于构造块
 * 无论产生多少对象，静态块都只执行一次
 * 静态块的主要作用是为static属性进行初始化
 */
class Person5{
    //构造函数
    public Person5(){
        System.out.println("2.Person类的构造函数");
    }
    //构造块
    {
        System.out.println("1.Person5类的构造块");
    }

    //静态代码块
    static {
        System.out.println("3.Person5类的静态块");
    }


}
public class Practice5 {
    public static void main(String[] args) {
//        {
//            int x = 10;
//            System.out.println("x = " + x);
//        }
//
//        int x = 100;
//        System.out.println("x = " + 100);
        new Person5();
        System.out.println("=============");
        new Person5();
    }
}
