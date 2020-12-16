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
    removeFront() {
        // removes and return the first node of list
    }
    addBack(val) {
        // add node to end of list
    }
    removeBack() {
        // removes and return the last node of list
    }
    front() {
        // returns val of the first node
    }
    back() {
        // returns val of the last node
    }
    contains(val) {
        // returns a boolean on whether or not the given value is in the list
    }
    size() {
        // returns the # of nodes in the list
    }
}