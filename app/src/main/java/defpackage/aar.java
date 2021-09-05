package defpackage;

/* renamed from: aar reason: default package */
/* compiled from: PG */
final class aar implements java.lang.Runnable {
    private defpackage.aau a;
    private final /* synthetic */ defpackage.aap b;

    public aar(defpackage.aap aap, defpackage.aau aau) {
        this.b = aap;
        this.a = aau;
    }

    public final void run() {
        if (this.b.c != null) {
            MenuBuilder zeVar = this.b.c;
            if (zeVar.b != null) {
                zeVar.b.a(zeVar);
            }
        }
        android.view.View view = (android.view.View) this.b.e;
        if (!(view == null || view.getWindowToken() == null || !this.a.b())) {
            this.b.j = this.a;
        }
        this.b.l = null;
    }
}
