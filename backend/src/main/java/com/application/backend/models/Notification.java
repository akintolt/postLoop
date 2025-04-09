package com.application.backend.models;

import jakarta.persistence.*;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;  // The notification message (e.g., "User X liked your post")
    private boolean read;  // Whether the notification has been read or not

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // The user who will receive the notification

    // Getters and setters
}
