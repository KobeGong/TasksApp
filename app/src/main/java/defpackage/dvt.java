package defpackage;

/* renamed from: dvt  reason: default package */
/* compiled from: PG */
final class dvt implements Runnable {
    private final /* synthetic */ dnr a;
    private final /* synthetic */ dvq b;

    dvt(dvq dvq, dnr dnr) {
        this.b = dvq;
        this.a = dnr;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
