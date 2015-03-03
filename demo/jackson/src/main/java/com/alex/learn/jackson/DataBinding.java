package com.alex.learn.jackson;

import com.alex.learn.jackson.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by hanjunnan on 15/3/3.
 */
public class DataBinding {
    public static void main(String args[]) throws IOException {
        // 读取json
        readFromJson();

        // 写入json
        writeToJson();
    }

    public static void writeToJson() throws IOException {
        User user = new User();
        user.setGender(User.Gender.FEMALE);
        User.Name name = new User.Name();
        name.setFirst("alex");
        name.setLast("han");
        user.setName(name);
        user.setVerified(false);
        byte[] image = "hello".getBytes();
        user.setUserImage(image);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("hello.json"), user);
    }

    public static void readFromJson() throws IOException {
        File sourceJson = new File(DataBinding.class.getClassLoader().getResource("user.json").getPath());
        System.out.println(sourceJson.exists());
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(sourceJson, User.class);
        System.out.println(user);
    }
}
