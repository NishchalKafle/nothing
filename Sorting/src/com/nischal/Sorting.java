/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nischal;


public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums = {2,1,5,15,8,16,12,1};
        for (int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
                for(int i = 0;i<nums.length;i++){
                    System.out.println(nums[i]);
                }
    }
}

