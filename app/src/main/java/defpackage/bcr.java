package defpackage;

/* renamed from: bcr reason: default package */
/* compiled from: PG */
public final class bcr implements defpackage.ayv, java.lang.Iterable {
    private final com.google.android.gms.common.data.DataHolder a;

    public final int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.e;
    }

    public final /* synthetic */ java.lang.Object a(int i) {
        return new defpackage.bnp(this.a, i);
    }

    private bcr(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public final java.util.Iterator iterator() {
        return new defpackage.bcu(this);
    }

    public final void a() {
        if (this.a != null) {
            this.a.close();
        }
    }

    public bcr(com.google.android.gms.common.data.DataHolder dataHolder, byte b) {
        this(dataHolder);
    }
}
