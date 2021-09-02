package defpackage;

/* renamed from: bin reason: default package */
/* compiled from: PG */
public final class bin extends defpackage.bel {
    private final defpackage.avh a;

    public bin(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.avh avh, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 68, bdj, ayr, ays);
        this.a = avh;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final android.os.Bundle m() {
        if (this.a == null) {
            return new android.os.Bundle();
        }
        defpackage.avh avh = this.a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("consumer_package", avh.a);
        bundle.putParcelable("password_specification", avh.b);
        bundle.putBoolean("force_save_dialog", avh.c);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof defpackage.bio) {
            return (defpackage.bio) queryLocalInterface;
        }
        return new defpackage.bip(iBinder);
    }
}
