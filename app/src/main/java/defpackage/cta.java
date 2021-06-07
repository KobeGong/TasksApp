package defpackage;

/* renamed from: cta  reason: default package */
/* compiled from: PG */
public final class cta extends css {
    public static final css a = new cta(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    private final transient int[] b;
    private final transient Object[] c;
    private final transient int d;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r1[r0] = r2 * 2;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cta a(int r9, java.lang.Object[] r10) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cta.a(int, java.lang.Object[]):cta");
    }

    private cta(int[] iArr, Object[] objArr, int i) {
        this.b = iArr;
        this.c = objArr;
        this.d = i;
    }

    public final int size() {
        return this.d;
    }

    @Override // defpackage.css, java.util.Map
    public final Object get(Object obj) {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i = this.d;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = cky.a(obj.hashCode());
            while (true) {
                int i2 = a2 & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                a2 = i2 + 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.css
    public final csv a() {
        return new ctb(this, this.c, this.d);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.css
    public final csv b() {
        return new ctd(this, new cte(this.c, 0, this.d));
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.css
    public final csn c() {
        return new cte(this.c, 1, this.d);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.css
    public final boolean d() {
        return false;
    }
}
