package defpackage;

/* renamed from: j reason: default package */
/* compiled from: PG */
public final class j implements java.util.Map.Entry {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public defpackage.j c;
    public defpackage.j d;

    j(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final java.lang.Object getKey() {
        return this.a;
    }

    public final java.lang.Object getValue() {
        return this.b;
    }

    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.a + "=" + this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.j)) {
            return false;
        }
        defpackage.j jVar = (defpackage.j) obj;
        if (!this.a.equals(jVar.a) || !this.b.equals(jVar.b)) {
            return false;
        }
        return true;
    }
}
