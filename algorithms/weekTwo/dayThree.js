// Flatten Child Lists
// ---------------------------------------------------------------------------
// Why limit nodes to contain only one pointer? For this challenge, each node has .next as always, but also a .child that is either null or points to the head of another list. Each node in those child lists might point to another list, and so on. Don’t alter .child, but rearrange.next pointers to ‘flatten’ this hierarchy into a one linear list, from head node through all others via .next.

// KthLast
// ----------------------------------------------------------------------
//  	Given k, return the value that is ‘k’ nodes from the list’s end. If given (list,1), return the list’s last value. If given (list,4), return the value at the node that has exactly 3 nodes following it.



// Singily Linked List
// ------------------------------------------------------------
// Reverse the sequence of nodes in the list.

class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
        this.child = null;
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

}

const myListOne = new SLL();
myListOne.add(1);
myListOne.add(4);

const myListTwo = new SLL();
myListTwo.add(2);
myListTwo.add(3);

const myListThree = new SLL();
myListThree.add(5);
myListThree.add(6);

myListOne.head.child = myListTwo.head;
myListOne.head.next.child = myListThree.head;

console.log(myListOne);


function flatten(list) {
    // code here
    let runner = list.head;
    while(runner) {
        if(runner.child != null) {
            let next = runner.next;
            let runnerTwo = runner.child;
            while(runnerTwo.next) {
                runnerTwo = runnerTwo.next;
            }
            runner.next = runner.child;
            runnerTwo.next = next;
            runner = next;
        } else {
            runner = runner.next;
        }
    }
}

flatten(myListOne);
myListOne.printValues();
// should print 1-2-3-4-5-6

