// Binary Search Trees
// -----------------------------------------------------------------
class BSTNode {
    constructor(value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        this.root = null;
    }
    add(newVal) {
        var newNode = new BSTNode(newVal);
        if(!this.root){
            this.root = newNode;
            return;
        } else {
            var runner = this.root;
            while(runner){
                if(runner.val < newVal){
                    if(runner.right == null){
                        runner.right = newNode;
                        return;
                    }
                    runner = runner.right;
                }
                else {
                    if(runner.left == null){
                        runner.left = newNode;
                        return;
                    } 
                    runner = runner.left;
                }
            }
        }
    }
    size(node=this.root) {
        // return the # of nodes in the list
        if(node == null) return 0;
        return this.size(node.left) + this.size(node.right) + 1;
    }
    height(node=this.root) {
        // return the # of rows of the tree
    }
}

const myTree = new BST();
myTree.add(50);
myTree.add(25);
myTree.add(45);
myTree.add(75);
myTree.add(10);
myTree.add(60);
myTree.add(80);
console.log(myTree.size());
// log 7
console.log(myTree.height());
// log 3