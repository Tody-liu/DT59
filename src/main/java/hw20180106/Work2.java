/**
 * Project Name:DT59
 * File Name:Work2.java
 * Package Name:hw20180106
 * Date:2018年1月7日下午2:05:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180106;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午2:05:06 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Work2 {

    public static void main(String[] args) {
        Work2 work = new Work2();
        String pathName1 = null;
        String pathName2 = null;
        work.CopyFile(pathName1, pathName2);
    }

    // 将复制文件封装为一个方法。在外部直接调用；
    public void CopyFile(String pathName1, String pathName2) {
        File file1 = new File(pathName1);// 需要拷贝的文件绝对路径
        File file2 = new File(pathName2);// 需要拷贝后文件存放路径
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
