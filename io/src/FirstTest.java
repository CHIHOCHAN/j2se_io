import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author: czhao2
 * @description:
 * @date: 2021-01-10 15:46
 **/
public class FirstTest {
    public static void main(String[] args) throws IOException {
        // 绝对路径
        File file = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径为:" + file.getAbsolutePath());
        // 相对
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(file, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

        // ***********************************************复制过来的代码*****************************
        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f4 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f4);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");

        // *************************************************复制过来的代码
        File copyFile = new File("d:/LOLFolder/skin/garen.ski");

        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        copyFile.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[]fs= copyFile.listFiles();

        // 以字符串形式返回获取所在文件夹
        copyFile.getParent();

        // 以文件形式返回获取所在文件夹
        copyFile.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        copyFile.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        copyFile.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        copyFile.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        copyFile.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
//        copyFile.listRoots();

        // 刪除文件
        copyFile.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        copyFile.deleteOnExit();
    }
}
