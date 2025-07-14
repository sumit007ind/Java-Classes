package CyclicSort;

public class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i+1) {
                int j = i + 1;
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }

        }
        return -1;
    }
    private static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first ]=arr[end];
        arr[end]=temp;
    }

    }


