package defpackage;

/* renamed from: aej reason: default package */
/* compiled from: PG */
final class aej implements java.lang.Runnable {
    private final /* synthetic */ defpackage.aec a;

    aej(defpackage.aec aec) {
        this.a = aec;
    }

    public final void run() {
        if (this.a.e != null) {
            if (ViewCompat.a.s(this.a.e) && this.a.e.getCount() > this.a.e.getChildCount() && this.a.e.getChildCount() <= this.a.k) {
                this.a.r.setInputMethodMode(2);
                this.a.d();
            }
        }
    }
}
