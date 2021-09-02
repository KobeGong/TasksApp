package defpackage;

/* renamed from: cig reason: default package */
/* compiled from: PG */
final class cig implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String a;
    private final /* synthetic */ defpackage.cif b;

    cig(defpackage.cif cif, java.lang.String str) {
        this.b = cif;
        this.a = str;
    }

    public final void run() {
        this.b.a.b.a(4, this.a);
    }
}
