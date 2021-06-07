package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: csi  reason: default package */
/* compiled from: PG */
public final class csi extends csm implements Serializable {
    public static final long serialVersionUID = 0;
    private final Queue a = new ArrayDeque(20);
    private final int b = 20;

    /* access modifiers changed from: protected */
    @Override // defpackage.csm
    public final Queue a() {
        return this.a;
    }

    @Override // java.util.Queue, defpackage.csm
    public final boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Collection, defpackage.csk, java.util.Queue
    public final boolean add(Object obj) {
        cld.a(obj);
        if (this.b != 0) {
            if (size() == this.b) {
                this.a.remove();
            }
            this.a.add(obj);
        }
        return true;
    }

    @Override // java.util.Collection, defpackage.csk
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.b) {
            return cky.a((Collection) this, collection.iterator());
        }
        clear();
        int i = size - this.b;
        cld.a(collection);
        cld.a(i >= 0, "number to skip cannot be negative");
        csj csj = new csj(collection, i);
        if (csj instanceof Collection) {
            return addAll((Collection) csj);
        }
        return cky.a((Collection) this, ((Iterable) cld.a(csj)).iterator());
    }

    @Override // defpackage.csk
    public final boolean contains(Object obj) {
        return c().contains(cld.a(obj));
    }

    @Override // defpackage.csk
    public final boolean remove(Object obj) {
        return c().remove(cld.a(obj));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.csk, defpackage.csm
    public final /* synthetic */ Collection b() {
        return c();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.csk, defpackage.csm, defpackage.csl
    public final /* synthetic */ Object c() {
        return c();
    }
}
