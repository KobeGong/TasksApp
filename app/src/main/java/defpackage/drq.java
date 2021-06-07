package defpackage;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: drq  reason: default package */
/* compiled from: PG */
final class drq implements dnf {
    drq() {
    }

    @Override // defpackage.dnf
    public final dnd a(dpb dpb, dna dna, dnc dnc) {
        int i;
        int i2;
        ecp.a.a();
        ecc a = ecn.a();
        if (a == null) {
            return dnc.a(dpb, dna);
        }
        dnb dnb = drp.a;
        ByteBuffer.wrap(Arrays.copyOf(a.b.a.b, 8)).getLong();
        drt drt = new drt();
        cld.a(dnb, "key");
        cld.a(drt, "value");
        dna dna2 = new dna(dna);
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
        dna2.g = (Object[][]) Array.newInstance(Object.class, i2 + length, 2);
        System.arraycopy(dna.g, 0, dna2.g, 0, dna.g.length);
        if (i == -1) {
            dna2.g[dna.g.length] = new Object[]{dnb, drt};
        } else {
            dna2.g[i][1] = drt;
        }
        return dnc.a(dpb, dna2);
    }
}
