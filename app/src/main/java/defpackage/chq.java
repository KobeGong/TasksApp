package defpackage;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: chq  reason: default package */
/* compiled from: PG */
final class chq implements cgv, cgx {
    public final /* synthetic */ chn a;

    chq(chn chn) {
        this.a = chn;
    }

    @Override // defpackage.cgv
    public final void a(Activity activity) {
        civ civ;
        chn chn = this.a;
        Class<?> cls = activity.getClass();
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            String valueOf2 = String.valueOf(cls.getSimpleName());
            civ = new civ(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else {
            civ = new civ(cls.getSimpleName());
        }
        chn.a(civ);
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        this.a.a((civ) null);
        if (this.a.i.get()) {
            this.a.c().submit(new cho(this));
        }
    }
}
