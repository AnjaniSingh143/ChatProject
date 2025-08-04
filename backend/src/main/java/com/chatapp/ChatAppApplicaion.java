// === Project Structure Overview ===
// You will create a full stack real-time chat application with user authentication.
// Technologies used:
// - Frontend: HTML, CSS, JavaScript
// - Backend: Java with Spring Boot
// - WebSocket: for real-time messaging
// - JWT: for authentication
// - Database: MySQL or PostgreSQL
// - JPA/Hibernate: ORM

// === Backend Files ===

// 1. Main Application File - src/main/java/com/chatapp/ChatApplication.java
package com.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.chatapp.repository")
@EntityScan(basePackages = "com.chatapp.model") // 👈 This is critical
class ChatAppApplication {
    public static void main(String[] args) {

        SpringApplication.run(ChatAppApplication.class, args);
    }
}