package ru.aston.course.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "all_connection")
public class AllConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "site", nullable = false, length = 256)
    private String site;

    @Column(name = "dates", nullable = false, length = 256)
    private String dates;

    @Column(name = "users", nullable = false, length = 256)
    private String users;
}