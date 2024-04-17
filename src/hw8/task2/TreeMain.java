package hw8.task2;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree("maple", 50);
        Tree tree2 = new Tree("oak");
        Tree tree3 = new Tree(200, 150, "green");
        System.out.println(tree);
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
