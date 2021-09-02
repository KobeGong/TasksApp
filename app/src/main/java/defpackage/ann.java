package defpackage;

/* renamed from: ann reason: default package */
final /* synthetic */ class ann implements java.lang.Runnable {
    private final defpackage.anc a;
    private final java.lang.String b;

    ann(defpackage.anc anc, java.lang.String str) {
        this.a = anc;
        this.b = str;
    }

    public final void run() {
        defpackage.anc anc = this.a;
        java.lang.String str = this.b;
        if (anc.a.a.a(str) != null) {
            anc.a(str, anc.a, new defpackage.cyu());
        }
    }
}
