package com.algovault.algo.sorting;
/************************************************************
 * 🔰 CLASS: BubbleSort
 * ----------------------------------------------------------
 * 📌 Description : Implementation of BubbleSort
 * 🛠️  Purpose     : This class exists to arrange elements in ascending
 *                   order by repeatedly swapping adjacent elements
 *                   that are out of order.
 * 🧠 Complexity   : O(n²)
 *
 * 🧑‍💻 Crafted With Logic & Love by Masum | 05-Aug-2025
 ************************************************************/

public class BubbleSort {
    public void bubbleSort(int arr[], int n) {
        int i, j, temp, flag=0;
        for(i=0;i<n-1;i++) {
            flag=0;
            for(j=0;j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 🔸 CODED BY MASUM ✨ | NEVER STOP LEARNING 🚀

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Before BubbleSort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr, arr.length);

        System.out.print("\nAfter BubbleSort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/************************************************************
 * 🔚 End of BubbleSort.java
 * 📣 Built for mastering bubble sort operations stepwise
 * ✍️ Author: Masum | Keep coding, keep learning
 ************************************************************/
