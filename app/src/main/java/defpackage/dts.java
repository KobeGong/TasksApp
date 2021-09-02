package defpackage;

/* renamed from: dts reason: default package */
/* compiled from: PG */
final class dts extends defpackage.dtt {
    public final defpackage.doo a;
    public final defpackage.dns b = defpackage.dns.a();
    private final /* synthetic */ defpackage.dtm d;

    dts(defpackage.dtm dtm, defpackage.doo doo) {
        this.d = dtm;
        this.a = doo;
    }

    public final void b(defpackage.dpw dpw) {
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
