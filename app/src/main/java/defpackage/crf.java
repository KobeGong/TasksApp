package defpackage;

/* renamed from: crf reason: default package */
/* compiled from: PG */
public final class crf {
    public final /* synthetic */ defpackage.dmz a;
    private final /* synthetic */ defpackage.dqe b;

    /* JADX INFO: finally extract failed */
    public final void a(java.util.Map map) {
        defpackage.dor dor;
        try {
            synchronized (this.b) {
                if (this.b.e == null || this.b.e != map) {
                    this.b.d = defpackage.dqe.a(map);
                    this.b.e = map;
                }
                dor = this.b.d;
            }
            defpackage.dmz dmz = this.a;
            defpackage.cld.b(!dmz.f, (java.lang.Object) "apply() or fail() already called");
            defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
            dmz.c.a(dor);
            defpackage.dns c = dmz.e.c();
            try {
                defpackage.dta a2 = dmz.a.a(dmz.b, dmz.c, dmz.d);
                dmz.e.a(c);
                dmz.a(a2);
            } catch (Throwable th) {
                dmz.e.a(c);
                throw th;
            }
        } catch (Throwable th2) {
            this.a.a(defpackage.dpw.f.a("Failed to convert credential metadata").b(th2));
        }
    }

    public crf(defpackage.dqe dqe, defpackage.dmz dmz) {
        this.b = dqe;
        this.a = dmz;
    }
}
