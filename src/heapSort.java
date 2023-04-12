
public class heapSort {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        Func heap = new Func();
        heap.heapSort(sortArr);
        for (int j : sortArr) {
            System.out.print(j + "\n");
        }
    }
}
