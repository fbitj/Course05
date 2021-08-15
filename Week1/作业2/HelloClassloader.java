package java05.jvm01.homework;

import java.io.*;
import java.lang.reflect.Method;

public class HelloClassloader extends ClassLoader{

    public static void main(String[] args) throws Exception {
        Object helloObj = new HelloClassloader().findClass("D:\\Develop\\Java进阶训练营\\Week1\\课件资料\\Hello.xlass").newInstance();
        Method helloMethod = helloObj.getClass().getMethod("hello");
        helloMethod.invoke(helloObj);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = new byte[0];

        try {
            FileInputStream is = new FileInputStream(name);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

            data = bos.toByteArray();
            for (int i = 0; i < data.length; i++) {
                data[i] = (byte) (255 - data[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defineClass(null, data, 0, data.length);
    }
}
