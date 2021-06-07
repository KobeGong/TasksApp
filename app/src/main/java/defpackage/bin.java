package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bin  reason: default package */
/* compiled from: PG */
public final class bin extends bel {
    private final avh a;

    public bin(Context context, Looper looper, bdj bdj, avh avh, ayr ayr, ays ays) {
        super(context, looper, 68, bdj, ayr, ays);
        this.a = avh;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final Bundle m() {
        if (this.a == null) {
            return new Bundle();
        }
        avh avh = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", avh.a);
        bundle.putParcelable("password_specification", avh.b);
        bundle.putBoolean("force_save_dialog", avh.c);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof bio) {
            return (bio) queryLocalInterface;
        }
        return new bip(iBinder);
    }
}
