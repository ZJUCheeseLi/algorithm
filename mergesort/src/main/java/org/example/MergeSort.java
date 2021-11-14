package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组的长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("初始化数组");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("排序前的数组为：" + Arrays.toString(arr));
        solution.mergeSort(arr, 0, n - 1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));

    }
}
class Solution {
    private int[] temp = new int[100010];
    public void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, mid + 1, r);
    }

    private void merge(int[] arr, int l1, int r1, int l2, int r2) {
        int k = 0;
        int i = l1, j = l2;
        while (i <= r1 && j <= r2) {
            if (arr[i] <= arr[j]) {
                temp[k ++] = arr[i ++];
            } else {
                temp[k ++] = arr[j ++];
            }
        }
        while (i <= r1) temp[k ++] = arr[i ++];
        while (j <= r2) temp[k ++] = arr[j ++];

        for (int l = 0; l < k; l++) {
            arr[l1 + l] = temp[l];
        }
    }
}
