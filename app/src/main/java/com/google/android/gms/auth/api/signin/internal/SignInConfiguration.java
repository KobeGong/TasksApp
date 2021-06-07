package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public final class SignInConfiguration extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awf();
    public GoogleSignInOptions a;
    private final String b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.b = azb.b(str);
        this.a = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.b);
        bjr.a(parcel, 5, this.a, i);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
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
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        return new avz().a(this.b).a(this.a).a;
    }
}
