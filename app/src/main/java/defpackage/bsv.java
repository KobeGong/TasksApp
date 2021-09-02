package defpackage;

/* renamed from: bsv reason: default package */
/* compiled from: PG */
final class bsv extends defpackage.bro implements defpackage.bsb {
    private final defpackage.blu a;

    public bsv(defpackage.blu blu) {
        super((defpackage.ayw) blu);
        this.a = blu;
    }

    public final android.os.ParcelFileDescriptor b() {
        return this.a.c();
    }
}
