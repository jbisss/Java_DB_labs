package presentation;

public class CellCollectionDriver {
    public static void main(String[] args) {
        CellCollection cells = new CellCollection(5);

        cells.add(new Cell());
        cells.add(new Cell());

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));

        cells.get(0).setData("First cell");
        cells.get(1).setData("Second cell");

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));
    }
}
