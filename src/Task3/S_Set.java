package Task3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class S_Set<T> extends HashSet<T> implements Set<T> {
    private final static Lock lt = new ReentrantLock();

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return super.iterator();
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return super.toArray(a);
    }

    @Override
    public boolean add(T t) {
        lt.lock();
        boolean res = super.add(t);
        lt.unlock();
        return res;
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("Remove Start: " + getClass());
        lt.lock();
        boolean res = super.remove(o);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Removed: " + getClass());
        lt.unlock();
        return res;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return super.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        lt.lock();
        boolean res = super.addAll(c);
        lt.unlock();
        return res;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lt.lock();
        boolean res = super.retainAll(c);
        lt.unlock();
        return res;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lt.lock();
        boolean res = super.removeAll(c);
        lt.unlock();
        return res;
    }

    @Override
    public void clear() {
        lt.lock();
        super.clear();
        lt.unlock();
    }
}
