package defpackage;

/* renamed from: eeg reason: default package */
/* compiled from: PG */
public final class eeg extends defpackage.dlz {
    private static volatile defpackage.eeg[] a;
    private int b;
    private java.lang.Float c;
    private java.lang.Integer d;

    public static defpackage.eeg[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.eeg[0];
                }
            }
        }
        return a;
    }

    public eeg() {
        this.b = Integer.MIN_VALUE;
        this.c = null;
        this.d = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(1, this.b);
        }
        if (this.c != null) {
            dlx.a(2, this.c.floatValue());
        }
        if (this.d != null) {
            dlx.a(3, this.d.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(1, this.b);
        }
        if (this.c != null) {
            this.c.floatValue();
            a2 += defpackage.dlx.c(16) + 4;
        }
        if (this.d != null) {
            return a2 + defpackage.dlx.c(3, this.d.intValue());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.eeg a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 9) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum InstallErrorReason");
                        }
                        this.b = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 21:
                    this.c = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(dlw.f()));
                    continue;
                case 24:
                    this.d = java.lang.Integer.valueOf(dlw.e());
                    continue;
                default:
                    if (!super.a(dlw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }
}
