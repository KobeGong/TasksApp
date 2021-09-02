package defpackage;

/* renamed from: anl reason: default package */
final /* synthetic */ class anl implements java.lang.Runnable {
    private final defpackage.anu a;
    private final defpackage.amn b;

    anl(defpackage.anu anu, defpackage.amn amn) {
        this.a = anu;
        this.b = amn;
    }

    public final void run() {
        defpackage.anu anu = this.a;
        anu.a.b(this.b);
    }
}
