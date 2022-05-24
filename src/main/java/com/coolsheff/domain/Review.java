package com.coolsheff.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@javax.persistence.Entity
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "uploadDate")
    private String uploadDate;

    @OneToMany(targetEntity = Comment.class, fetch = FetchType.LAZY,  mappedBy = "review")
    private List<Comment> comments;

    @ManyToMany(targetEntity = Tag.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "review_tag",
                joinColumns = @JoinColumn(name = "review_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<>();

}
