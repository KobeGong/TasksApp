package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: bnj  reason: default package */
/* compiled from: PG */
final class bnj implements blu {
    private final Status a;
    private final ParcelFileDescriptor b;

    public bnj(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.ayw
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.blu
    public final ParcelFileDescriptor c() {
        return this.b;
    }

    @Override // defpackage.ayv
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor;
        if (this.b != null && (parcelFileDescriptor = this.b) != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }
}
