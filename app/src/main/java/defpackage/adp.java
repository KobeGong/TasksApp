package defpackage;

/* renamed from: adp reason: default package */
/* compiled from: PG */
final class adp implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ado a;

    adp(defpackage.ado ado) {
        this.a = ado;
    }

    public final void run() {
        android.view.ViewParent parent = this.a.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
