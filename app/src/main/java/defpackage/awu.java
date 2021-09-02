package defpackage;

/* renamed from: awu reason: default package */
/* compiled from: PG */
public final class awu {
    public java.lang.String a;
    public /* synthetic */ defpackage.awt b;
    private int c;
    private java.lang.String d;
    private java.lang.String e;
    private int f;
    private final defpackage.aww g;
    private boolean h;
    private final defpackage.blh i;
    private boolean j;

    public awu(defpackage.awt awt, byte[] bArr) {
        this(awt, bArr, null);
    }

    public awu(defpackage.awt awt, defpackage.aww aww) {
        this(awt, null, aww);
    }

    private awu(defpackage.awt awt, byte[] bArr, defpackage.aww aww) {
        this.b = awt;
        this.c = this.b.g;
        this.d = this.b.f;
        this.a = this.b.h;
        this.e = defpackage.awt.d(this.b);
        this.f = defpackage.awt.a();
        this.h = true;
        this.i = new defpackage.blh();
        this.j = false;
        this.a = awt.h;
        this.e = defpackage.awt.d(awt);
        this.i.c = awt.k.a();
        this.i.d = awt.k.b();
        defpackage.blh blh = this.i;
        awt.l;
        blh.f = (long) (java.util.TimeZone.getDefault().getOffset(this.i.c) / 1000);
        if (bArr != null) {
            this.i.e = bArr;
        }
        this.g = aww;
    }

    @java.lang.Deprecated
    public final defpackage.ayt a() {
        if (this.j) {
            throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
        }
        this.j = true;
        defpackage.axa axa = new defpackage.axa(new defpackage.axb(this.b.d, this.b.e, this.c, this.d, this.a, this.e, defpackage.awt.b(), this.f), this.i, this.g, defpackage.awt.c(), defpackage.awt.c(), this.h);
        defpackage.axb axb = axa.a;
        if (this.b.m.a(axb.b, axb.a)) {
            return this.b.j.a(axa);
        }
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.a;
        defpackage.azb.b((java.lang.Object) status, (java.lang.Object) "Result must not be null");
        defpackage.bbn bbn = new defpackage.bbn(android.os.Looper.getMainLooper());
        bbn.a((defpackage.ayw) status);
        return bbn;
    }
}
