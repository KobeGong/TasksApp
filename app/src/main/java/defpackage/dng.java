package defpackage;

/* renamed from: dng reason: default package */
/* compiled from: PG */
public final class dng {
    public static defpackage.dnc a(defpackage.dnc dnc, defpackage.dnf... dnfArr) {
        return a(dnc, java.util.Arrays.asList(dnfArr));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<dnf>, for r4v0, types: [java.util.List, java.util.List<dnf>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dnc a(defpackage.dnc r3, java.util.List<defpackage.dnf> r4) {
        /*
            java.lang.String r0 = "channel"
            defpackage.cld.a(r3, r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            dnf r0 = (defpackage.dnf) r0
            dnl r1 = new dnl
            r1.<init>(r3, r0)
            r3 = r1
            goto L_0x0009
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dng.a(dnc, java.util.List):dnc");
    }

    public static defpackage.dnf a(defpackage.dnf dnf, defpackage.dpd dpd, defpackage.dpd dpd2) {
        return new defpackage.dnh(dpd, dpd2, dnf);
    }

    static {
        new defpackage.dnk();
    }
}
