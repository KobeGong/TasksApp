package defpackage;

/* renamed from: eeg  reason: default package */
/* compiled from: PG */
public final class eeg extends dlz {
    private static volatile eeg[] a;
    private int b = Integer.MIN_VALUE;
    private Float c = null;
    private Integer d = null;

    public static eeg[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new eeg[0];
                }
            }
        }
        return a;
    }

    public eeg() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
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
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.b);
        }
        if (this.c != null) {
            this.c.floatValue();
            a2 += dlx.c(16) + 4;
        }
        if (this.d != null) {
            return a2 + dlx.c(3, this.d.intValue());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eeg a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeg.a(dlw):eeg");
    }
}
