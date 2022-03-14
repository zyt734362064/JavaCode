package com.Test0314.Demo4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-14
 */
 //class Student implements Comparable<Student> {
 class Student {
    public int age;
    public String name;
    public double score;

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Strudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

   /* //按年纪从小到大排序
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }*/
}

//实现一个年龄比较器
class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class ScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.score - o2.score);
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Test {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(28,"张三",98.5);
        students[1] = new Student(39,"张四",99.5);
        students[2] = new Student(20,"张五",90.5);
        System.out.println(Arrays.toString(students));
        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();
        //Arrays.sort(students,ageComparator);
        //Arrays.sort(students,scoreComparator);
        Arrays.sort(students,nameComparator);

        System.out.println(Arrays.toString(students));
    }



    public static void main1(String[] args) {
        int[] array = {1,21,3,14,5,16};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
