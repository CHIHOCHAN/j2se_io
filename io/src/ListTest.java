import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: czhao2
 * @description:
 * @date: 2021-02-08 15:59
 **/
public class ListTest {
    public static void main(String[] args) {
        List<String> areaAuth = Arrays.asList("GZ", "XJ", "SY", "BJ");
        System.out.println(areaAuth);
        // List转化为String
        String joinString = String.join(",", areaAuth);
        System.out.println(joinString);
        // String转化为List
        String[] split = joinString.split(",");
        List<String> list = Arrays.asList(split);
        System.out.println(list);

    }
}
