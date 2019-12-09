package collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array = new Object[10];
    private int size = 0;

    public MyArrayList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T o) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(T o) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == null) {
//                array[i] = o;
//                size++;
//                return true;
//            }
//        }
//        array = Arrays.copyOf(array, ((array.length * 3) / 2 + 1));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == null) {
//                array[i] = o;
//                size++;
//                return true;
//            }
//        }
        if (size >= array.length) {
            array = Arrays.copyOf(array, ((array.length * 3) / 2 + 1));
        }
        array[size] = o;
        size++;
        return true;
    }

    public boolean remove(T o) {
        if (size == 0) {
            return false;
        }
        if (contains(o)) {
            int index = indexOf(o);
            Object[] elementsAfterIndex = Arrays.copyOfRange(array, index + 1, size);
            if (elementsAfterIndex.length == 0) {
                size--;
                return true;
            }
            int j = 0;
            for (int i = index; i < index + elementsAfterIndex.length ; i++) {
                array[i] = elementsAfterIndex[j];
                j++;
            }
            size--;
            return true;
        }
        return false;
    }

    public T get(int index) {
        if ((index >= size) | (index < 0)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        return (T)array[index];
    }

    public void set(int index, T element) {
        if ((index >= size) | (index < 0)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        array[index] = element;
    }

    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }
}
