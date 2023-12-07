package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement Gnome Sort here
        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                // Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }

            }

            // Swap minimum value with the lowest index
            swap(data, min, index);
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




