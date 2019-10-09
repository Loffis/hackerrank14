/*
    From Hackerrank.com, 30 days of code, day 14: scope.
    Compute the difference between min and max value in an int-array.
 */

package se.ecutb.loffe;

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        //this.maximumDifference = maximumDifference;
    }

    public int[] getElements() {
        return elements;
    }

    public void setMaximumDifference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

    public void computeDifference() {
        Arrays.sort(getElements());
        setMaximumDifference(elements[getElements().length - 1] - getElements()[0]);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}