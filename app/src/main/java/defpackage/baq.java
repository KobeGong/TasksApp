package defpackage;

/* renamed from: baq reason: default package */
/* compiled from: PG */
public final class baq extends defpackage.azh {
    private final defpackage.ayn b;

    public baq(defpackage.ayn ayn) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = ayn;
    }

    public final defpackage.bca a(defpackage.bca bca) {
        return this.b.a(0, bca);
    }

    public final defpackage.bca b(defpackage.bca bca) {
        return this.b.a(1, bca);
    }

    public final android.os.Looper c() {
        return this.b.d;
    }

    public final android.content.Context b() {
        return this.b.a;
    }
}
