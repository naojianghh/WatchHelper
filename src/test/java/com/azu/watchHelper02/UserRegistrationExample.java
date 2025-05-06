package com.azu.watchHelper02;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import com.azu.watchHelper02.entity.User;

import java.time.LocalDateTime;

public class UserRegistrationExample {
    public static void main(String[] args) {
        // 创建 RestTemplate 实例
        RestTemplate restTemplate = new RestTemplate();

        // 设置请求 URL
        String url = "http://localhost:8082/user/register";

        // 创建 User 对象
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("testPassword");
        user.setEmail("test@example.com");
        user.setCreatedAt(LocalDateTime.now());

        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 创建 HttpEntity 对象
        HttpEntity<User> requestEntity = new HttpEntity<>(user, headers);

        // 发送 POST 请求
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        // 处理响应
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("注册结果: " + response.getBody());
        } else {
            System.out.println("请求失败，状态码: " + response.getStatusCode());
        }
    }
}