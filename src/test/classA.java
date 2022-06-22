package test;

import org.testng.annotations.Test;


public class classA {
    int a =1;
    static int d=2;
    classC c = new classC();
    classB b = new classB();
    void test2(){
        classC.e =2;
//        classC.f = 2;//需要实例化普通内部类后才能调用非静态变量
        classB b = new classB();
//        classB.e = 2;//需要实例化静态内部类后才能调用非静态变量，像b.e = 2
        b.e = 2;
        classB.f = 2;//静态内部类的静态变量的调用方式
        b.test1();
    }
    public static class classB{//静态内部类,只能在类内部声明
        int e = 1;
        static int f = 1;
        void test1(){
//            a = 2;//不允许访问外部类的非静态成员，但是可以new一个外部类的对象来访问
            d=4;//可以访问外部类的静态成员
        }
    }
    public class classC{
        static int e = 1;//可以定义一个静态成员变量
        int f =1;
        public static void test4(){//可以创建静态方法
            System.out.println(11);
        }
        public void test3(){
            a = 2;//普通内部类可以直接访问外部类的普通成员变量
            d= 4;//普通内部类也可以直接访问外部类的静态成员变量
        }
    }
    @Test
    public void main() {
        classA a = new classA();
        classA.classB c = new classA.classB();
//        classA.classC d = new classA.classC();//一个普通内部类不能脱离外部类实体被创建
        classA.classC d = a.new classC();//可以以这种方式创建，因为普通内部类需要持有对外部类的引用
        d.test4();//可以通过实例调用静态方法
        classA.classC.test4();//也可以通过”类名.“调用
    }
}