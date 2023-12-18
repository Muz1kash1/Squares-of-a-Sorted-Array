package org.example.treetraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZigZagTraversal {

  public static List<List<Integer>> zigzagTraversal(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    depthFirstSearch(root,0,result);
    for(int i = 1;i < result.size();i+=2) {
      Collections.reverse(result.get(i));
    }
    return result;
  }

  /**
   * Поиск в глубину.
   * @param root корень
   * @param level уровень
   * @param result результат
   */
  private static void depthFirstSearch(TreeNode root, Integer level, List<List<Integer>> result) {
    if (root == null) {
      return;
    }
    if (level >= result.size()) {
      result.add(new ArrayList<>());
    }
    result.get(level).add(root.value);
    depthFirstSearch(root.left, level + 1, result);
    depthFirstSearch(root.right, level + 1, result);
  }
}
