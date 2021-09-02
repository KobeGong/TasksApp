package defpackage;

/* renamed from: dwg reason: default package */
/* compiled from: PG */
final class dwg extends defpackage.dso {
    private final /* synthetic */ defpackage.dwf a;

    dwg(defpackage.dwf dwf) {
        this.a = dwf;
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Throwable th) {
        super.a(th);
        defpackage.dwf dwf = this.a;
        if (!dwf.v) {
            dwf.v = true;
            dwf.d();
            dwf.a(false);
            dwf.a((defpackage.doq) new defpackage.dwh(th));
            dwf.p.a(defpackage.dnq.TRANSIENT_FAILURE);
        }
    }
}
