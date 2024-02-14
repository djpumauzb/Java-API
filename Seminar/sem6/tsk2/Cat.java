package Seminar.sem6.tsk2;

/*
1. Продумайте структуру класса Кот. 
Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники 
б) архивом выставки котов 
в) информационной системой 
Театра кошек Ю. Д. Куклачёва Можно записать в текстовом виде,
не обязательно реализовывать в java.
 */
public class Cat {
    String name;
    String owner;
    String breed;

    private int age;

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                "owner='" + owner + '\'' +
                "breed='" + breed + '\'' +
                "age=" + age +
                "}";
    }

    public Cat(String name, String owner, String breed, int age) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }
}