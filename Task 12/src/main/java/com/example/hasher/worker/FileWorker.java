package com.example.hasher.worker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.nio.charset.StandardCharsets;

@Component
public class FileWorker {
    @Value("${file.target}")
    private String pathForTarget;
    @Value("${file.result}")
    private String pathForResult;
    private File file;

    @PostConstruct
    public void init(){
        System.out.println("!Start reading");

        try {
            file = new File(pathForTarget);

            String data = new String("Null");

            if(!file.exists()){
                FileOutputStream fileOutputStream = new FileOutputStream(pathForResult);
                fileOutputStream.write(data.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
                return;
            }

            data = readFile();
            writeFile(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(){
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            do {
                str = bufferedReader.readLine();
                stringBuilder.append(str + "\n");

            } while (str != null);

            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }


    private void writeFile(String data){
        System.out.println("!Start hashing");

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashedData = bCryptPasswordEncoder.encode(data);

        System.out.println(hashedData);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathForResult);
            fileOutputStream.write(hashedData.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @PreDestroy
    public void destroy() throws IOException {
        if(file.exists()) {
            File filePath = new File(file.getCanonicalPath());
            filePath.delete();
        }
    }
}
