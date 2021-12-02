package Meta;

import java.util.Arrays;

class S1762 {
        
    // Use a copy of array to store data simulating LinkedList.addFirst();
    
    public int[] findBuildings(int[] heights) {
        
        int max = -1, rInd = heights.length - 1;
        
        // retList = new LinkedList<>(); // Take too much time and space!
        int[] retList = new int[heights.length];
        
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > max) {
                max = heights[i];
                retList[rInd--] = i;
            }
        }
        
        // return retList.toArray(new int[retList.size()]); // Cannot do that
        
        /** Way to take List<Integers> to int[]*/
        // return retList.stream().mapToInt(Integer::intValue).toArray(); 
        return Arrays.copyOfRange(retList, rInd+1, heights.length);
        
        // O(N) Time, O(1) Space
        
    }
}