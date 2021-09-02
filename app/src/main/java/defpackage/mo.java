package defpackage;

/* renamed from: mo reason: default package */
/* compiled from: PG */
final class mo implements java.lang.Runnable {
    private final /* synthetic */ defpackage.mv a;
    private final /* synthetic */ defpackage.qr b;
    private final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ defpackage.mp d;
    private final /* synthetic */ java.util.ArrayList e;
    private final /* synthetic */ android.view.View f;
    private final /* synthetic */ Fragment g;
    private final /* synthetic */ Fragment h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ java.util.ArrayList j;
    private final /* synthetic */ java.lang.Object k;
    private final /* synthetic */ android.graphics.Rect l;

    mo(defpackage.mv mvVar, defpackage.qr qrVar, java.lang.Object obj, defpackage.mp mpVar, java.util.ArrayList arrayList, android.view.View view, Fragment lcVar, Fragment lcVar2, boolean z, java.util.ArrayList arrayList2, java.lang.Object obj2, android.graphics.Rect rect) {
        this.a = mvVar;
        this.b = qrVar;
        this.c = obj;
        this.d = mpVar;
        this.e = arrayList;
        this.f = view;
        this.g = lcVar;
        this.h = lcVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public final void run() {
        defpackage.qr a2 = defpackage.mk.a(this.a, this.b, this.c, this.d);
        if (a2 != null) {
            this.e.addAll(a2.values());
            this.e.add(this.f);
        }
        defpackage.mk.a(this.g, this.h, this.i);
        if (this.c != null) {
            this.a.a(this.c, this.j, this.e);
            android.view.View a3 = defpackage.mk.a(a2, this.d, this.k, this.i);
            if (a3 != null) {
                defpackage.mv.a(a3, this.l);
            }
        }
    }
}
