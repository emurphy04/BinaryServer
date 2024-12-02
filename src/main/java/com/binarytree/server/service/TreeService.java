package com.binarytree.server.service;
import com.binarytree.server.model.BinaryTree;
import com.binarytree.server.model.TreeRecord;
import com.binarytree.server.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeRepository treeRepository;

    public BinaryTree createBinaryTree(List<Integer> numbers) {
        BinaryTree tree = new BinaryTree();
        for (int number : numbers) {
            tree.insert(number);
        }
        TreeRecord record = new TreeRecord(numbers, tree.toSerializedString());
        treeRepository.save(record);
        return tree;
    }

    public List<TreeRecord> getAllTrees() {
        return treeRepository.findAll();
    }
}
