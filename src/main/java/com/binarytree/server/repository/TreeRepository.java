package com.binarytree.server.repository;

import com.binarytree.server.model.TreeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<TreeRecord, Integer> {
}
