package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class QuickSort
{
    public static void main( String[] args )
    {
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
        solution.quickSort(arr, 0, n - 1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));
    }
}
class Solution {
    public void quickSort(int[] arr, int l, int r) {
        int x = arr[l];
        int i = l - 1;
        int j = r + 1;
        if (l >= r) return;

        while(i < j) {
            do i ++; while (arr[i] < x);
            do j --; while (arr[j] > x);
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        quickSort(arr, l, j);
        quickSort(arr, j + 1, r);
    }
}
