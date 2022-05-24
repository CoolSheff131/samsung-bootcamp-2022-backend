package com.coolsheff.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@javax.persistence.Entity
@Table(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Review.class, mappedBy = "tags")
    private Set<Review> reviews = new HashSet<>();
}
