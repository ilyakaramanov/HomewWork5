package ua.org.oa.ilyakaramanov;

/*
Создаю массив, добавляю в него слов.
Запускаю методы из класса DynamicStringList
 */

public class Main {

    public static void main(String[] args) {

        DynamicStringList array = new DynamicStringList(10);

        array.add("aaa");
        array.add("bbb");
        array.add("ccc");
        array.add("ddd");
        array.add("eee");
        array.add("fff");
        array.add("ggg");
        array.add("hhh");
        array.add("iii");
        array.add("jjj");

        System.out.println("Весь массив " + array);
        System.out.println("Последний элемент " + array.get());
        System.out.println("Элемент с индексом 1: " + array.get(1));
        array.remove();
        System.out.println("Массив без последнего элемента " + array);
        array.remove(3);
        System.out.println("Массив без элемента с индексом 3: " + array);
        array.delete();
        System.out.println(array);

    }
}
