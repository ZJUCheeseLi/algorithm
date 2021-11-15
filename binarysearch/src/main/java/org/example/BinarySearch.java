package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class BinarySearch
{
    public static void main( String[] args )
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("初始化数组");
        for (int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("输入要求的值");
        int k = sc.nextInt();

        int left = solution.leftPoint(arr, k);
        System.out.println("左起第一个等于k的点下标为：" + left);
        int right = solution.rightPoint(arr, k);
        System.out.println("右至最后一个等于k的点为：" + right);

    }
}
class Solution {
    public int leftPoint(int[] arr, int k) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] >= k) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public int rightPoint(int[] arr, int k) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + r + 1>> 1;
            if (arr[mid] <= k) l = mid;
            else r = mid - 1;
        }
        return l;
    }
}
