class MyLinkedList {
    private Node head;
    private Node tail; 

   private int size;

   private class Node{
    private int val;
    private Node next;
    
    public  Node(int val){
        this.val = val;
    }
    public  Node(int val, Node next){
        this.val = val;
        this.next = next;

    }

   }

    public MyLinkedList() {
        this.size = 0;

    }
    
    public int get(int index) {
         if(index < 0 || index >= size) return -1;
         Node temp = head;
        for(int i =0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
       

    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        size++;
        
    }
    
    public void addAtTail(int val) {
        if(tail == null){
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        else if(index == size){
            addAtTail(val);
            return;
        }
       
        Node temp = head;
        for(int i =1; i<index; i++){
            temp = temp.next;
        }
      Node node = new Node(val,temp.next);
      temp.next = node;
      size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0|| index >= size|| head == null) return;
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        
  if(index == 0) {
    head = head.next;
    size--;
    return;
  }
 
        Node temp = head;
        for(int i =1; i<index; i++){
            temp = temp.next;
        }
      if(index == size-1){
        temp.next = null;
        tail = temp;
        size--;
        return;
      }
        temp.next = temp.next.next;
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