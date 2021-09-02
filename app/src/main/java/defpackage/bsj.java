package defpackage;

/* renamed from: bsj reason: default package */
/* compiled from: PG */
public final class bsj implements defpackage.bsk {
    private final defpackage.bcr a;

    private bsj(defpackage.bcr bcr) {
        if (bcr == null) {
            throw new java.lang.IllegalArgumentException("null dataBuffer");
        }
        this.a = bcr;
    }

    public final void a() {
        this.a.a();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final int b() {
        return this.a.b();
    }

    public bsj(defpackage.bcr bcr, byte b) {
        this(bcr);
    }

    public final java.util.Iterator iterator() {
        return new defpackage.bsl(this);
    }

    public final /* synthetic */ java.lang.Object a(int i) {
        return new defpackage.bsn((defpackage.bnr) this.a.a(i));
    }
}
