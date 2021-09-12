package defpackage;

/* renamed from: acu reason: default package */
/* compiled from: PG */
final class acu implements java.lang.Runnable {
    private final /* synthetic */ java.util.ArrayList a;
    private final /* synthetic */ defpackage.acs b;

    acu(defpackage.acs acs, java.util.ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        android.view.View view;
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.adb adb = (defpackage.adb) arrayList.get(i);
            defpackage.acs acs = this.b;
            RecyclerViewHolder afv = adb.a;
            android.view.View view2 = afv == null ? null : afv.itemView;
            RecyclerViewHolder afv2 = adb.b;
            if (afv2 != null) {
                view = afv2.itemView;
            } else {
                view = null;
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator duration = view2.animate().setDuration(acs.l);
                acs.g.add(adb.a);
                duration.translationX((float) (adb.e - adb.c));
                duration.translationY((float) (adb.f - adb.d));
                duration.alpha(0.0f).setListener(new defpackage.acz(acs, adb, duration, view2)).start();
            }
            if (view != null) {
                android.view.ViewPropertyAnimator animate = view.animate();
                acs.g.add(adb.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(acs.l).alpha(1.0f).setListener(new defpackage.ada(acs, adb, animate, view)).start();
            }
            i = i2;
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
