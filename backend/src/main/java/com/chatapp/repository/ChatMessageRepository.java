// 5. ChatMessageRepository - src/main/java/com/chatapp/repository/ChatMessageRepository.java
package com.chatapp.repository;

import com.chatapp.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
