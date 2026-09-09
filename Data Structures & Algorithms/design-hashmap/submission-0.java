class MyHashMap {

    private HashMap<Integer, Integer> hm;

    public MyHashMap() {
        this.hm = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hm.put(key, value);
    }
    
    public int get(int key) {
        int val = hm.getOrDefault(key, -1);
        return val;
    }
    
    public void remove(int key) {
        hm.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */