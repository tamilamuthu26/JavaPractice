package EXAMPLE2;

public class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        ReportSaver saver = new ReportSaver();
        ReportSender sender = new ReportSender();

        reportService.generateReport();
        saver.saveReport();
        sender.sendReport();
    }
}
