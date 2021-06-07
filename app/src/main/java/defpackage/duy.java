package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: duy  reason: default package */
/* compiled from: PG */
public abstract class duy implements dth {
    duy() {
    }

    /* access modifiers changed from: protected */
    public abstract dth c();

    @Override // defpackage.dxb
    public final Runnable a(dxc dxc) {
        return c().a(dxc);
    }

    @Override // defpackage.dxb
    public final void a(dpw dpw) {
        c().a(dpw);
    }

    @Override // defpackage.dtb
    public dta a(dpb dpb, dor dor, dna dna) {
        return c().a(dpb, dor, dna);
    }

    @Override // defpackage.dzw
    public final dwd b() {
        return c().b();
    }

    @Override // defpackage.dth
    public final dmv a() {
        return c().a();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = c().toString();
        return new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length()).append(simpleName).append("[").append(obj).append("]").toString();
    }
}
