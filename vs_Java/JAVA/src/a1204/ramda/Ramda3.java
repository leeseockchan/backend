package a1204.ramda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ramda3 {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();

        Person p1 = new Person(2, "허준", 42);
        Person p2 = new Person(1, "김훈", 30);
        Person p3 = new Person(3, "한강", 27);

        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        peoples.forEach(person -> System.out.println(person));
        peoples.forEach(p -> System.out.println(p));
        System.out.println();

        // 나이순으로 정렬
        Collections.sort(peoples, (pp1, pp2) -> pp1.getAge() - pp2.getAge());
        peoples.forEach(p -> System.out.println(p));
        System.out.println();

        // 이름순으로 정렬
        Collections.sort(peoples, (pp1, pp2) -> pp1.getName().compareTo(pp2.getName()));
        peoples.forEach(p -> System.out.println(p));
    }
}

class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
