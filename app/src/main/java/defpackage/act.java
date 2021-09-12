package defpackage;

/* renamed from: act reason: default package */
/* compiled from: PG */
final class act implements java.lang.Runnable {
    private final /* synthetic */ java.util.ArrayList a;
    private final /* synthetic */ defpackage.acs b;

    act(defpackage.acs acs, java.util.ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.adc adc = (defpackage.adc) arrayList.get(i);
            defpackage.acs acs = this.b;
            RecyclerViewHolder afv = adc.a;
            int i3 = adc.b;
            int i4 = adc.c;
            int i5 = adc.d;
            int i6 = adc.e;
            android.view.View view = afv.itemView;
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (i7 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            acs.e.add(afv);
            animate.setDuration(acs.k).setListener(new defpackage.acy(acs, afv, i7, view, i8, animate)).start();
            i = i2;
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
