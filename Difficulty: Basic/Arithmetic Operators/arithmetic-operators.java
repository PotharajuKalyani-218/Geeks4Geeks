class Solution {
    public int[] computeOperations(int x, int y) {
        int arr[]=new int[5];
        arr[0]=(x+y);
        arr[1]=(x-y);
        arr[2]=(x*y);
        arr[3]=(x/y);
        arr[4]=(x%y);
    return arr;
    }
}
