import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: czhao2
 * @description:
 * @date: 2021-01-10 16:59
 **/
public class ThirdTest {

    public static void main(String[] args) {
        File file = new File("D:\\companyProjectMyself\\LOL\\test\\lol.txt");
        // 获取文件的所在目录
        File parentFile = file.getParentFile();
        // 如果目录不存在，则创建该目录
        if (!parentFile.exists()) {
            // 把不存在的目录都创建好
            parentFile.mkdirs();
        }
        byte []data = { 88, 89};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
