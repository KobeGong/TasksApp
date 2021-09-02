package defpackage;

/* renamed from: dke reason: default package */
/* compiled from: PG */
final class dke {
    public final java.util.Stack a = new java.util.Stack();

    dke() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dha dha) {
        defpackage.dha dha2 = dha;
        while (!dha2.g()) {
            if (dha2 instanceof defpackage.dkd) {
                defpackage.dkd dkd = (defpackage.dkd) dha2;
                a(dkd.d);
                dha2 = dkd.e;
            } else {
                java.lang.String valueOf = java.lang.String.valueOf(dha2.getClass());
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 49).append("Has a new type of ByteString been created? Found ").append(valueOf).toString());
            }
        }
        int a2 = a(dha2.a());
        int i = defpackage.dkd.c[a2 + 1];
        if (this.a.isEmpty() || ((defpackage.dha) this.a.peek()).a() >= i) {
            this.a.push(dha2);
            return;
        }
        int i2 = defpackage.dkd.c[a2];
        defpackage.dha dha3 = (defpackage.dha) this.a.pop();
        while (!this.a.isEmpty() && ((defpackage.dha) this.a.peek()).a() < i2) {
            dha3 = new defpackage.dkd((defpackage.dha) this.a.pop(), dha3);
        }
        defpackage.dkd dkd2 = new defpackage.dkd(dha3, dha2);
        while (!this.a.isEmpty()) {
            if (((defpackage.dha) this.a.peek()).a() >= defpackage.dkd.c[a(dkd2.a()) + 1]) {
                break;
            }
            dkd2 = new defpackage.dkd((defpackage.dha) this.a.pop(), dkd2);
        }
        this.a.push(dkd2);
    }

    private static int a(int i) {
        int binarySearch = java.util.Arrays.binarySearch(defpackage.dkd.c, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }
}
