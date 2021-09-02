package defpackage;

/* renamed from: bwv reason: default package */
/* compiled from: PG */
public final class bwv implements defpackage.ecz {
    private final defpackage.ecz a;
    private final defpackage.ecz b;

    public bwv(defpackage.ecz ecz, defpackage.ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    public final /* synthetic */ java.lang.Object a() {
        defpackage.bwt bwt = new defpackage.bwt();
        bwt.b = (android.content.Context) this.a.a();
        bwt.c = (java.util.concurrent.ExecutorService) this.b.a();
        return bwt;
    }
}
