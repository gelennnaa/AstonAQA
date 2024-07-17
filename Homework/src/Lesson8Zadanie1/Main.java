package Lesson8Zadanie1;

public class Main {
    public static void main(String[] args) {
        Dog dogKora = new Dog("Кора");
        Cat catPusya = new Cat("Пуся");

        dogKora.run(150);
        dogKora.swim(5);
        catPusya.run(150);
        catPusya.swim(5);

        Cat[] cats = {
                new Cat("Пуся"),
                new Cat("Лёва"),
                new Cat("Матроскин"),
                new Cat("Пятнышко"),
                new Cat("Дымка")
        };

        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        bowl.addFood(20);
        System.out.println("Насыпали еды в миску. Количество еды: " + bowl.getFood());

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Animal.catCount);
        System.out.println("Всего собак: " + Animal.dogCount);
    }
}