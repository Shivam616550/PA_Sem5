class Solution {
    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i = low, j = mid + 1, idx = 0;
        while(i <= mid && j <= high){
            if(arr[i] >= arr[j]) temp[idx++] = arr[j++];
            else temp[idx++] = arr[i++];
        }
        while(i <= mid){
            temp[idx++] = arr[i++];
        }
        while(j <= high){
            temp[idx++] = arr[j++];
        }
        for(int k=low; k<=high; k++){
            arr[k] = temp[k - low];
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = low + (high - low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public int[] sortArray(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
}