import java.util.*;



public class customTree {
    TreeNode root;

    customTree(int value){
        this.root=new TreeNode(value);
        this.root.parent=null;
    }

    public void add(int parent,int value){
        TreeNode parentNode=findNode(root, parent);

        parentNode.addChild(value);
    }//특정 값을 가지는 부모 노드 밑에 삽입

    public TreeNode parent(int parentValue){
        return findNode(root, parentValue).parent;
    }

    public ArrayList child(int parentValue){
        return findNode(root, parentValue).child;
    }

    public boolean isParent(TreeNode t){
        return t.child != null && !t.child.isEmpty();
    } //자식이 없다면 내부 노드이니 이걸로 검사가능

    public boolean isRoot(TreeNode t){
        return t.parent==null?true:false;
    }

    public int depth(int parentValue){
        TreeNode t = findNode(root, parentValue);
        if (t == null) {
            return -1; // 노드를 찾지 못한 경우
        }
        if (!isRoot(t)) {
            return depth(t.parent.value) + 1;
        } else {
            return 1;
        }
    }

    public int height(int parentValue){
        TreeNode t = findNode(root, parentValue);
        if (t == null) {
            return 0;
        }
        if (!isParent(t)) {
            return 0;
        }
        
        int max = 0;
        for (TreeNode tmp : t.child) {
            int n = height(tmp.value);
            if (max < n) {
                max = n;
            }
        }
        return max + 1;
    }
    private TreeNode findNode(TreeNode node,int parentValue){
        if(parentValue==0)
            return root;

        if(node==null)
            return null;

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty())
        {
            TreeNode tmp=queue.poll();

            if(tmp.value==parentValue)
                return tmp;
            else
                queue.addAll(tmp.child);
        }

        return null;
    }
    public void preOrder(TreeNode Node){
        System.out.println(Node.value);

        for(TreeNode T:Node.child){
            preOrder(T);
        }
    }

    public void postOrder(TreeNode Node){
        for(TreeNode T:Node.child){
            postOrder(T);
        }

        System.out.println(Node.value);
    }

    public void levelOrder(TreeNode node) {
        if (node == null) {
            return;
        }
    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
    
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            System.out.println(tmp.value);
    
            queue.addAll(tmp.child);
        }
    }
    

    public class TreeNode{
        int value;
        TreeNode parent;
        ArrayList<TreeNode> child;//리스트를 통해 다수의 자식 관리

        TreeNode(int value){
            this.value=value;
            this.child=new ArrayList<>();
        }

        private void addChild(int value){
            TreeNode child=new TreeNode(value);
            child.parent=this;
            this.child.add(child);
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("노드 값: ").append(value).append(", ");
            str.append("부모 노드 값: ").append(parent != null ? parent.value : "null").append(", ");
            str.append("자식 노드 값: [");

            for (TreeNode t : child) {
                str.append(t.value).append(", ");
            }

            if (!child.isEmpty()) {
                str.setLength(str.length() - 2); // 마지막 쉼표와 공백 제거
            }

            str.append("]");
            return str.toString();
        }
    }
}
