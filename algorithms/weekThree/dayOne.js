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
    min() {
        // return the min val
    }
    contains(searchVal) {
        // return a boolean if the val exist in the tree
    }
    add(newVal) {
        // add the value to the correct position in the tree
    }
}

const myTree = new BST();
myTree.add(50);
myTree.add(25);
myTree.add(75);
myTree.add(10);
myTree.add(80);
console.log(myTree.min())
// 10
console.log(myTree.contains(30));
// false
console.log(myTree.contains(80));
// true