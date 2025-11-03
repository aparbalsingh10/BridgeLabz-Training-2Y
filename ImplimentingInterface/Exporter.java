interface Exporter {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exporting JSON...");
    }
}

class Report implements Exporter {
    public void exportCSV() { System.out.println("CSV Exported"); }
    public void exportPDF() { System.out.println("PDF Exported"); }
}

public class ExportDemo {
    public static void main(String[] args) {
        Exporter e = new Report();
        e.exportCSV();
        e.exportJSON();
    }
}
