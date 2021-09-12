package defpackage;

/* renamed from: acv reason: default package */
/* compiled from: PG */
final class acv implements java.lang.Runnable {
    private final /* synthetic */ java.util.ArrayList a;
    private final /* synthetic */ defpackage.acs b;

    acv(defpackage.acs acs, java.util.ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            RecyclerViewHolder afv = (RecyclerViewHolder) obj;
            defpackage.acs acs = this.b;
            android.view.View view = afv.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            acs.d.add(afv);
            animate.alpha(1.0f).setDuration(acs.i).setListener(new defpackage.acx(acs, afv, view, animate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
