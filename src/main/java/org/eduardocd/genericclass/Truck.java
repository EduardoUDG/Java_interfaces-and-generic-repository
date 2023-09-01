package org.eduardocd.genericclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Truck<T> implements Iterable<T> {

    private List<T> objects;
    private int max;

    public Truck(int max) {
        this.max = max;
        this.objects = new ArrayList<>();
    }

    public void add(T t) {
        if( this.objects.size() <=this.max ) {
            this.objects.add(t);
        } else {
            throw new RuntimeException("The truck is full");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objects.iterator();
    }

}
