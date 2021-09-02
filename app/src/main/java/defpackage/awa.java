package defpackage;

/* renamed from: awa reason: default package */
/* compiled from: PG */
public final class awa extends defpackage.bkn implements android.os.IInterface {
    private final android.content.Context a;

    public awa() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                a();
                defpackage.awg a2 = defpackage.awg.a(this.a);
                com.google.android.gms.auth.api.signin.GoogleSignInAccount a3 = a2.a();
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = com.google.android.gms.auth.api.signin.GoogleSignInOptions.d;
                if (a3 != null) {
                    googleSignInOptions = a2.b();
                }
                defpackage.ayp a4 = new defpackage.ayq(this.a).a(defpackage.avg.a, googleSignInOptions).a();
                try {
                    if (a4.f().b()) {
                        if (a3 != null) {
                            android.content.Context b = a4.b();
                            defpackage.avt.a.a("Revoking access", new java.lang.Object[0]);
                            defpackage.avt.a(b);
                            a4.b((defpackage.bca) new defpackage.avv(a4, 0));
                        } else {
                            a4.i();
                        }
                    }
                    break;
                } finally {
                    a4.g();
                }
            case 2:
                a();
                defpackage.avy.a(this.a).a();
                break;
            default:
                return false;
        }
        return true;
    }

    public awa(android.content.Context context) {
        this();
        this.a = context;
    }

    private final void a() {
        if (!defpackage.axy.a(this.a, android.os.Binder.getCallingUid())) {
            throw new java.lang.SecurityException("Calling UID " + android.os.Binder.getCallingUid() + " is not Google Play services.");
        }
    }
}
