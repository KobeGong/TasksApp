package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dwg  reason: default package */
/* compiled from: PG */
public final class dwg extends dso {
    private final /* synthetic */ dwf a;

    dwg(dwf dwf) {
        this.a = dwf;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dso
    public final void a(Throwable th) {
        super.a(th);
        dwf dwf = this.a;
        if (!dwf.v) {
            dwf.v = true;
            dwf.d();
            dwf.a(false);
            dwf.a(new dwh(th));
            dwf.p.a(dnq.TRANSIENT_FAILURE);
        }
    }
}
