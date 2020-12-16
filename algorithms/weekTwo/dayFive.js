// Doubly Linked List

class DLNode {
    constructor(value) {
        this.val = value;
        this.next = null;
        this.prev = null;
    }
}

class DLList {
    constructor() {
        this.head = null;
        this.tail = null;
    }
    addFront(val) {
        // add node to beginning of list
        let newNode = new DLNode(val);
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }
    printValues() {
        let runner = this.head;
        while(runner != null) {
            console.log(runner.val);
            runner = runner.next;
        }
    }
    reverse() {
        // code here
    }
}

const myDList = new DLList();
myDList.addFront(1);
myDList.addFront(2);
myDList.addFront(3);
myDList.addFront(4);
myDList.addFront(5);
console.log(myDList.printValues());
myDList.reverse();
console.log(myDList.printValues());