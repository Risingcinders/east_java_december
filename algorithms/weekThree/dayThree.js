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
    isBalanced(){
        // returns a boolean on whether or not the tree is balanced
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
console.log(myTree.isBalanced())
// true
const treeTwo = new BST();
treeTwo.add(30);
treeTwo.add(20);
treeTwo.add(10);
treeTwo.add(5);
treeTwo.add(60);
treeTwo.add(40);
treeTwo.add(70);
console.log(treeTwo.isBalanced())
// false