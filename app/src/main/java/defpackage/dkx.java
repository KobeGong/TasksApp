package defpackage;

/* renamed from: dkx */
public final class dkx {
    dkx() {
    }

    static /* synthetic */ void a(Object obj, int i, long j) {
        ((dky) obj).a(i << 3, Long.valueOf(j));
    }

    static /* synthetic */ void a(Object obj, int i, dha dha) {
        ((dky) obj).a((i << 3) | 2, dha);
    }

    static /* synthetic */ Object a(Object obj) {
        dky dky = ((dih) obj).s;
        if (dky != dky.a) {
            return dky;
        }
        dky dky2 = new dky();
        a(obj, dky2);
        return dky2;
    }

    static void b(Object obj) {
        ((dih) obj).s.f = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r8, defpackage.dkc r9) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkx.a(java.lang.Object, dkc):boolean");
    }

    dkx(byte b) {
        this();
    }

    public static void a(Object obj, dky dky) {
        ((dih) obj).s = dky;
    }
}
