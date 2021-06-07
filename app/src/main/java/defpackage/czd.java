package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: czd  reason: default package */
/* compiled from: PG */
public final class czd extends WeakReference {
    private final int a;

    public czd(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        czd czd = (czd) obj;
        return this.a == czd.a && get() == czd.get();
    }
}
