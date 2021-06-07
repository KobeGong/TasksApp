package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;

/* renamed from: avs  reason: default package */
/* compiled from: PG */
public final class avs extends bel {
    public final GoogleSignInOptions a;

    public avs(Context context, Looper looper, bdj bdj, GoogleSignInOptions googleSignInOptions, ayr ayr, ays ays) {
        super(context, looper, 91, bdj, ayr, ays);
        googleSignInOptions = googleSignInOptions == null ? new avp().b() : googleSignInOptions;
        if (!bdj.c.isEmpty()) {
            avp avp = new avp(googleSignInOptions);
            for (Scope scope : bdj.c) {
                avp.a(scope, new Scope[0]);
            }
            googleSignInOptions = avp.b();
        }
        this.a = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.ayj, defpackage.bcx
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ayj, defpackage.bcx
    public final Intent d() {
        Context context = this.d;
        GoogleSignInOptions googleSignInOptions = this.a;
        avt.a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof awd) {
            return (awd) queryLocalInterface;
        }
        return new awe(iBinder);
    }
}
