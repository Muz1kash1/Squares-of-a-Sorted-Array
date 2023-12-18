package org.example.treetraversal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;


class ZigZagTraversalTest {

  @Test
  @DisplayName("Пустое дерево возвращает пустой список")
  void zigzagTraversal_emptyTree_returnsEmptyList() {
    TreeNode root = null;

    List<List<Integer>> result = ZigZagTraversal.zigzagTraversal(root);

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  @DisplayName("Дерево только с корнем возвращает список из одного списка")
  void zigzagTraversal_singleNodeTree_returnsSingleElementList() {
    TreeNode root = new TreeNode(1);

    List<List<Integer>> result = ZigZagTraversal.zigzagTraversal(root);

    Assertions.assertThat(result).
      containsExactly(List.of(1));
  }

  @Test
  @DisplayName("Дерево только с корнем и двумя его наследниками возвращает верный список из двух списков")
  void zigzagTraversal_treeWithTwoNodes_returnsTwoElementList() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    List<List<Integer>> result = ZigZagTraversal.zigzagTraversal(root);

    Assertions.assertThat(result).containsExactly(List.of(1), List.of(3, 2));
  }

  @Test
  @DisplayName("Дерево из 6 узлов возвращает верный список из трех списков")
  void zigzagTraversal_treeWithThreeNodes_returnsThreeElementList() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    List<List<Integer>> result = ZigZagTraversal.zigzagTraversal(root);

    Assertions.assertThat(result).containsExactly(List.of(1), List.of(3, 2), List.of(4, 5, 6));
  }
}