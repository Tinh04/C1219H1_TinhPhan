package B6_DataStructureAndAlgorithmBasic.Execises.ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity < 0) {
//            throw new IllegalArgumentException("Error");
            System.out.println("Error");
        }
    }

    public void add(int index, E e) {
        elements[size++] = e;
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            //throw new: exception case
            throw new IndexOutOfBoundsException("No value!");
        }
        else {
            E temp = (E) elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            return temp;
        }
    }

    public int size() {
        return size;
    }

    public ArrayList<E> clone() {
        ArrayList<E> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i, (E)elements[i]);
        }
        return arrayList;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " , Size " + i);
        }
        return (E) elements[i];
    }
}
