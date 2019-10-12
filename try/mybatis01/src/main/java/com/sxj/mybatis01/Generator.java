package com.sxj.mybatis01;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: mybatis01
 * @description:
 * @author: sxj
 * @create: 2019-10-12 17:23
 **/
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser parser = new ConfigurationParser(warnings);
        ClassPathResource pathResource = new ClassPathResource("generatorConfig.xml");
        InputStream in = pathResource.getInputStream();
        File f = pathResource.getFile();
        Configuration configuration = parser.parseConfiguration(pathResource.getInputStream());
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, warnings);
        generator.generate(null);

//        Generator generator =new Generator();
//        ClassLoader classLoader = generator.getClass().getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("1.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        String line = null;
//        while ((line = reader.readLine())!=null){
//            System.out.println(line);
//        }
//        inputStream.close();
//        ClassPathResource classPathResource = new ClassPathResource("generatorConfig.xml");
//        File file = classPathResource.getFile();
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        String line = null;
//        while ((line = reader.readLine())!=null){
//            System.out.println(line);
//        }
//        reader.close();

    }
}
