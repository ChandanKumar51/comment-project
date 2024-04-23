package com.comment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "by_user")
    private String username;

    @Column(name = "text")
    private String text;

    @Column(name = "date_of_comment")
    private String dateOfComment;

    // Getters and setters
}
