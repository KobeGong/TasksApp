package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: diy  reason: default package */
/* compiled from: PG */
public final class diy extends dgs implements diz, RandomAccess {
    private final List b;

    public diy() {
        this(10);
    }

    public diy(int i) {
        this(new ArrayList(i));
    }

    private diy(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof diz) {
            collection = ((diz) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.dgs
    public final void clear() {
        c();
        this.b.clear();
        this.modCount++;
    }

    @Override // defpackage.diz
    public final void a(dha dha) {
        c();
        this.b.add(dha);
        this.modCount++;
    }

    @Override // defpackage.diz
    public final Object b(int i) {
        return this.b.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dha) {
            return ((dha) obj).c();
        }
        return dim.b((byte[]) obj);
    }

    @Override // defpackage.diz
    public final List d() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.diz
    public final diz e() {
        if (a()) {
            return new dkz(this);
        }
        return this;
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.b.set(i, (String) obj));
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // defpackage.dgs, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // defpackage.dgs, defpackage.diq
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.dgs
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.dgs
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new diy(arrayList);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dha) {
            dha dha = (dha) obj;
            String c = dha.c();
            if (dha.d()) {
                this.b.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = dim.b(bArr);
        if (dim.a(bArr)) {
            this.b.set(i, b2);
        }
        return b2;
    }

    static {
        new diy().a = false;
    }
}
