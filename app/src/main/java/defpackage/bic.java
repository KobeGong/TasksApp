package defpackage;

/* renamed from: bic reason: default package */
/* compiled from: PG */
final class bic implements java.lang.Runnable {
    private /* synthetic */ defpackage.bhz a;
    private /* synthetic */ defpackage.bib b;

    bic(defpackage.bib bib, defpackage.bhz bhz) {
        this.b = bib;
        this.a = bhz;
    }

    public final void run() {
        this.b.a.handleIntent(this.a.a);
        this.a.a();
    }
}
