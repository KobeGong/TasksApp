package defpackage;

/* renamed from: dxu reason: default package */
/* compiled from: PG */
public final class dxu {
    private final java.net.InetSocketAddress a;
    private final java.lang.String b;
    private final java.lang.String c;

    public dxu(java.net.InetSocketAddress inetSocketAddress, java.lang.String str, java.lang.String str2) {
        defpackage.cld.a((java.lang.Object) inetSocketAddress);
        defpackage.cld.b(!inetSocketAddress.isUnresolved());
        this.a = inetSocketAddress;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dxu)) {
            return false;
        }
        defpackage.dxu dxu = (defpackage.dxu) obj;
        if (!defpackage.cru.equals(this.a, dxu.a) || !defpackage.cru.equals(this.b, dxu.b) || !defpackage.cru.equals(this.c, dxu.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c});
    }
}
