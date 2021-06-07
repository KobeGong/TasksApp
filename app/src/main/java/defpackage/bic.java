package defpackage;

/* renamed from: bic  reason: default package */
/* compiled from: PG */
final class bic implements Runnable {
    private /* synthetic */ bhz a;
    private /* synthetic */ bib b;

    bic(bib bib, bhz bhz) {
        this.b = bib;
        this.a = bhz;
    }

    public final void run() {
        this.b.a.handleIntent(this.a.a);
        this.a.a();
    }
}
