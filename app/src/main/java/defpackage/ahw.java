package defpackage;

import android.animation.Animator;

/* access modifiers changed from: package-private */
/* renamed from: ahw  reason: default package */
/* compiled from: PG */
public final class ahw extends aic {
    private final /* synthetic */ int n;
    private final /* synthetic */ ViewHolder o;
    private final /* synthetic */ aht p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ahw(aht aht, ViewHolder afv, int i, float f, float f2, float f3, float f4, int i2, ViewHolder afv2) {
        super(afv, i, f, f2, f3, f4);
        this.p = aht;
        this.n = i2;
        this.o = afv2;
    }

    @Override // defpackage.aic
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.k) {
            if (this.n <= 0) {
                this.p.j.b(this.p.o, this.o);
            } else {
                this.p.a.add(this.o.a);
                this.h = true;
                if (this.n > 0) {
                    aht aht = this.p;
                    aht.o.post(new ahx(aht, this, this.n));
                }
            }
            if (this.p.t == this.o.a) {
                this.p.b(this.o.a);
            }
        }
    }
}
