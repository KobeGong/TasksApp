package com.google.android.gms.auth.api.signin.internal;

/* compiled from: PG */
public final class SignInConfiguration extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.awf();
    public com.google.android.gms.auth.api.signin.GoogleSignInOptions a;
    private final java.lang.String b;

    public SignInConfiguration(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.b = defpackage.azb.b(str);
        this.a = googleSignInOptions;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.b);
        defpackage.bjr.a(parcel, 5, (android.os.Parcelable) this.a, i);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) obj;
            if (!this.b.equals(signInConfiguration.b)) {
                return false;
            }
            if (this.a == null) {
                if (signInConfiguration.a != null) {
                    return false;
                }
            } else if (!this.a.equals(signInConfiguration.a)) {
                return false;
            }
            return true;
        } catch (java.lang.ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        return new defpackage.avz().a((java.lang.Object) this.b).a((java.lang.Object) this.a).a;
    }
}
