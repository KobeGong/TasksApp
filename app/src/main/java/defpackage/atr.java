package defpackage;

/* renamed from: atr  reason: default package */
/* compiled from: PG */
final class atr {
    public final dby a;
    public final atq b;
    private final int c;

    atr(int i, dby dby, atq atq) {
        this.c = i;
        this.a = dby;
        this.b = atq;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.c == bg.S;
    }

    static atr a(dby dby) {
        return new atr(bg.S, dby, null);
    }
}
