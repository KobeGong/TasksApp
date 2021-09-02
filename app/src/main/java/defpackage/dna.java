package defpackage;

/* renamed from: dna reason: default package */
/* compiled from: PG */
public final class dna {
    public static final defpackage.dna a = new defpackage.dna();
    public defpackage.dny b;
    public java.util.concurrent.Executor c;
    public java.lang.String d;
    public defpackage.dmy e;
    public java.lang.String f;
    public java.lang.Object[][] g = ((java.lang.Object[][]) java.lang.reflect.Array.newInstance(java.lang.Object.class, new int[]{0, 2}));
    public java.util.List h = java.util.Collections.emptyList();
    public boolean i;
    public java.lang.Integer j;
    public java.lang.Integer k;

    public final defpackage.dna a(defpackage.dnm dnm) {
        defpackage.dna dna = new defpackage.dna(this);
        java.util.ArrayList arrayList = new java.util.ArrayList(this.h.size() + 1);
        arrayList.addAll(this.h);
        arrayList.add(dnm);
        dna.h = java.util.Collections.unmodifiableList(arrayList);
        return dna;
    }

    public final java.lang.Object a(defpackage.dnb dnb) {
        defpackage.cld.a((java.lang.Object) dnb, (java.lang.Object) "key");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            if (dnb.equals(this.g[i2][0])) {
                return this.g[i2][1];
            }
        }
        return null;
    }

    private dna() {
    }

    public dna(defpackage.dna dna) {
        this.b = dna.b;
        this.d = dna.d;
        this.e = dna.e;
        this.c = dna.c;
        this.f = dna.f;
        this.g = dna.g;
        this.i = dna.i;
        this.j = dna.j;
        this.k = dna.k;
        this.h = dna.h;
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("deadline", (java.lang.Object) this.b).a("authority", (java.lang.Object) this.d).a("callCredentials", (java.lang.Object) this.e).a("executor", (java.lang.Object) this.c != null ? this.c.getClass() : null).a("compressorName", (java.lang.Object) this.f).a("customOptions", (java.lang.Object) java.util.Arrays.deepToString(this.g)).a("waitForReady", this.i).a("maxInboundMessageSize", (java.lang.Object) this.j).a("maxOutboundMessageSize", (java.lang.Object) this.k).a("streamTracerFactories", (java.lang.Object) this.h).toString();
    }
}
