import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PdfUtil {

    private static String outputPath = "D:\\";

    private static String reportPath = "reports/";

    public static void outputPdfFile(Map<String, Object> params, List<Map<String, Object>> data, String reportFilename, String outputFilename) {
        JRBeanCollectionDataSource collectionDataSource = new JRBeanCollectionDataSource(data);
        try {

            InputStream inputStream = Test.class.getClassLoader().getResourceAsStream(reportPath + reportFilename);
            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, collectionDataSource);
            File file = new File(outputPath  + outputFilename);
            // 数据写入pdf模板
            JasperExportManager.exportReportToPdfFile(jasperPrint, file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
