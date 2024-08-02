package medium.insertDeleteGetRandom380;

class RandomizedSet {
    List<Integer> storage;
    Random random;

    public RandomizedSet() {
        storage = new LinkedList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(storage.contains(val)) return false;
        return storage.add(val);
    }

    public boolean remove(int val) {
        return storage.remove(Integer.valueOf(val));
    }

    public int getRandom() {
        return storage.get(random.nextInt(storage.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */