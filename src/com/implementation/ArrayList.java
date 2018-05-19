package com.implementation;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(3);
        System.out.println("original size is " + arrayList.size());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println("new size is " + arrayList.size());
        System.out.println("new filled size is " + arrayList.filled);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("element" + arrayList.get(i));
        }

        arrayList.remove(3);
        arrayList.remove(0);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("new element" + arrayList.get(i));
        }
    }

    int size;
    int[] myArray;
    int filled = 0;
    public ArrayList() {
        this.size = 10;
        this.myArray = new int[10];
    }
    public ArrayList(int size) {
        this.size = size;
        this.myArray = new int[size];
    }

    public boolean add(int x) {
        if (filled >= size) {
            size = size * 2;
            int[] newArray = new int[size];
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }
        myArray[filled] = x;
        filled++;
        return true;
    }

    public int get(int index) throws IndexOutOfBoundsException{
        try {
            return myArray[index];
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return myArray[index];
    }

    public int size() {
        return size;
    }

    public int remove(int index) {
        if (index < 0) {
            System.out.println("index has to be greater than or equal to zero");
        } else if (index > size) {
            System.out.println("Index out of boundary");
        } else {
            for (int i = index; i < filled - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
        }
        return index;
    }
}
