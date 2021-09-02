package defpackage;

/* renamed from: awo reason: default package */
/* compiled from: PG */
final class awo extends defpackage.ayf {
    awo() {
    }

    public final /* synthetic */ defpackage.ayj a(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, java.lang.Object obj, defpackage.ayr ayr, defpackage.ays ays) {
        return new defpackage.avs(context, looper, bdj, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj, ayr, ays);
    }

    public final /* synthetic */ java.util.List a(java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return java.util.Collections.emptyList();
        }
        return googleSignInOptions.a();
    }
}
