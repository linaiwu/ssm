package com.ssm.demoTest;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.Iterator;

public class JsonNodeTest {

    public static void main(String[] args) {
        String json = "{\"username\":\"zhangsan\",\"性别\":\"100.00\",\"company\":{\"companyName\":\"中华\",\"address\":\"北京\"},\"cars\":[\"奔驰\",\"宝马\"]}";
        ObjectMapper mapper = new ObjectMapper();
        //JSON ----> JsonNode
        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.configure(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN,true);
            mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,true);
            JsonNode node = mapper.readValue(json,JsonNode.class);
            System.out.println(node);
            String json2 = mapper.writeValueAsString(node);
            System.out.println(json2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //JsonNode rootNode = mapper.readTree(json);
        /*Iterator<String> keys = rootNode.fieldNames();
        while(keys.hasNext()){
            String fieldName = keys.next();
            System.out.println(fieldName + ": " + rootNode.path(fieldName).toString());
        }
        //JsonNode ----> JSON
        System.out.println(mapper.writeValueAsString(rootNode));*/
    }
}
