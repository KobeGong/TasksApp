package defpackage;

@Deprecated
/* renamed from: bc  reason: default package */
/* compiled from: PG */
public final class bc {
    @Deprecated
    private final bb a;
    @Deprecated
    private final bb b;

    @Deprecated
    public bc(bb bbVar, bb bbVar2) {
        if (bbVar.b != bbVar2.b) {
            String valueOf = String.valueOf(bbVar);
            String valueOf2 = String.valueOf(bbVar2);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length()).append("Ranges must have the same number of visible decimals: ").append(valueOf).append("~").append(valueOf2).toString());
        }
        this.a = bbVar;
        this.b = bbVar2;
    }

    @Deprecated
    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.a);
        if (this.b == this.a) {
            sb = "";
        } else {
            String valueOf2 = String.valueOf(this.b);
            sb = new StringBuilder(String.valueOf(valueOf2).length() + 1).append("~").append(valueOf2).toString();
        }
        return new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(sb).length()).append(valueOf).append(sb).toString();
    }
}
