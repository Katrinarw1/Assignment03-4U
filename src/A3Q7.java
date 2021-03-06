/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A3Q7 {

    // counting sort
    public void countingSort(int[] n) {
        // create the tracker array
        int[] arr = new int[101];
        // cycle through the array
        for (int i = 0; i < n.length; i++) {
            // create a temporary variable that stores the number in the array spot
            int temp = n[i];
            // add 1 to the spot on the array that coressponds to temp
            arr[temp]++;
        }

        // variable that stores the spot in n array
        int y = 0;

        // loop through arr 
        for (int i = 0; i < arr.length; i++) {
            // if the spot has more than 0 
            if (arr[i] > 0) {
                /* replace the current spot in n array with what 
                   is in the current spot in the tracker array */
                n[y] = i;
                // add 1 to y
                y++;
                // if there is more than 1 of the number
                arr[i]--;
                i--;
            }
        }
        
        // print out the  array
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test counting sort
        int[] n = {0, 9, 9, 6, 7, 56, 78, 54, 34, 67, 9, 90, 98, 100, 56, 17};

        A3Q7 test = new A3Q7();
        test.countingSort(n);
    }
}
