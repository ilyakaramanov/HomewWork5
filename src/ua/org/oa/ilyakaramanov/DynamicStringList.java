package ua.org.oa.ilyakaramanov;

import java.util.ArrayList;
import java.util.List;

public class DynamicStringList implements SimpleList {

    private int lgth;
    List<String> list = new ArrayList<>(lgth);

    DynamicStringList() {
        list = null;
    }

    DynamicStringList(int lgth) {
        this.list = list;
    }

    @Override
    public void add(String s) {
        list.add(s);
    }

    @Override
    public String get() {
        return list.get(list.size() - 1);
    }

    @Override
    public String get(int id) {
        return list.get(id);
    }

    @Override
    public String remove() {
        return list.remove(list.size() - 1);
    }

    @Override
    public String remove(int id) {
        return list.remove(id);
    }

    @Override
    public boolean delete() {
        list.clear();
        return true;
    }

    @Override
    public String toString() {
        return "list=" + list;
    }
}
