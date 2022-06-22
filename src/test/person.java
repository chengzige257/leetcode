package test;

import mians.father;

import java.util.*;

public class person<T extends father> implements Comparable<person>{
    private int id;
    public  int age;
    public T a;
    public person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public <K extends T> void test(List<? extends K> c){

    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

//    public static void main(String[] args) {
//        person p3 = new person(2,3);
//        person p4 = new person(2,4);
//        person p5 = new person(2,5);
//        person p6 = new person(2,6);
////        person[] a = new person[]{p3,p4,p6,p5};
////        Arrays.sort(a);
////        for (person person : a) {
////            System.out.println(person);
////        }
//        List<person> p = new ArrayList<>();
//        p.add(p4);
//        p.add(p3);
//        p.add(p6);
//        p.add(p5);
//        Collections.sort(p,(c,b)->b.age-c.age);
//        for (person person : p) {
//            System.out.println(person);
//        }
//    }

//    @Override
//    public int compare(person o1, person o2) {
//        return o1.age-o2.age;
//    }

    @Override
    public int compareTo(person o) {
        return this.age-o.age;
    }
}
