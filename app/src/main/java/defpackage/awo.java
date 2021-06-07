package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: awo  reason: default package */
/* compiled from: PG */
final class awo extends ayf {
    awo() {
    }

    @Override // defpackage.ayf
    public final /* synthetic */ ayj a(Context context, Looper looper, bdj bdj, Object obj, ayr ayr, ays ays) {
        return new avs(context, looper, bdj, (GoogleSignInOptions) obj, ayr, ays);
    }

    @Override // defpackage.ayi
    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.a();
    }
}
