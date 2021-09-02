package defpackage;

/* renamed from: adg reason: default package */
/* compiled from: PG */
final class adg implements java.lang.Runnable {
    public final /* synthetic */ defpackage.ade a;

    adg(defpackage.ade ade) {
        this.a = ade;
    }

    public final void run() {
        this.a.b = null;
        this.a.drawableStateChanged();
    }
}
