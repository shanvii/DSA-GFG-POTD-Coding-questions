class Solution {
    int prev = Integer.MIN_VALUE;
    int isRepresentingBST(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            if (arr[i] <= prev) {
                return 0;
            }
            prev = arr[i];
        }
        return 1;
    }
}
