package defpackage;

/* renamed from: een  reason: default package */
/* compiled from: PG */
public final class een extends dlz {
    public eem a = null;
    public efl b = null;
    public int c = Integer.MIN_VALUE;
    public edz d = null;
    public String e = null;

    public een() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != null) {
            dlx.a(5, this.e);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.b(2, this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            a2 += dlx.c(3, this.c);
        }
        if (this.d != null) {
            a2 += dlx.b(4, this.d);
        }
        if (this.e != null) {
            return a2 + dlx.b(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.een a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.een.a(dlw):een");
    }
}
