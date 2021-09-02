package defpackage;

/* renamed from: ayq reason: default package */
/* compiled from: PG */
public final class ayq {
    public defpackage.baw a;
    public int b = -1;
    public defpackage.ays c;
    public android.os.Looper d;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public final java.util.ArrayList f = new java.util.ArrayList();
    private final java.util.Set g = new java.util.HashSet();
    private final java.util.Set h = new java.util.HashSet();
    private java.lang.String i;
    private java.lang.String j;
    private final java.util.Map k = new defpackage.qr();
    private final android.content.Context l;
    private final java.util.Map m = new defpackage.qr();
    private defpackage.axt n = defpackage.axt.a;
    private defpackage.ayf o = defpackage.bpp.a;

    public ayq(android.content.Context context) {
        this.l = context;
        this.d = context.getMainLooper();
        this.i = context.getPackageName();
        this.j = context.getClass().getName();
    }

    public final defpackage.ayq a(defpackage.ayd ayd) {
        defpackage.azb.b((java.lang.Object) ayd, (java.lang.Object) "Api must not be null");
        this.m.put(ayd, null);
        java.util.List a2 = ayd.a.a(null);
        this.h.addAll(a2);
        this.g.addAll(a2);
        return this;
    }

    public final defpackage.ayq a(defpackage.ayd ayd, defpackage.aye aye) {
        defpackage.azb.b((java.lang.Object) ayd, (java.lang.Object) "Api must not be null");
        defpackage.azb.b((java.lang.Object) aye, (java.lang.Object) "Null options are not permitted for this Api");
        this.m.put(ayd, aye);
        java.util.List a2 = ayd.a.a(aye);
        this.h.addAll(a2);
        this.g.addAll(a2);
        return this;
    }

    public final defpackage.ayp a() {
        defpackage.bax a2;
        defpackage.bbv bbv;
        defpackage.azb.b(!this.m.isEmpty(), (java.lang.Object) "must call addApi() to add at least one API");
        defpackage.bpn bpn = defpackage.bpn.a;
        if (this.m.containsKey(defpackage.bpp.b)) {
            bpn = (defpackage.bpn) this.m.get(defpackage.bpp.b);
        }
        defpackage.bdj bdj = new defpackage.bdj(null, this.g, this.k, this.i, this.j, bpn);
        defpackage.ayd ayd = null;
        java.util.Map map = bdj.d;
        defpackage.qr qrVar = new defpackage.qr();
        defpackage.qr qrVar2 = new defpackage.qr();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.ayd ayd2 : this.m.keySet()) {
            java.lang.Object obj = this.m.get(ayd2);
            boolean z = map.get(ayd2) != null;
            qrVar.put(ayd2, java.lang.Boolean.valueOf(z));
            defpackage.bch bch = new defpackage.bch(ayd2, z);
            arrayList.add(bch);
            defpackage.ayj a3 = ayd2.a().a(this.l, this.d, bdj, obj, bch, bch);
            qrVar2.put(ayd2.b(), a3);
            if (!a3.c()) {
                ayd2 = ayd;
            } else if (ayd != null) {
                java.lang.String str = ayd2.b;
                java.lang.String str2 = ayd.b;
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21 + java.lang.String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
            }
            ayd = ayd2;
        }
        if (ayd != null) {
            defpackage.azb.a(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", ayd.b);
            defpackage.azb.a(this.g.equals(this.h), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", ayd.b);
        }
        defpackage.azx azx = new defpackage.azx(this.l, new java.util.concurrent.locks.ReentrantLock(), this.d, bdj, this.n, this.o, qrVar, this.e, this.f, qrVar2, this.b, defpackage.azx.a((java.lang.Iterable) qrVar2.values(), true), arrayList);
        synchronized (defpackage.ayp.a) {
            defpackage.ayp.a.add(azx);
        }
        if (this.b >= 0) {
            defpackage.baw baw = this.a;
            if (baw.a instanceof FragmentActivity) {
                a2 = defpackage.bbo.a((FragmentActivity) baw.a);
            } else if (baw.a instanceof android.app.Activity) {
                a2 = defpackage.bay.a((android.app.Activity) baw.a);
            } else {
                throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            defpackage.bbv bbv2 = (defpackage.bbv) a2.a("AutoManageHelper", defpackage.bbv.class);
            if (bbv2 != null) {
                bbv = bbv2;
            } else {
                bbv = new defpackage.bbv(a2);
            }
            int i2 = this.b;
            defpackage.ays ays = this.c;
            defpackage.azb.b((java.lang.Object) azx, (java.lang.Object) "GoogleApiClient instance cannot be null");
            defpackage.azb.a(bbv.b.indexOfKey(i2) < 0, (java.lang.Object) "Already managing a GoogleApiClient with id " + i2);
            defpackage.bcd bcd = (defpackage.bcd) bbv.d.get();
            boolean z2 = bbv.c;
            java.lang.String valueOf = java.lang.String.valueOf(bcd);
            new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 49).append("starting AutoManage for client ").append(i2).append(" ").append(z2).append(" ").append(valueOf);
            bbv.b.put(i2, new defpackage.bbw(bbv, i2, azx, ays));
            if (bbv.c && bcd == null) {
                java.lang.String valueOf2 = java.lang.String.valueOf(azx);
                new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 11).append("connecting ").append(valueOf2);
                azx.e();
            }
        }
        return azx;
    }
}
