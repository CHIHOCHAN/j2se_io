import java.io.*;

/**
 * @author: czhao2
 * @description: 以字节流的形式读取文件内容
 * @date: 2021-01-10 16:45
 **/
public class SecondTest {

    public static void main(String[] args) {
        // 里面的AB对应 ASCII码的 65 66
        File file = new File("D:\\companyProjectMyself\\lol.txt");
        try {
            // 创建基于文件的输入流
            FileInputStream fileInputStream = new FileInputStream(file);
            // 创建字节数组，其长度就是文件的长度
            byte[] all = new byte[(int) file.length()];
            // 以字节流的形式读取文件所有内容
            fileInputStream.read(all);
            for(byte b : all) {
                System.out.println(b);
            }
            // 每次用完后，流都应该关闭
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
}
