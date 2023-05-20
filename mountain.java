public class mountain {
    public static void main(String[] args) {
    int[] arr={3,32,5,6,61,9,4,23,35,90};
    int  target=4;
    System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return index(arr,target,start,end);
    }
    static int index(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                start++;
                end = arr[mid - 1];
            } else if (arr[mid] < target) {
                end--;
                start = arr[mid + 1];
            } else {
                return mid;
            }
        }
        return -1;
    }
}
