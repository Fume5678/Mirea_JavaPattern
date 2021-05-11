package Task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class S_Map<K, V> extends HashMap<K, V> implements Map<K, V> {
    private static final Semaphore sm = new Semaphore(2);
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return super.get(key);
    }

    @Override
    public V put(K key, V value) {
        return super.put((K)key,(V) value);
    }

    @Override
    public V remove(Object key) {
        return super.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            sm.acquire();

            System.out.println("PutAll started: " + getClass());
            super.putAll(m);
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sm.release();
        System.out.println("PutALL ended: " + getClass());
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return super.entrySet();
    }
}
