import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

class TreeNode {
    Team team;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public TreeNode(Team team) {
        this.team = team;
        left = null;
        right = null;
        parent = null;
    }
}

public class OlympicTreeBuilder {
    public static TreeNode buildTree(Vector<Match> matches) {
        if (matches == null || matches.isEmpty()) {
            System.out.println(123);
            return null;
        }

        Map<Team, TreeNode> teamNodes = new HashMap<>();
        System.out.println(matches);
        for (Match match : matches) {
            Team team1 = match.getTeamFirst();
            Team team2 = match.getTeamSecond();
            System.out.println(match.getTeamFirst().getTeamName()+ match.getTeamSecond().getTeamName());

            TreeNode node1 = teamNodes.getOrDefault(team1, new TreeNode(team1));
            TreeNode node2 = teamNodes.getOrDefault(team2, new TreeNode(team2));

            node1.parent = null;
            if(!(node2 == null)){
                node2.parent = null;
            }


            if (match.getWinner() == team1) {
                node1.parent = new TreeNode(team1);
                node1.parent.left = node1;
                node1.parent.right = node2;
            } else {
                node2.parent = new TreeNode(team2);
                node2.parent.left = node2;
                node2.parent.right = node1;
            }

            teamNodes.put(team1, node1.parent);
            teamNodes.put(team2, node2.parent);
        }

        return teamNodes.get(matches.get(matches.size()-1).getWinner());
    }
    public static Vector printTree(TreeNode root) {
        Vector grid = new Vector<>();
        printTreeRecursive(root, 0, grid);
        return grid;
    }

    private static void printTreeRecursive(TreeNode node, int depth, Vector grid) {
        if (node == null) {
            return;
        }
        grid.add(node.team.getTeamName());
        // Выводим отступы в зависимости от глубины узла
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        System.out.println(node.team.getTeamName());
        Vector left = new Vector();
        Vector right = new Vector<>();

        printTreeRecursive(node.left, depth + 1, left);
        if(!left.isEmpty()){
            grid.add(left);
        }

        printTreeRecursive(node.right, depth + 1, right);
        if(!right.isEmpty()){
            grid.add(right);
        }

    }

    public static void main(String[] args) {
        Vector<Match> matches = new Vector<>();


        TreeNode root = buildTree(matches);
        // Теперь дерево олимпийской сетки построено и можно выполнять операции с ним
    }
}


