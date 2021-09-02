package defpackage;

/* renamed from: cbp reason: default package */
public final /* synthetic */ class cbp implements java.util.concurrent.Callable {
    private final defpackage.cci a;
    private final defpackage.bul b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final int e;
    private final int f;

    public cbp(defpackage.cci cci, defpackage.bul bul, java.lang.String str, java.lang.String str2, int i, int i2) {
        this.a = cci;
        this.b = bul;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    public final java.lang.Object call() {
        return this.a.b(this.b, this.c, this.d, this.e, this.f);
    }
}
