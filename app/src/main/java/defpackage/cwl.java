package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: cwl  reason: default package */
/* compiled from: PG */
public abstract class cwl implements Serializable, Iterable {
    public abstract int b(int i);

    public boolean a(int i) {
        return b(i) >= 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new csh(this);
    }
}
