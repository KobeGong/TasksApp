package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dts  reason: default package */
/* compiled from: PG */
public final class dts extends dtt {
    public final doo a;
    public final dns b = dns.a();
    private final /* synthetic */ dtm d;

    dts(dtm dtm, doo doo) {
        this.d = dtm;
        this.a = doo;
    }

    @Override // defpackage.dta, defpackage.dtt
    public final void b(dpw dpw) {
        super.b(dpw);
        synchronized (this.d.a) {
            if (this.d.d != null) {
                boolean remove = this.d.f.remove(this);
                if (!this.d.a() && remove) {
                    this.d.b.a(this.d.c);
                    if (this.d.g != null) {
                        this.d.b.a(this.d.d);
                        this.d.d = null;
                    }
                }
            }
        }
        this.d.b.a();
    }
}
