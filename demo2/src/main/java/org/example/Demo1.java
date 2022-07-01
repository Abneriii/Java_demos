package org.example;


import org.example.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Abner
 * Created at:2022.6.11
 * Updated at:
 * Description:
 * Comment:
 **/
public class Demo1 {





    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("ning","man",21));
        personList.add(new Person("huang","man",22));
        personList.add(new Person("zheng","man",52));
        personList.add(new Person("liu","man",32));
        personList.add(new Person("dandan","man",22));
        personList.add(new Person("li","woman",42));
        personList.add(new Person("zhang","woman",72));
//        Arrays.sort(personList,);

    }

//    private List<Person> createPersonListByAmount(Integer amount){
//
//
//
//    }


}
