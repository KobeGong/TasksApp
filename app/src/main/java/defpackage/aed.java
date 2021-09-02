package defpackage;

/* renamed from: aed reason: default package */
/* compiled from: PG */
final class aed implements java.lang.Runnable {
    private final /* synthetic */ defpackage.aec a;

    aed(defpackage.aec aec) {
        this.a = aec;
    }

    public final void run() {
        android.view.View view = this.a.l;
        if (view != null && view.getWindowToken() != null) {
            this.a.d();
        }
    }
}
