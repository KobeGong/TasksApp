package defpackage;

/* renamed from: adj reason: default package */
/* compiled from: PG */
final class adj extends defpackage.afk {
    private final /* synthetic */ defpackage.adh a;

    adj(defpackage.adh adh) {
        this.a = adh;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView) {
        boolean z;
        defpackage.adh adh = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = adh.j.computeVerticalScrollRange();
        int i = adh.i;
        adh.k = computeVerticalScrollRange - i > 0 && adh.i >= adh.a;
        int computeHorizontalScrollRange = adh.j.computeHorizontalScrollRange();
        int i2 = adh.h;
        if (computeHorizontalScrollRange - i2 <= 0 || adh.h < adh.a) {
            z = false;
        } else {
            z = true;
        }
        adh.l = z;
        if (adh.k || adh.l) {
            if (adh.k) {
                adh.e = (int) (((((float) computeVerticalScrollOffset) + (((float) i) / 2.0f)) * ((float) i)) / ((float) computeVerticalScrollRange));
                adh.d = java.lang.Math.min(i, (i * i) / computeVerticalScrollRange);
            }
            if (adh.l) {
                adh.g = (int) (((((float) computeHorizontalScrollOffset) + (((float) i2) / 2.0f)) * ((float) i2)) / ((float) computeHorizontalScrollRange));
                adh.f = java.lang.Math.min(i2, (i2 * i2) / computeHorizontalScrollRange);
            }
            if (adh.m == 0 || adh.m == 1) {
                adh.a(1);
            }
        } else if (adh.m != 0) {
            adh.a(0);
        }
    }
}
