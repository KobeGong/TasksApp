package defpackage;

/* renamed from: clf reason: default package */
/* compiled from: PG */
public final class clf {
    public static volatile defpackage.clf a = new defpackage.clf();
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile defpackage.civ i;
    private final java.util.List j = new java.util.ArrayList();

    clf() {
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.clg[] a() {
        defpackage.clg[] clgArr;
        synchronized (this.j) {
            clgArr = (defpackage.clg[]) this.j.toArray(new defpackage.clg[this.j.size()]);
        }
        return clgArr;
    }
}
