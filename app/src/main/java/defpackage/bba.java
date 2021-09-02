package defpackage;

/* renamed from: bba reason: default package */
/* compiled from: PG */
public final class bba {
    public final defpackage.bbb a;
    public volatile java.lang.Object b;

    bba(android.os.Looper looper, java.lang.Object obj, java.lang.String str) {
        this.a = new defpackage.bbb(this, looper);
        this.b = defpackage.azb.b(obj, (java.lang.Object) "Listener must not be null");
        new defpackage.bbc(obj, defpackage.azb.b(str));
    }
}
