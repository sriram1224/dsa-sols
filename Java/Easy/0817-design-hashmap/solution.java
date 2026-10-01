    import java.util.*;

    class MyHashMap{

    private int size = 0; 
    private float lf = 0.5f;
    private class Entity{
        int key;
        int value;

        public Entity(int key,int value){
            this.key = key;
            this.value= value;
        }
    }

        ArrayList<LinkedList<Entity>> list;
        public MyHashMap() {
            list = new ArrayList<>();
            for(int i = 0; i<10; i++){
                list.add(new LinkedList<>());
            }
            
        }

        public void put(int key,int value){
            int hash = Math.abs(Integer.hashCode(key) % list.size());
            LinkedList<Entity> entities = list.get(hash);
            for(Entity entity : entities){
                if(entity.key ==key){
                    entity.value = value;
                    return;
                }

            }
            

            entities.add(new Entity(key,value));
            size++;

            if((float)(size)/(list.size()+1) > lf) rehash();
    }
    public void rehash(){
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0;
        for(int i = 0; i<old.size()*2; i++){
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entity> entries:old){
            for(Entity entry: entries){
                put(entry.key,entry.value);
            }

        }
    }
        
    
        
        public int get(int key) {
            int hash = Math.abs(Integer.hashCode(key) % list.size());
            LinkedList<Entity> entities = list.get(hash);
            for(Entity entity: entities){
                if(entity.key ==key){
                    return entity.value;
                }
            }
            return -1;
        }
        
        public void remove(int key) {
            int hash = Math.abs(Integer.hashCode(key) % list.size());
            LinkedList<Entity> entities = list.get(hash);
            Entity target = null;
            for(Entity entity: entities){
                if(entity.key ==key){
                    target = entity;
                    break;
                }
            }
            entities.remove(target);
            size--;
            
        }
    }

    /**
    * Your MyHashMap object will be instantiated and called as such:
    * MyHashMap obj = new MyHashMap();
    * obj.put(key,value);
    * int param_2 = obj.get(key);
    * obj.remove(key);
    */