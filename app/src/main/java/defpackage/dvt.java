package defpackage;

/* renamed from: dvt reason: default package */
/* compiled from: PG */
final class dvt implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dnr a;
    private final /* synthetic */ defpackage.dvq b;

    dvt(defpackage.dvq dvq, defpackage.dnr dnr) {
        this.b = dvq;
        this.a = dnr;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
