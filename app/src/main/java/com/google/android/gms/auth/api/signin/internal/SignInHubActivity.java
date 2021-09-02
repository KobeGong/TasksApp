package com.google.android.gms.auth.api.signin.internal;

import defpackage.FragmentActivity;

@com.google.android.gms.common.annotation.KeepName
/* compiled from: PG */
public class SignInHubActivity extends FragmentActivity {
    private static boolean j = false;
    public int h;
    public android.content.Intent i;
    private boolean k = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration l;
    private boolean m;

    /* access modifiers changed from: protected */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            b(12500);
        } else if (j) {
            setResult(0);
            b(12502);
        } else {
            j = true;
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                this.l = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
                if (this.l == null) {
                    android.util.Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                    finish();
                } else if (bundle == null) {
                    android.content.Intent intent2 = new android.content.Intent(action);
                    if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                        intent2.setPackage("com.google.android.gms");
                    } else {
                        intent2.setPackage(getPackageName());
                    }
                    intent2.putExtra("config", this.l);
                    try {
                        startActivityForResult(intent2, 40962);
                    } catch (android.content.ActivityNotFoundException e) {
                        this.k = true;
                        android.util.Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                        b(17);
                    }
                } else {
                    this.m = bundle.getBoolean("signingInGoogleApiClients");
                    if (this.m) {
                        this.h = bundle.getInt("signInResultCode");
                        this.i = (android.content.Intent) bundle.getParcelable("signInResultData");
                        d();
                    }
                }
            } else {
                java.lang.String str = "AuthSignInClient";
                java.lang.String str2 = "Unknown action: ";
                java.lang.String valueOf = java.lang.String.valueOf(intent.getAction());
                android.util.Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.m);
        if (this.m) {
            bundle.putInt("signInResultCode", this.h);
            bundle.putParcelable("signInResultData", this.i);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, android.content.Intent intent) {
        if (!this.k) {
            setResult(0);
            switch (i2) {
                case 40962:
                    if (intent != null) {
                        com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) intent.getParcelableExtra("signInAccount");
                        if (signInAccount != null && signInAccount.a != null) {
                            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = signInAccount.a;
                            defpackage.avy.a(this).a(this.l.a, googleSignInAccount);
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

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    private final void d() {
        defpackage.na.a(this).a(0, new defpackage.avq(this));
        j = false;
    }

    private final void b(int i2) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        j = false;
    }
}
