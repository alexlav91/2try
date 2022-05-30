package MyList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<T extends User> implements List {

    static User[] listBody = new User[0];

    static int size = listBody.length;

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (listBody[j - 1].compareTo(listBody[j]) < 0) {
                    User X;
                    X = listBody[j - 1];
                    listBody[j - 1] = listBody[j];
                    listBody[j] = X;
                }
            }
        }
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {

        Iterator myIterator = new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return size > index;
            }

            @Override
            public Object next() {
                if (hasNext()) {
                    Object currElement = listBody[index];
                    index++;
                    return currElement;
                }
                return null;
            }
        };
        return myIterator;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }


    public boolean add(T o) {
        int newListSize = size + 1;
        User[] newListBody = new User[newListSize];
        if (size >= 0) System.arraycopy(listBody, 0, newListBody, 0, size);
        newListBody[newListSize - 1] = o;
        listBody = newListBody;
        size = newListBody.length;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return listBody[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
