package example31;

public class CellDriver {
    public static void main(String[] args) {
        Cell<Integer, String> mixCell = new Cell<>();
        Cell<Integer, Integer> intCell = new Cell<>();

        mixCell.setValue(5, "String");
        intCell.setValue(20, 10);

        int n = mixCell.getT();
        String str = mixCell.getR();

        int m = intCell.getR();
        int b = intCell.getT();

        System.out.println(mixCell);
        System.out.println(intCell);
    }
}
