import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", "测试标题2");
        parameters.put("name", "张三");
        parameters.put("address", "BJ");
        parameters.put("email", "dfgdfg@abc.com");

        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> detail = new HashMap<>();
            detail.put("subTitle", "小标题" + i);


            List<Map<String, Object>> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Map<String, Object> listData = new HashMap<>();
                listData.put("label1", "标签1-" + i);
                listData.put("label2", "标签2-" + i);
                listData.put("label3", "标签3-" + i);


                List<Map<String, Object>> subList = new ArrayList<>();
                for (int k = 0; k < 5; k++) {
                    Map<String, Object> subListData = new HashMap<>();
                    subListData.put("subLabel1", "子标签1-" + i);
                    subListData.put("subLabel2", "子标签2-" + i);
                    subListData.put("subLabel3", "子标签3-" + i);

                    subList.add(subListData);
                }


                listData.put("subList", subList);

                list.add(listData);
            }
            detail.put("list", list);

            data.add(detail);
        }

        PdfUtil.outputPdfFile(parameters, data, "test2.jrxml", "test2.pdf");
    }
}
