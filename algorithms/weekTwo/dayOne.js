// Singily Linked List
// ------------------------------------------------------------
// Reverse the sequence of nodes in the list.

class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }
    add(val) {
        const newNode = new Node(val);
        if(this.head == null) {
            this.head = newNode;
            return;
        } else {
            let runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
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
        let prev = null;
        let runner = this.head;
        let next;
        while(runner != null) {
            next = runner.next;
            runner.next = prev;
            prev = runner;
            runner = next;
            if(next != null) {
                console.log('next.val', next.val);
                console.log('runner.val', runner.val);
            }
            console.log('prev.val', prev.val);
        }
        this.head = prev;
    }
}


const myList = new SLL();
myList.add(1);
myList.add(2);
myList.add(3);
myList.add(4);
myList.add(5);
myList.add(6);
myList.printValues();
myList.reverse();
myList.printValues();
