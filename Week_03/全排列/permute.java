import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permute {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] visited = new int[nums.length];
        backTrace(nums, new LinkedList<Integer>(), visited);
        return res;
    }

    public void backTrace(int[] nums, LinkedList<Integer> track, int[] visited) {
        int size = nums.length;
        if (size == track.size()) {
            res.add(new ArrayList<>(track));
            return;
        }
        for (int i = 0; i < size; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            track.add(nums[i]);
            backTrace(nums, track, visited);
            visited[i] = 0;
            track.removeLast();
        }
    }
}
