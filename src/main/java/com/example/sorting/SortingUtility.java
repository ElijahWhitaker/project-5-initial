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


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
            // TODO implement Cocktail Shaker Sort here\
        int[] a = new int[0];
            boolean swapped;
            do {
                swapped = false;

                // Forward pass
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        // Swap A[i] and A[i + 1]
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) {
                    // Exit the outer loop if no swaps occurred.
                    break;
                }

                swapped = false;

                // Backward pass
                for (int i = a.length - 2; i >= 0; i--) {
                    if (a[i] > a[i + 1]) {
                        // Swap A[i] and A[i + 1]
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        swapped = true;
                    }
                }

            } while (swapped); // If no elements have been swapped, then the list is sorted
        }


        public static <T extends Comparable<T>>void shellSort (T[]data){

            // TODO implement Shell Sort here
        }

        private static <T extends Comparable<T>>void swap (T[]data,int index1, int index2){

            T temp = data[index1];
            data[index1] = data[index2];
            data[index2] = temp;

        }
    }





