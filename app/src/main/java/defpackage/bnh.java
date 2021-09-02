package defpackage;

/* renamed from: bnh reason: default package */
/* compiled from: PG */
final class bnh extends defpackage.bnm {
    private final defpackage.bcb a;

    public bnh(defpackage.bcb bcb) {
        super(0);
        this.a = bcb;
    }

    public final void a(int i, android.os.Bundle bundle, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.Bundle bundle2) {
        com.google.android.gms.common.api.Status a2 = defpackage.bnq.a(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.a(new defpackage.bnj(a2, parcelFileDescriptor));
    }
}
