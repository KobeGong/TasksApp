package defpackage;

import java.util.Map;

/* renamed from: crf  reason: default package */
/* compiled from: PG */
public final class crf {
    public final /* synthetic */ dmz a;
    private final /* synthetic */ dqe b;

    /* JADX INFO: finally extract failed */
    public final void a(Map map) {
        dor dor;
        try {
            synchronized (this.b) {
                if (this.b.e == null || this.b.e != map) {
                    this.b.d = dqe.a(map);
                    this.b.e = map;
                }
                dor = this.b.d;
            }
            dmz dmz = this.a;
            cld.b(!dmz.f, "apply() or fail() already called");
            cld.a(dor, "headers");
            dmz.c.a(dor);
            dns c = dmz.e.c();
            try {
                dta a2 = dmz.a.a(dmz.b, dmz.c, dmz.d);
                dmz.e.a(c);
                dmz.a(a2);
            } catch (Throwable th) {
                dmz.e.a(c);
                throw th;
            }
        } catch (Throwable th2) {
            this.a.a(dpw.f.a("Failed to convert credential metadata").b(th2));
        }
    }

    public crf(dqe dqe, dmz dmz) {
        this.b = dqe;
        this.a = dmz;
    }
}
