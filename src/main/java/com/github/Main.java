package com.github;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] ar = {"Город","Пульт","Картошка","ДЖАВА"};
        arr(ar ,1,3);
    }
    private static void arr(String[] arr,int a,int b){
        String save = arr[a];
        arr[a] = arr[b];
        arr[b] = save;

        for (String s : arr) System.out.println(s);
        arrList(arr);
    }
    private static void arrList(String[] arr){
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, arr);
        System.out.println(list);
    }
}
