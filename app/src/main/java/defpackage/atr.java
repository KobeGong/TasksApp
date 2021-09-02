package defpackage;

/* renamed from: atr reason: default package */
/* compiled from: PG */
final class atr {
    public final defpackage.dby a;
    public final defpackage.atq b;
    private final int c;

    atr(int i, defpackage.dby dby, defpackage.atq atq) {
        this.c = i;
        this.a = dby;
        this.b = atq;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.c == defpackage.bg.S;
    }

    static defpackage.atr a(defpackage.dby dby) {
        return new defpackage.atr(defpackage.bg.S, dby, null);
    }
}
