package defpackage;

/* renamed from: czd reason: default package */
/* compiled from: PG */
final class czd extends java.lang.ref.WeakReference {
    private final int a;

    public czd(java.lang.Throwable th, java.lang.ref.ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new java.lang.NullPointerException("The referent cannot be null");
        }
        this.a = java.lang.System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.czd czd = (defpackage.czd) obj;
        if (this.a == czd.a && get() == czd.get()) {
            return true;
        }
        return false;
    }
}
