package defpackage;

/* renamed from: bnj reason: default package */
/* compiled from: PG */
final class bnj implements defpackage.blu {
    private final com.google.android.gms.common.api.Status a;
    private final android.os.ParcelFileDescriptor b;

    public bnj(com.google.android.gms.common.api.Status status, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    public final android.os.ParcelFileDescriptor c() {
        return this.b;
    }

    public final void a() {
        if (this.b != null) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = this.b;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (java.io.IOException e) {
                }
            }
        }
    }
}
