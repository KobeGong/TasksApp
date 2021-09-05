package defpackage;

/* renamed from: mw reason: default package */
/* compiled from: PG */
final class mw implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ java.util.ArrayList b;
    private final /* synthetic */ java.util.ArrayList c;
    private final /* synthetic */ java.util.ArrayList d;
    private final /* synthetic */ java.util.ArrayList e;

    mw(int i, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final void run() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.a) {
                ViewCompat.a((android.view.View) this.b.get(i2), (java.lang.String) this.c.get(i2));
                ViewCompat.a((android.view.View) this.d.get(i2), (java.lang.String) this.e.get(i2));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
