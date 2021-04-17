package com.practice.searching;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Searching {
    //O(n)
    public int LinearUnSortedSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }//O(n)

    public int LinearSortedSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= val) {
                if (arr[i] == val)
                    return i;
            }
        }
        return -1;
    }

    //Binary Search Iterative way :: Array needs to be in sorted manner :: O(log n)
    public int BinarySearchIterative(int arr[], int val) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == val)
                return mid;
            else if (arr[mid] < val)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public int BinarySearchRecursive(int arr[], int val, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == val)
            return mid;
        else if (arr[mid] < val)
            return BinarySearchRecursive(arr, val, mid + 1, end);
        else
            return BinarySearchRecursive(arr, val, start, mid - 1);
    }

    public void printDuplicate(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        System.out.println("Duplicate Values ::");
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i]))
                System.out.print(arr[i]);
            else
                hs.add(arr[i]);
        }
    }
    public void printDuplicate1(int arr[]){
        int[] counts = new int[arr.length];
        System.out.println("Duplicate Values ::");
        for(int i=0;i<arr.length;i++)
            counts[i]=0;
        for(int i=0;i<arr.length;i++){
            if(counts[arr[i]] != 0)
                System.out.print(arr[i]);
            else
                counts[arr[i]]++;
        }
    }

        public void rotate(int[] nums, int k) {
            Arrays.stream(nums).forEach(System.out::print);
            System.out.println();
            reverse(nums,0,k-1);
            Arrays.stream(nums).forEach(System.out::print);
            System.out.println();
            reverse(nums,k,nums.length-1);
            Arrays.stream(nums).forEach(System.out::print);
            System.out.println();
            reverse(nums,0,nums.length-1);
           Arrays.stream(nums).forEach(System.out::print);
        }
        public void reverse(int[] nums,int start,int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
         public void reverseArray(int[] arr){
                int start=0;
                int end=arr.length-1;
                int tmp;
                while(start < end){
                    tmp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=tmp;
                    start++;
                    end--;
            }
                for(int x : arr )
                System.out.print(x+" ");
        }

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result = result ^ num;
            System.out.println(result);
        }
        return result;
    }

    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(haystack.equals(needle)){
            return -1;
        }
        strStr(haystack.substring(0,haystack.length()-1),needle);

        return -1;
    }

}