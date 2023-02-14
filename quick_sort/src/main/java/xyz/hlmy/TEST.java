package xyz.hlmy;

/**
 * @ProjectName: hodgepodge
 * @ClassName: TEST
 * @Author: lipenghui
 * @Description:
 * @Date: 2023/02/14 13:49
 */
public class TEST {
    public static void main(String[] args) {
        testQuickSort();

    }

    /**
     * 快速排序
     */
    private static void testQuickSort() {
        int[] array = {5, 4, 1, 9, 2, 3, 7, 6, 8};
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        quickSort.print();
    }
}
