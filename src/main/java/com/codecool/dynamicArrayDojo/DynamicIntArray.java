package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private int array[];

    public DynamicIntArray(int size) {
        this.array = new int[size];
    }

    public DynamicIntArray() {
        this.array = new int[0];
    }

    public void add(int n) {

        int newSize = this.array.length + 1;
        int[] newArray = new int[newSize];

        for(int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[newSize - 1] = n;
        this.array = newArray;
    }

    public void remove(int n) {

        int newSize = this.array.length - 1;
        int[] newArray = new int[newSize];
        boolean flag = false;

        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] == n) flag = true;
            else if (flag) newArray[i - 1] = this.array[i];
            else newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public String toString() {

        StringBuilder string = new StringBuilder();
        string.append(" ");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                string.append(array[i]);
                string.append(" ");
            }
            else string.append(array[i]);
        }
        return string.toString();
    }

}

