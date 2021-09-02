package defpackage;

/* renamed from: avs reason: default package */
/* compiled from: PG */
public final class avs extends defpackage.bel {
    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions a;

    public avs(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 91, bdj, ayr, ays);
        if (googleSignInOptions == null) {
            googleSignInOptions = new defpackage.avp().b();
        }
        if (!bdj.c.isEmpty()) {
            defpackage.avp avp = new defpackage.avp(googleSignInOptions);
            for (com.google.android.gms.common.api.Scope a2 : bdj.c) {
                avp.a(a2, new com.google.android.gms.common.api.Scope[0]);
            }
            googleSignInOptions = avp.b();
        }
        this.a = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean c() {
        return true;
    }

    public final android.content.Intent d() {
        android.content.Context context = this.d;
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.a;
        defpackage.avt.a.a("getSignInIntent()", new java.lang.Object[0]);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(context.getPackageName(), googleSignInOptions);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof defpackage.awd) {
            return (defpackage.awd) queryLocalInterface;
        }
        return new defpackage.awe(iBinder);
    }
}
