package leetCodeProblems;

public class ContainerWithMostWater {

   /*

   https://leetcode.com/problems/container-with-most-water/
   You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
    */

    class Solution {
        public int maxArea(int[] height) {


            int maxArea = 0;
            int i =0;
            int j = height.length-1;
            while(i<j){
                int tempArea = (j-i)*Math.min(height[i],height[j]);

                maxArea = Math.max(tempArea,maxArea);
                if(height[i]>height[j]){
                    j--;
                }else{
                    i++;
                }
            }


            return maxArea;
        }


    }

}
