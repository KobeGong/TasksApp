package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: avq  reason: default package */
/* compiled from: PG */
public final class avq implements nb {
    private /* synthetic */ SignInHubActivity a;

    public avq(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.nb
    public final oc i_() {
        return new avr(this.a, ayp.a());
    }

    @Override // defpackage.nb
    public final void j_() {
    }

    @Override // defpackage.nb
    public final /* synthetic */ void a(Object obj) {
        this.a.setResult(this.a.h, this.a.i);
        this.a.finish();
    }
}
