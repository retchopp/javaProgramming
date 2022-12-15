package day01_JavaIntro;

import utilities.StringUtility;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {



        System.out.println("--------------");
int [] num ={14,1,84,97,1234,46};
int total = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2!=0){
                total+=3;
            }else {
                total+=10;
            }
            if(i%3==0){
                total-=15;
            }
        }
        System.out.println(total);
       }
    }


