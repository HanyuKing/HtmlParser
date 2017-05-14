import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by wanghanyu on 2017/4/28.
 */
public class Main {
    public static void main(String[] args) {
        String str = "<div class='aaa' property='{\"name\":\"asd\"}'></div><div></div>";
        Document doc = Jsoup.parse(str);
        Elements eles = doc.select("div.aaa");
//        for(Element ele : eles) {
//            String property = ele.attr("property");
//            JSONObject object = JSONObject.parseObject(property);
//            System.out.println(object.get("name"));
//        }
        Element ele = eles.get(0);
        ele.tagName("ware-title");
        System.out.println(doc.body().children().toString());
    }
}
