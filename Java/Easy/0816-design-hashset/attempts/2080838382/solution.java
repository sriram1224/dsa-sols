class MyHashSet {
    private static final int INITIAL_CAPACITY  = 16;
    private Node[] list;
    private int size;

    private float lf = 0.75f;
    private int threshold;

    public MyHashSet() {
    list =  new Node[INITIAL_CAPACITY];
    threshold = (int) (INITIAL_CAPACITY*lf);
    }


  
    private boolean contains(Node head, int key){
        Node node = head;
        while (node != null) {
        if (node.key == key) {
            return true;
        }
        node = node.next;
        }   

    return false;
    
    }

    public void add(int key) {
        int hash = calculatehash(key,list.length);
       
      
        if(contains(list[hash],key))  return;
        
        insert(list,key);
        size++;

         if (size > threshold) resize();
    

    }

    public boolean contains(int key){
        int hash = calculatehash(key,list.length);

        Node node = list[hash];
        while (node != null) {
        if (node.key == key) {
            return true;
        }
        node = node.next;
        }
        return false;

    }
    
public void remove(int key) {
    int hash = calculatehash(key, list.length);
    Node node = list[hash];
    if (node == null) return;

    if (node.key == key) {
        list[hash] = node.next;
        size--;
        return;
    }

    Node prev = node;
    node = node.next;
    while (node != null) {
        if (node.key == key) {
            prev.next = node.next;
            size--;
            return;
        }
        prev = node;
        node = node.next;
    }
}






    private void insert(Node[] list, int key){
        int hash = calculatehash(key,list.length);
       
         if(list[hash] == null) {
            list[hash] = new Node(key);
            return;
        }
        Node node = list[hash];
        while(node.next !=null){
            node = node.next;
        }
        node.next = new Node(key);
    }
    private void resize(){
       
        Node[] newList = new Node[list.length * 2];
        for(Node node : list){
            while(node!=null){
                 insert(newList,node.key);
                 node = node.next;
            }
        }
         list = newList;
         threshold = (int) (list.length*lf);
    }

    public int calculatehash(int key,int len){
       return Math.abs(Integer.hashCode(key) % len);
    }
    
   
    class Node{
        int key;
        Node next;
         Node(int key,Node next){
            this.key = key;
            this.next = next;
        }
         Node(int key){
            this(key, null);
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */