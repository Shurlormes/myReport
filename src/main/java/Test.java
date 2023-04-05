import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", "测试标题");
        parameters.put("name", "王小明");
        parameters.put("address", "SZ");
        parameters.put("email", "asd123@abc.com");

        list.add(parameters);

        PdfUtil.outputPdfFile(new HashMap<>(), list, "test.jrxml", "test.pdf");
    }
}
