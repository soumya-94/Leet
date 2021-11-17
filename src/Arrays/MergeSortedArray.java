package Arrays;

/*
https://leetcode.com/problems/merge-sorted-array/
 */

public class MergeSortedArray {

    public static void solve(int[] A, int m, int[] B, int n) {

        int p1 = m-1;
        int p2 = n-1;

        for(int p=m+n-1; p>=0; p--) {

            if(p2<0)    break;

            if(p1>=0 && A[p1] > B[p2]) {
                A[p] = A[p1];
                p1--;
            }
            else
            {
                A[p] = B[p2];
                p2--;
            }
        }
    }

    public static void main(String ar[]){

        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};

        solve(A, 3, B, 3);

        for(int i=0; i<6; i++) {
            System.out.print(" "+A[i]);
        }

    }

}
