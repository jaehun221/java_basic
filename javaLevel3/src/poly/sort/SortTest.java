package poly.sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성1
        Sort[] sort = {new BubbleSort(), new HeapSort(), new QuickSort()};

        int[] nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();
        Sort arrSort = sort[choice-1];
        selectedSort(arrSort, nums);
    }


    private static void selectedSort(Sort sort, int[] arr) {

        sort.ascending(arr);
        sort.descending(arr);
        sort.description(arr);
    }
}
