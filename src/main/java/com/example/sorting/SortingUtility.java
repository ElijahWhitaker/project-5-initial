package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
           // TODO implement Gnome Sort here
        int pos = 0;
        int[] a = new int[0];
        while (pos < a.length) {
            if (pos == 0 || a[pos] >= a[pos - 1]) {
                pos++;
            } else {
                // Swap a[pos] and a[pos-1]
                int temp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = temp;
                pos--;
            }
        }
    }


        
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data){

            // TODO implement Cocktail Shaker Sort here

        int position, scan;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    swap(data, scan, scan + 1);
                }
            }
        }
    }

            public static <T extends Comparable<T>>void shellSort (T[]data) {

                // TODO implement Shell Sort here
            }

            private static <T extends Comparable<T>>void swap (T[]data,int index1, int index2){

                T temp = data[index1];
                data[index1] = data[index2];
                data[index2] = temp;

            }
        }




