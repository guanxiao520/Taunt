package com.caryguan.taunt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author GuanCary
 * @Date 2020/7/7 18:16
 * @Version 1.0
 **/
public class ContentUtil {
    public static String getContent() {

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Map> entity = restTemplate.getForEntity("https://api.nextrt.com/V1/Dutang", Map.class);
            //得到状态码
            HttpStatus statusCode = entity.getStatusCode();
            //2开头的状态码代表成功
            if (statusCode.is2xxSuccessful()) {
//             {
//                 "data": [
//                 {
//                     "content": "二十年前吃小浣熊，集不齐卡的傻孩子们，依然集不齐五福。",
//                         "id": 876,
//                         "tid": 5740
//                 }
// ],
//                 "msg": "毒汤数据获取成功！",
//                     "status": 1
//             }
                //我们要获取
                Map body = entity.getBody();
                //得到data标签的所有元素
                List data = (List) body.get("data");
                //得到第一个元素
                Map map = (Map) data.get(0);
                String content = (String) map.get("content");
                return content;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}