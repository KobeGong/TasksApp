package defpackage;

/* renamed from: ald reason: default package */
final /* synthetic */ class ald implements java.lang.Runnable {
    private final defpackage.ala a;
    private final defpackage.cyi b;

    ald(defpackage.ala ala, defpackage.cyi cyi) {
        this.a = ala;
        this.b = cyi;
    }

    public final void run() {
        defpackage.ala ala = this.a;
        defpackage.cyi cyi = this.b;
        android.view.View view = ala.mView;
        if (view != null) {
            view.post(new defpackage.alf(ala, cyi));
        }
    }
}
