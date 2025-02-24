package HFDP.chapter1StrategyPattern.sortingAlgorithms;

class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortData(int[] data) {
        strategy.sort(data);
    }
}