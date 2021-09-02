package defpackage;

/* renamed from: byw reason: default package */
public final /* synthetic */ class byw implements java.util.concurrent.Callable {
    private final defpackage.byu a;
    private final defpackage.bul b;
    private final java.util.List c;
    private final defpackage.bvo d;

    public byw(defpackage.byu byu, defpackage.bul bul, java.util.List list, defpackage.bvo bvo) {
        this.a = byu;
        this.b = bul;
        this.c = list;
        this.d = bvo;
    }

    public final java.lang.Object call() {
        defpackage.byu byu = this.a;
        byu.a.a(this.b, this.c, this.d);
        return null;
    }
}
