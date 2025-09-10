package slidingWindow_twoPointers.medium;

public class fruitIntoBaskets {
    
    public int totalFruit(int[] fruits) {
       int n = fruits.length;
       int last = -1, secLast = -1, count = 0, currMax = 0, max = 0;

       for(int i=0; i<n; i++) {
            if(fruits[i] == last || fruits[i] == secLast) {
                currMax++;
            }
            else {
                currMax = count + 1;
            }

            if(fruits[i] == last) {
                count++;
            }
            else {
                count = 1;
                secLast = last;
                last = fruits[i];
            }

            max = Math.max(max, currMax);
        }

        return max;
    }
}
