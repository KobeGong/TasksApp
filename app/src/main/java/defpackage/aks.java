package defpackage;

/* renamed from: aks reason: default package */
/* compiled from: PG */
final class aks extends defpackage.akz {
    private final defpackage.dcb a;
    private final defpackage.dby b;

    aks(defpackage.dcb dcb, defpackage.dby dby) {
        if (dcb == null) {
            throw new java.lang.NullPointerException("Null taskList");
        }
        this.a = dcb;
        if (dby == null) {
            throw new java.lang.NullPointerException("Null task");
        }
        this.b = dby;
    }

    public final defpackage.dcb a() {
        return this.a;
    }

    public final defpackage.dby b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 30 + java.lang.String.valueOf(valueOf2).length()).append("SearchResult{taskList=").append(valueOf).append(", task=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.akz)) {
            return false;
        }
        defpackage.akz akz = (defpackage.akz) obj;
        if (!this.a.equals(akz.a()) || !this.b.equals(akz.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
