package ua.org.oa.ilyakaramanov;

/*
Интерфейсс методами:
void add(String s) - добавить строку в массив
String get() - получить последний элемент из массива
String get(int id) - получить элемент по его индексу
String remove() - удалить последний элемент
String remove(int id) - удалить элемент по индексу
boolean delete() - удалить все элементы массива
 */

public interface SimpleList {

    void add(String s);

    String get();

    String get(int id);

    String remove();

    String remove(int id);

    boolean delete();

}
