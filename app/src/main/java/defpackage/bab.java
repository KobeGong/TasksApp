package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: bab  reason: default package */
/* compiled from: PG */
public final class bab implements ayx {
    private /* synthetic */ bbn a;
    private /* synthetic */ boolean b;
    private /* synthetic */ ayp c;
    private /* synthetic */ azx d;

    bab(azx azx, bbn bbn, boolean z, ayp ayp) {
        this.d = azx;
        this.a = bbn;
        this.b = z;
        this.c = ayp;
    }

    @Override // defpackage.ayx
    public final /* synthetic */ void a(ayw ayw) {
        Status status = (Status) ayw;
        awg a2 = awg.a(this.d.k);
        String a3 = a2.a("defaultGoogleSignInAccount");
        a2.b("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(a3)) {
            a2.b(awg.b("googleSignInAccount", a3));
            a2.b(awg.b("googleSignInOptions", a3));
        }
        if (status.a() && this.d.j()) {
            this.d.h();
        }
        this.a.a((ayw) status);
        if (this.b) {
            this.c.g();
        }
    }
}
