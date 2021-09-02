package defpackage;

/* renamed from: doe reason: default package */
/* compiled from: PG */
public final class doe {
    public final java.util.List a;
    public final defpackage.dmv b;
    private final int c;

    public doe(java.util.List list) {
        this(list, defpackage.dmv.b);
    }

    public doe(java.util.List list, defpackage.dmv dmv) {
        defpackage.cld.a(!list.isEmpty(), (java.lang.Object) "addrs is empty");
        this.a = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.b = (defpackage.dmv) defpackage.cld.a((java.lang.Object) dmv, (java.lang.Object) "attrs");
        this.c = this.a.hashCode();
    }

    public doe(java.net.SocketAddress socketAddress) {
        this(socketAddress, defpackage.dmv.b);
    }

    private doe(java.net.SocketAddress socketAddress, defpackage.dmv dmv) {
        this(java.util.Collections.singletonList(socketAddress), dmv);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 16 + java.lang.String.valueOf(valueOf2).length()).append("[addrs=").append(valueOf).append(", attrs=").append(valueOf2).append("]").toString();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.doe)) {
            return false;
        }
        defpackage.doe doe = (defpackage.doe) obj;
        if (this.a.size() != doe.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((java.net.SocketAddress) this.a.get(i)).equals(doe.a.get(i))) {
                return false;
            }
        }
        if (this.b.equals(doe.b)) {
            return true;
        }
        return false;
    }
}
