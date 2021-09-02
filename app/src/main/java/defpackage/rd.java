package defpackage;

/* renamed from: rd reason: default package */
/* compiled from: PG */
final class rd implements java.util.Iterator, java.util.Map.Entry {
    private int a;
    private int b;
    private boolean c = false;
    private final /* synthetic */ defpackage.qz d;

    rd(defpackage.qz qzVar) {
        this.d = qzVar;
        this.a = qzVar.a() - 1;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final void remove() {
        if (!this.c) {
            throw new java.lang.IllegalStateException();
        }
        this.d.a(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    public final java.lang.Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!this.c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        } else {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!defpackage.qv.a(entry.getKey(), this.d.a(this.b, 0)) || !defpackage.qv.a(entry.getValue(), this.d.a(this.b, 1))) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int i = 0;
        if (!this.c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        java.lang.Object a2 = this.d.a(this.b, 0);
        java.lang.Object a3 = this.d.a(this.b, 1);
        int hashCode = a2 == null ? 0 : a2.hashCode();
        if (a3 != null) {
            i = a3.hashCode();
        }
        return i ^ hashCode;
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }

    public final /* synthetic */ java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }
}
