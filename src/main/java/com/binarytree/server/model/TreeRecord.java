package com.binarytree.server.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TreeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Integer> numbers;

    @Lob
    private String treeStructure;

    public TreeRecord() {}

    public TreeRecord(List<Integer> numbers, String treeStructure) {
        this.numbers = numbers;
        this.treeStructure = treeStructure;
    }

    public Long getId() {
        return id;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public String getTreeStructure() {
        return treeStructure;
    }
}
