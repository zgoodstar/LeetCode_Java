package com.zgoodstar.leetcode.test;

import com.zgoodstar.leetcode.main.NextPermutation;

public class NextPermutationTest {

	public static void main(String[] args) {
		int[] nums = {9,3,5,7,8};
		
		NextPermutation npt = new NextPermutation();
		npt.nextPermutation(nums);
        for(int num :nums){
        	System.out.println(" "+num+" ");
        }
		
	}

}
