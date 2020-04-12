import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class _1305AllElementsTwoBT {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> output = new ArrayList<>();
        Stream.of(inorder(root1, new ArrayList<>()),
                inorder(root2, new ArrayList<>())).forEach(output::addAll);
        Collections.sort(output);
        return output;
    }

    public List<Integer> inorder(TreeNode root, List<Integer> arr){
        if (root == null) return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }
}
