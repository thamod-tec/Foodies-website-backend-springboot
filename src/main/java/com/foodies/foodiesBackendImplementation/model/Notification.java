package com.foodies.foodiesBackendImplementation.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
   @Id
   private String id;
   private String userId;
   private String shopOwnerId;
   private String message;
   private boolean read;
   private LocalDateTime createdAt;
}