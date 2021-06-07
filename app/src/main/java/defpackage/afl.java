package defpackage;

import android.util.SparseArray;

/* renamed from: afl  reason: default package */
/* compiled from: PG */
public final class afl {
    public SparseArray a = new SparseArray();
    public int b = 0;

    static long a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* access modifiers changed from: package-private */
    public final afm a(int i) {
        afm afm = (afm) this.a.get(i);
        if (afm != null) {
            return afm;
        }
        afm afm2 = new afm();
        this.a.put(i, afm2);
        return afm2;
    }
}
