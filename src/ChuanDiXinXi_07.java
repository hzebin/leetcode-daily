import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author huangzebin
 * @description BFS（队列）
 * @createDate: 2021/7/1 10:52
 */
public class ChuanDiXinXi_07 {

    public static void main(String[] args) {
        ChuanDiXinXi_07 entity = new ChuanDiXinXi_07();
        int[][] relation = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
        int num = entity.numWays(5, relation, 3);
        System.out.println(num);
    }

    /**
     * @param n        玩家总数
     * @param relation 关系
     * @param k        k轮
     * @return
     */
    public int numWays(int n, int[][] relation, int k) {
        // 初始化
        List<List<Integer>> edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] edge : relation) {
            edges.get(edge[0]).add(edge[1]);
        }
        
        // 广搜
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty() && k > 0) {
            int size = queue.size();
            while (size-- > 0) {
                List<Integer> list = edges.get(queue.poll());
                for (Integer i : list) {
                    queue.offer(i);
                }
            }
            --k;
        }
        
        int res = 0;
        if (k <= 0) {
            while (!queue.isEmpty()) {
                if (queue.poll() == n - 1) {
                    ++res;
                }
            }
        }
        return res;
    }

}
