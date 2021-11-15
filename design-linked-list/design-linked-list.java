class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    
    private Node head;
    private int size;
    
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index>= size) return -1;
    
        Node curr = head; 
        for(int i=0; i<index; i++) curr= curr.next;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        if(head == null) {
            head = new Node(val);
        }else {
            Node oneMoreGuy = new Node(val);
            oneMoreGuy.next = head; 
            head = oneMoreGuy;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node tail = new Node(val);
        if(head == null){
            head = tail;
        }else {
            Node current = head;
            while(current.next != null) current = current.next;
            current.next = tail;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index> size) return;
        if(index == size) {
            addAtTail(val);
            
        }else if(index == 0) {
            addAtHead(val);
        }else {
            size++;
            Node curr = head;
            for(int i=0; i<index-1; i++) {
               curr =curr.next; 
            }
            Node newGuy = new Node(val);
            newGuy.next = curr.next;
            curr.next = newGuy;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size || size < 0) return;
        if(index ==0) {
           head = head.next;
        }else {         
            Node curr = head;
            for(int i=0; i<index-1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */