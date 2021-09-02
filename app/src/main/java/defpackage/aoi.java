package defpackage;

/* renamed from: aoi reason: default package */
final /* synthetic */ class aoi implements java.lang.Runnable {
    private final defpackage.aoh a;

    aoi(defpackage.aoh aoh) {
        this.a = aoh;
    }

    public final void run() {
        defpackage.aoh aoh = this.a;
        aoh.b.a(aoh);
    }
}
