public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] vals = {5, 7, 9, 11, 15, 17};
        int target = 7;

        int first = 0, last = vals.length - 1, mid, index = -1;
        while (first <= last) {
            mid = (first + last) / 2;
            if (vals[mid] == target) {
                index = mid;
                break;
            } else if (target < vals[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println("Value is found at index " + index);
        System.out.println("Final value of last is " + last);
    }
}