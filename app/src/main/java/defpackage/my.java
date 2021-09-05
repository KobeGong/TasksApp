package defpackage;

/* renamed from: my reason: default package */
/* compiled from: PG */
final class my implements java.lang.Runnable {
    private final /* synthetic */ java.util.ArrayList a;
    private final /* synthetic */ java.util.Map b;

    my(java.util.ArrayList arrayList, java.util.Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = (android.view.View) this.a.get(i);
            ViewCompat.a(view, (java.lang.String) this.b.get(ViewCompat.a.t(view)));
        }
    }
}
