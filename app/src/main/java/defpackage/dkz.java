package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dkz  reason: default package */
/* compiled from: PG */
public final class dkz extends AbstractList implements diz, RandomAccess {
    public final diz a;

    public dkz(diz diz) {
        this.a = diz;
    }

    @Override // defpackage.diz
    public final Object b(int i) {
        return this.a.b(i);
    }

    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.diz
    public final void a(dha dha) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator listIterator(int i) {
        return new dla(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator iterator() {
        return new dlb(this);
    }

    @Override // defpackage.diz
    public final List d() {
        return this.a.d();
    }

    @Override // defpackage.diz
    public final diz e() {
        return this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
