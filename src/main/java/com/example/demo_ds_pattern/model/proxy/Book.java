package com.example.demo_ds_pattern.model.proxy;

import com.example.demo_ds_pattern.interfaces.IBookService;

import java.io.*;

public class Book implements IBookService {
    @Override
    public void read(String url) {
        System.out.println("Read file with url: \n " + url);

        InputStream inputStream = null ;
        BufferedInputStream bufferedInputStream = null ;

         try  {
             inputStream = new FileInputStream(new File(url));
             bufferedInputStream = new BufferedInputStream(inputStream);

             byte[] bytes = new byte[1024];
             int bytesRead = bufferedInputStream.read(bytes);

             while (bytesRead != -1) {
                 String line = new String(bytes, 0, bytesRead);
                 System.out.print(line);
                 bytesRead = bufferedInputStream.read(bytes);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         finally {
             if(inputStream!= null){
                 try {
                     inputStream.close();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }

             if(bufferedInputStream!= null){
                 try {
                     bufferedInputStream.close();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }
         }

    }

    @Override
    public void write(String s) {
        System.out.println("Write file with content:\n " + s);
    }
}
