package com.example.demo.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoTest2 {


    public static void main(String[] args) {
        int[] array = {1,2,3,42,52,99,5,6,7,8,87,10,11};
        System.out.println("二分查找法："+test(array,2));
    }

    @Test
    public static int test(int [] array,int number){
        int k;
        /**
         * 冒泡排序
         */
      /*  for(int i=0; i<array.length-2;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j+1]<array[j]){
                    k = array[j+1];
                    array[j+1] = array[j];
                    array[j] = k;
                }
            }
        }*/
        /**
         * 快速选择排序
         */
        for(int i =0 ;i<array.length ;i++){
            for (int j=0;j<array.length;j++){
                break;
            }
        }

        /**
         * 选择排序
         */
       /* for (int i =0 ; i<array.length -1 ;i++){
            int temp = array[i];
            for(int j =i+1 ; j<array.length -1 ;j++) {
                if(temp>array[j]){
                     k = temp;
                     temp = array[j];
                     array[j] =k;
                }
            }
            array[i] =temp;
        }*/

        /**
         * 插入排序
         */
        int i,j;
        for (i = 1; i < array.length; i++) {
            int tmp = array[i];
            for (j = i; j > 0 && array[j - 1] > tmp; j--) {
                    array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
        //数组舒服
      for(i=0; i<array.length-1;i++){
          System.out.println(array[i]);
      }

        int left = 0;
        int right = array.length -1;
        // 循环遍历
        while (left <= right){
            int middle = (left + right)/2;
            if(number < array[middle]){
                right = middle -1;
            }else if (number > array[middle]){
                left = middle +1;
            }else {
                return middle;
            }
        }
        return -1;
    }

}
