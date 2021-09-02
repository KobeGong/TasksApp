package defpackage;

/* renamed from: afl reason: default package */
/* compiled from: PG */
public final class afl {
    public android.util.SparseArray a = new android.util.SparseArray();
    public int b = 0;

    static long a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.afm a(int i) {
        defpackage.afm afm = (defpackage.afm) this.a.get(i);
        if (afm != null) {
            return afm;
        }
        defpackage.afm afm2 = new defpackage.afm();
        this.a.put(i, afm2);
        return afm2;
    }
}
