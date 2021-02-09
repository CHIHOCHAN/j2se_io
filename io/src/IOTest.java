import java.io.*;

/**
 * @author: czhao2
 * @description:
 * @date: 2021-01-12 19:04
 **/
public class IOTest {

    public static void main(String[] args) throws IOException {
        test1();
        test2();
        test3();
    }

    // 最简单的字节流（耗时最久）
    private static void test1() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\md2\\123.mp3");
        FileOutputStream outputStream = new FileOutputStream("123.mp3");
        int len;
        // 开始时间
        long begin = System.currentTimeMillis();
        // 一次读取一个字节
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }
        // 用时毫秒
        System.out.println(System.currentTimeMillis() - begin);// 43207
        //关闭流释放资源
        inputStream.close();
        outputStream.close();
    }

    // 设置读取一个字节数组，提高了效率
    private static void test2() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\md2\\123.mp3");
        FileOutputStream outputStream = new FileOutputStream("123.mp3");
        int len;
        byte[] bs = new byte[1024];
        // 开始时间
        long begin = System.currentTimeMillis();
        // 一次读取一个字节数组
        while ((len = inputStream.read(bs)) != -1) {
            outputStream.write(bs, 0, len);
        }
        // 用时毫秒
        System.out.println(System.currentTimeMillis() - begin);// 50
        inputStream.close();
        outputStream.close();
    }

    // 高速缓冲流
    private static void test3() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\md2\\123.mp3");
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        FileOutputStream outputStream = new FileOutputStream("123.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        int len;
        byte[] bs = new byte[1024];
        // 开始时间
        long begin = System.currentTimeMillis();
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        // 用时毫秒
        System.out.println(System.currentTimeMillis() - begin);// 14
        bis.close();
        bos.close();
    }
}
