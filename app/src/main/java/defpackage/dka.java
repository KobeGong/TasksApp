package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dka  reason: default package */
/* compiled from: PG */
public final class dka extends dgs {
    public static final dka b;
    private final List c;

    dka() {
        this(new ArrayList(10));
    }

    private dka(List list) {
        this.c = list;
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final void add(int i, Object obj) {
        c();
        this.c.add(i, obj);
        this.modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final Object get(int i) {
        return this.c.get(i);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final Object remove(int i) {
        c();
        Object remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new dka(arrayList);
    }

    static {
        dka dka = new dka();
        b = dka;
        dka.a = false;
    }
}
