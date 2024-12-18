package com.binarytree.server.controller;
import com.binarytree.server.model.BinaryTree;
import com.binarytree.server.model.TreeRecord;
import com.binarytree.server.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @PostMapping(value = "/process-numbers", produces = "application/json")
    public String processNumbers(@RequestBody List<Integer> numbers) {
        BinaryTree tree = treeService.createBinaryTree(numbers);
        return tree.toSerializedString();
    }

    @GetMapping(value = "/previous-trees", produces = "application/json")
    public List<TreeRecord> getPreviousTrees() {
        return treeService.getAllTrees();
    }
}


