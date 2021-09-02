package defpackage;

@java.lang.Deprecated
/* renamed from: bc reason: default package */
/* compiled from: PG */
public final class bc {
    @java.lang.Deprecated
    private final defpackage.bb a;
    @java.lang.Deprecated
    private final defpackage.bb b;

    @java.lang.Deprecated
    public bc(defpackage.bb bbVar, defpackage.bb bbVar2) {
        if (bbVar.b != bbVar2.b) {
            java.lang.String valueOf = java.lang.String.valueOf(bbVar);
            java.lang.String valueOf2 = java.lang.String.valueOf(bbVar2);
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 55 + java.lang.String.valueOf(valueOf2).length()).append("Ranges must have the same number of visible decimals: ").append(valueOf).append("~").append(valueOf2).toString());
        }
        this.a = bbVar;
        this.b = bbVar2;
    }

    @java.lang.Deprecated
    public final java.lang.String toString() {
        java.lang.String sb;
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        if (this.b == this.a) {
            sb = "";
        } else {
            java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 1).append("~").append(valueOf2).toString();
        }
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(sb).length()).append(valueOf).append(sb).toString();
    }
}
