package defpackage;

/* renamed from: csh reason: default package */
/* compiled from: PG */
public final class csh extends defpackage.cth {
    private int a;
    private java.lang.Object b;
    private int c;
    private final defpackage.csb d;
    private final /* synthetic */ defpackage.cwl e;

    public csh() {
        this.a = defpackage.bg.ad;
    }

    public final boolean hasNext() {
        int b2;
        java.lang.Integer valueOf;
        defpackage.cld.b(this.a != defpackage.bg.af);
        switch (this.a - 1) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                this.a = defpackage.bg.af;
                defpackage.cwl cwl = this.e;
                int i = this.c;
                this.d.a(java.util.concurrent.TimeUnit.MILLISECONDS);
                if (!cwl.a(i)) {
                    b2 = -1;
                } else {
                    b2 = cwl.b(i);
                }
                if (b2 < 0) {
                    this.a = defpackage.bg.ae;
                    valueOf = null;
                } else {
                    this.c++;
                    valueOf = java.lang.Integer.valueOf(b2);
                }
                this.b = valueOf;
                if (this.a == defpackage.bg.ae) {
                    return false;
                }
                this.a = defpackage.bg.ac;
                return true;
        }
    }

    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = defpackage.bg.ad;
        java.lang.Object obj = this.b;
        this.b = null;
        return obj;
    }

    public csh(defpackage.cwl cwl) {
        this.e = cwl;
        this();
        this.c = 0;
        this.d = new defpackage.csb(defpackage.csf.a).a();
    }
}
