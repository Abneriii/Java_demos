package org.example;

/**
 * Author:
 * Created at:
 * Updated at:
 *
 * Comment:
 **/
public class Person implements Comparable{
    private String name;
    private String sex;
    private Integer age;

    public Person(String name, String sex,Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
