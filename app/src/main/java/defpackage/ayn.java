package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: ayn  reason: default package */
/* compiled from: PG */
public class ayn {
    public final Context a;
    public final ayd b;
    public final bbu c;
    public final Looper d;
    public final int e;
    public final ayp f;
    private final aye g;
    private final baj h;

    private ayn(Context context, ayd ayd, ayo ayo) {
        azb.b(context, "Null context is not permitted.");
        azb.b(ayd, "Api must not be null.");
        azb.b(ayo, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = ayd;
        this.g = null;
        this.d = ayo.c;
        this.c = new bbu(this.b, null);
        this.f = new baq(this);
        this.h = baj.a(this.a);
        this.e = this.h.e.getAndIncrement();
        bbm bbm = ayo.b;
        baj baj = this.h;
        baj.g.sendMessage(baj.g.obtainMessage(7, this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ayn(android.content.Context r3, defpackage.ayd r4, defpackage.bbm r5) {
        /*
            r2 = this;
            bco r0 = new bco
            r0.<init>()
            java.lang.String r1 = "StatusExceptionMapper must not be null."
            defpackage.azb.b(r5, r1)
            r0.a = r5
            ayo r0 = r0.a()
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.<init>(android.content.Context, ayd, bbm):void");
    }

    public final bca a(int i, bca bca) {
        bca.d();
        baj baj = this.h;
        baj.g.sendMessage(baj.g.obtainMessage(4, new bbf(new bat(bca), baj.f.get(), this)));
        return bca;
    }

    public ayj a(Looper looper, bak bak) {
        bdl a2 = a();
        a2.c = this.a.getPackageName();
        a2.d = this.a.getClass().getName();
        return this.b.a().a(this.a, looper, a2.a(), null, bak, bak);
    }

    private final bdl a() {
        bdl bdl = new bdl();
        bdl.a = null;
        Set emptySet = Collections.emptySet();
        if (bdl.b == null) {
            bdl.b = new qt();
        }
        bdl.b.addAll(emptySet);
        return bdl;
    }

    public bbi a(Context context, Handler handler) {
        return new bbi(context, handler, a().a());
    }
}
