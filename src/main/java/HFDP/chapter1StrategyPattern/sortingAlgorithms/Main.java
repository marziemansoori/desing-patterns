package HFDP.chapter1StrategyPattern.sortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] data = {5, 2, 9, 1, 5};

        sorter.setStrategy(new QuickSort());
        sorter.sortData(data); // Sorting using QuickSort

        sorter.setStrategy(new MergeSort());
        sorter.sortData(data); // Sorting using MergeSort
    }
}