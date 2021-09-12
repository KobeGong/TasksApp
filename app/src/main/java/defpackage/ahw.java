package defpackage;

/* renamed from: ahw reason: default package */
/* compiled from: PG */
final class ahw extends defpackage.aic {
    private final /* synthetic */ int n;
    private final /* synthetic */ RecyclerViewHolder o;
    private final /* synthetic */ defpackage.aht p;

    ahw(defpackage.aht aht, RecyclerViewHolder afv, int i, float f, float f2, float f3, float f4, int i2, RecyclerViewHolder afv2) {
        this.p = aht;
        this.n = i2;
        this.o = afv2;
        super(afv, i, f, f2, f3, f4);
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.k) {
            if (this.n <= 0) {
                this.p.j.b(this.p.o, this.o);
            } else {
                this.p.a.add(this.o.itemView);
                this.h = true;
                if (this.n > 0) {
                    defpackage.aht aht = this.p;
                    aht.o.post(new defpackage.ahx(aht, this, this.n));
                }
            }
            if (this.p.t == this.o.itemView) {
                this.p.b(this.o.itemView);
            }
        }
    }
}
