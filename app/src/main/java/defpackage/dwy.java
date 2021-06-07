package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* access modifiers changed from: package-private */
/* renamed from: dwy  reason: default package */
/* compiled from: PG */
public final class dwy {
    public final Object a = new Object();
    public Collection b = new HashSet();

    dwy() {
    }

    /* access modifiers changed from: package-private */
    public final dpw a(dyb dyb) {
        synchronized (this.a) {
            this.b.add(dyb);
        }
        return null;
    }
}
