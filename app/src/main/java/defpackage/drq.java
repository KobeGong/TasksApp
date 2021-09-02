package defpackage;

/* renamed from: drq reason: default package */
/* compiled from: PG */
final class drq implements defpackage.dnf {
    drq() {
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna, defpackage.dnc dnc) {
        int i;
        int i2;
        defpackage.ecp.a.a();
        defpackage.ecc a = defpackage.ecn.a();
        if (a == null) {
            return dnc.a(dpb, dna);
        }
        defpackage.dnb dnb = defpackage.drp.a;
        java.nio.ByteBuffer.wrap(java.util.Arrays.copyOf(a.b.a.b, 8)).getLong();
        defpackage.drt drt = new defpackage.drt();
        defpackage.cld.a((java.lang.Object) dnb, (java.lang.Object) "key");
        defpackage.cld.a((java.lang.Object) drt, (java.lang.Object) "value");
        defpackage.dna dna2 = new defpackage.dna(dna);
        int i3 = 0;
        while (true) {
            if (i3 >= dna.g.length) {
                i = -1;
                break;
            } else if (dnb.equals(dna.g[i3][0])) {
                i = i3;
                break;
            } else {
                i3++;
            }
        }
        int length = dna.g.length;
        if (i == -1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        dna2.g = (java.lang.Object[][]) java.lang.reflect.Array.newInstance(java.lang.Object.class, new int[]{i2 + length, 2});
        java.lang.System.arraycopy(dna.g, 0, dna2.g, 0, dna.g.length);
        if (i == -1) {
            dna2.g[dna.g.length] = new java.lang.Object[]{dnb, drt};
        } else {
            dna2.g[i][1] = drt;
        }
        return dnc.a(dpb, dna2);
    }
}
