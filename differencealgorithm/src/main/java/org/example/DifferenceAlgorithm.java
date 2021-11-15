package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DifferenceAlgorithm
{
    public static void main( String[] args )
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组长度");
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        System.out.println("请初始化数组");
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            solution.insert(a, i, i, t);
        }
        int m = sc.nextInt();
        while (m -- > 0) {
            System.out.println("输入改变值");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            solution.insert(a, l, r, v);
        }
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + a[i];
        }
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public void insert(int[] arr, int l, int r, int v) {
        arr[l] += v;
        arr[r + 1] -= v;
    }
}
