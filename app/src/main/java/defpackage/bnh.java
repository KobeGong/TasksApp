package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: bnh  reason: default package */
/* compiled from: PG */
public final class bnh extends bnm {
    private final bcb a;

    public bnh(bcb bcb) {
        super((byte) 0);
        this.a = bcb;
    }

    @Override // defpackage.bnm
    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status a2 = bnq.a(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.a(new bnj(a2, parcelFileDescriptor));
    }
}
