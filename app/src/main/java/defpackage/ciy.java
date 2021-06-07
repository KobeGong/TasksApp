package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: ciy  reason: default package */
/* compiled from: PG */
public final class ciy extends cgj implements cgx, cle {
    public final SharedPreferences d;
    public final boolean e;
    public final int f;
    public final Pattern[] g;
    private final cha h;

    ciy(coe coe, Application application, clt clt, SharedPreferences sharedPreferences, boolean z, int i, Pattern... patternArr) {
        super(coe, application, clt, bg.Z);
        this.d = sharedPreferences;
        this.e = z;
        this.f = i;
        this.g = patternArr;
        this.h = cha.a(application);
    }

    @Override // defpackage.cle
    public final void e() {
        this.h.a(this);
    }

    @Override // defpackage.cle
    public final void f() {
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        this.h.b(this);
        c().submit(new ciz(this));
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        this.h.b(this);
    }
}
