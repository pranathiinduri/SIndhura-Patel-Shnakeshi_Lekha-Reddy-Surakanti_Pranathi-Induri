package io.github.jidcoo.opto.lcdb;

import io.github.jidcoo.opto.lcdb.enhancer.base.InputProvider; 
// import io.github.jidcoo.opto.lcdb.enhancer.base.Require;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.ConsoleInputProvider; 
// import io.github.jidcoo.opto.lcdb.enhancer.base.Require;
// import io.github.jidcoo.opto.lcdb.enhancer.base.Requires;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.ConsoleOutputConsumer;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.FileOutputConsumer;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer; 

public class SimpleTest extends LeetcodeJavaDebugEnhancer {

    // The Solution class where you implement your solution logic
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0]; 
        }
    }

    @Override
    public InputProvider getInputProvider() {
        return new ConsoleInputProvider();
    }

    // @Require(values = {"file:input.txt"}, types = {java.io.File.class})
    // public void performTest() {
    //     System.out.println("Performing test...");
    // }

    // public static void main(String[] args) {
    //     try {
    //         // Validate the requirements
    //         SimpleTest testInstance = new SimpleTest();
    //         testInstance.performTest(); 
    //     } catch (Exception e) {
    //         e.printStackTrace(); 
    //     }
    // }

    

    @Test
    public void runTest() throws FileNotFoundException {
        // Example with Console Output
        setOutputConsumer(new ConsoleOutputConsumer());
        output("This is a message for the console.");

        // Example with File Output
        setOutputConsumer(new FileOutputConsumer("output.txt"));
        output("This is a message for the file.");
    }

    public static void main(String[] args) {
        try {
            new SimpleTest().runTest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    // @Test
    // public void runTest() {
    //     int[][] testCases = {
    //         {2, 7, 11, 15},
    //         {1, 2, 3, 4},
    //         {10, 20, 30, 40}
    //     };
    //     int[] targets = {9, 5, 50};
    
    //     for (int i = 0; i < testCases.length; i++) {
    //         int[] nums = testCases[i];
    //         int target = targets[i];
    
    //         Solution solution = new Solution();
    //         int[] result = solution.twoSum(nums, target);
    
    //         System.out.println("Test Case " + (i + 1) + ": [" + result[0] + ", " + result[1] + "]");
    //     }
    // }
}
