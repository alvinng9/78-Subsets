package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subsetsTest() {
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList());
        output.add(Arrays.asList(3));
        output.add(Arrays.asList(2));
        output.add(Arrays.asList(2,3));
        output.add(Arrays.asList(1));
        output.add(Arrays.asList(1,3));
        output.add(Arrays.asList(1,2));
        output.add(Arrays.asList(1,2,3));
        assertEquals(output,solution.subsets(new int[]{1,2,3}));
        output = new ArrayList<>();
        output.add(Arrays.asList());
        output.add(Arrays.asList(0));
        assertEquals(output,solution.subsets(new int[]{0}));
    }

}