package defpackage;

/* renamed from: ayn reason: default package */
/* compiled from: PG */
public class ayn {
    public final android.content.Context a;
    public final defpackage.ayd b;
    public final defpackage.bbu c;
    public final android.os.Looper d;
    public final int e;
    public final defpackage.ayp f;
    private final defpackage.aye g;
    private final defpackage.baj h;

    private ayn(android.content.Context context, defpackage.ayd ayd, defpackage.ayo ayo) {
        defpackage.azb.b((java.lang.Object) context, (java.lang.Object) "Null context is not permitted.");
        defpackage.azb.b((java.lang.Object) ayd, (java.lang.Object) "Api must not be null.");
        defpackage.azb.b((java.lang.Object) ayo, (java.lang.Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = ayd;
        this.g = null;
        this.d = ayo.c;
        this.c = new defpackage.bbu(this.b, null);
        this.f = new defpackage.baq(this);
        this.h = defpackage.baj.a(this.a);
        this.e = this.h.e.getAndIncrement();
        defpackage.bbm bbm = ayo.b;
        defpackage.baj baj = this.h;
        baj.g.sendMessage(baj.g.obtainMessage(7, this));
    }

    @java.lang.Deprecated
    public ayn(android.content.Context context, defpackage.ayd ayd, defpackage.bbm bbm) {
        defpackage.bco bco = new defpackage.bco();
        defpackage.azb.b((java.lang.Object) bbm, (java.lang.Object) "StatusExceptionMapper must not be null.");
        bco.a = bbm;
        this(context, ayd, bco.a());
    }

    public final defpackage.bca a(int i, defpackage.bca bca) {
        bca.d();
        defpackage.baj baj = this.h;
        baj.g.sendMessage(baj.g.obtainMessage(4, new defpackage.bbf(new defpackage.bat(bca), baj.f.get(), this)));
        return bca;
    }

    public defpackage.ayj a(android.os.Looper looper, defpackage.bak bak) {
        defpackage.bdl a2 = a();
        a2.c = this.a.getPackageName();
        a2.d = this.a.getClass().getName();
        return this.b.a().a(this.a, looper, a2.a(), null, bak, bak);
    }

    private final defpackage.bdl a() {
        defpackage.bdl bdl = new defpackage.bdl();
        bdl.a = null;
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (bdl.b == null) {
            bdl.b = new defpackage.qt();
        }
        bdl.b.addAll(emptySet);
        return bdl;
    }

    public defpackage.bbi a(android.content.Context context, android.os.Handler handler) {
        return new defpackage.bbi(context, handler, a().a());
    }
}
