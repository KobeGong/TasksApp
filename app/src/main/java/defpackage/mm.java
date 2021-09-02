package defpackage;

/* renamed from: mm reason: default package */
/* compiled from: PG */
final class mm implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ defpackage.mv b;
    private final /* synthetic */ android.view.View c;
    private final /* synthetic */ Fragment d;
    private final /* synthetic */ java.util.ArrayList e;
    private final /* synthetic */ java.util.ArrayList f;
    private final /* synthetic */ java.util.ArrayList g;
    private final /* synthetic */ java.lang.Object h;

    mm(java.lang.Object obj, defpackage.mv mvVar, android.view.View view, Fragment lcVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.lang.Object obj2) {
        this.a = obj;
        this.b = mvVar;
        this.c = view;
        this.d = lcVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public final void run() {
        if (this.a != null) {
            this.b.c(this.a, this.c);
            this.f.addAll(defpackage.mk.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.c);
                this.b.b(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
