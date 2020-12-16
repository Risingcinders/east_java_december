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

function kthLargest(list, k) {
    if(!list.head){
        return false;
    }
    if(!k){
        return false;
    }
    var runner = list.head;
    var follower = false;
    while(runner){
        if(!k && !follower){
            console.log('setting follower');
            follower = list.head;
        }
        if(follower){
            follower = follower.next;
        }
        runner = runner.next;
        k--;
    }
    if(follower){
        follower = follower.val;
    }
    if(!follower && k === 0){
        follower = this.head.val;
    }
    return follower;
};


const myList = new SLL();
myList.add(1);
myList.add(2);
myList.add(3);
myList.add(4);
myList.add(5);
myList.add(6);

let result = kthLargest(myList, 4);
console.log('result is: ', result);
// should log 3