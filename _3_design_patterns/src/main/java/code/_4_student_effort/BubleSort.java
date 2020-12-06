package code._4_student_effort;

public class BubleSort implements SortingStrategy {
    public void sort(Integer[] list) {
        boolean swapped;

        for (int i = 0; i < list.length - 1; i++) { // time: O(N), where N = length of list, best case when list is sorted
            swapped = false;                              // O(N*N), worst case when list is reverse sorted

            for (int j = 0; j < list.length - i -1; j++) {
                if (list[j] > list[j + 1]) {
                    swap(list, j, j+1);
                    swapped = true;
                }
            }

            if (swapped == false) break;
        }
    }

    private void swap(Integer[] list, int idx1, int idx2) {
        int temp = list[idx1];
        list[idx1] = list[idx2];
        list[idx2] = temp;
    }
}
