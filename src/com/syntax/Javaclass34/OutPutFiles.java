package com.syntax.Javaclass34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutPutFiles {
    public static void main(String[] args) throws IOException {

        //Please change this path
        String path="C:\\Users\\Juan\\IdeaProjects\\First IntelliJ Project\\src\\com.syntax.Javaclass34\\Credentials.properties";
        //connection to write the data to file
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();


        //setting the property
        properties.setProperty("Number","111111");
        //storing the data
        properties.store(fileOutputStream,"Storing the data");
    }
}