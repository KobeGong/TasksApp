package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
/* compiled from: PG */
public class SignInHubActivity extends lg {
    private static boolean j = false;
    public int h;
    public Intent i;
    private boolean k = false;
    private SignInConfiguration l;
    private boolean m;

    /* access modifiers changed from: protected */
    @Override // defpackage.nv, defpackage.lg
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            b(12500);
        } else if (j) {
            setResult(0);
            b(12502);
        } else {
            j = true;
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                this.l = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
                if (this.l == null) {
                    Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                    finish();
                } else if (bundle == null) {
                    Intent intent2 = new Intent(action);
                    if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                        intent2.setPackage("com.google.android.gms");
                    } else {
                        intent2.setPackage(getPackageName());
                    }
                    intent2.putExtra("config", this.l);
                    try {
                        startActivityForResult(intent2, 40962);
                    } catch (ActivityNotFoundException e) {
                        this.k = true;
                        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                        b(17);
                    }
                } else {
                    this.m = bundle.getBoolean("signingInGoogleApiClients");
                    if (this.m) {
                        this.h = bundle.getInt("signInResultCode");
                        this.i = (Intent) bundle.getParcelable("signInResultData");
                        d();
                    }
                }
            } else {
                String valueOf = String.valueOf(intent.getAction());
                Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.nv, defpackage.lg
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.m);
        if (this.m) {
            bundle.putInt("signInResultCode", this.h);
            bundle.putParcelable("signInResultData", this.i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.k) {
            setResult(0);
            switch (i2) {
                case 40962:
                    if (intent != null) {
                        SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                        if (signInAccount != null && signInAccount.a != null) {
                            GoogleSignInAccount googleSignInAccount = signInAccount.a;
                            avy.a(this).a(this.l.a, googleSignInAccount);
                            intent.removeExtra("signInAccount");
                            intent.putExtra("googleSignInAccount", googleSignInAccount);
                            this.m = true;
                            this.h = i3;
                            this.i = intent;
                            d();
                            return;
                        } else if (intent.hasExtra("errorCode")) {
                            b(intent.getIntExtra("errorCode", 8));
                            return;
                        }
                    }
                    b(8);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    private final void d() {
        na.a(this).a(0, new avq(this));
        j = false;
    }

    private final void b(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        j = false;
    }
}
