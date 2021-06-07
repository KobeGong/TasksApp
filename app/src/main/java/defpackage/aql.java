package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: aql  reason: default package */
/* compiled from: PG */
public abstract class aql extends wm {
    private cyi h;
    public wl r;
    public Snackbar s;

    public abstract void a(ajn ajn);

    public abstract void h();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void n();

    @Override // defpackage.nv, defpackage.wm, defpackage.lg
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        crk crk = crk.a;
        if (crk.a()) {
            ((aki) crk.b()).a();
        }
    }

    @Override // defpackage.wm, defpackage.lg
    public void onStop() {
        super.onStop();
        aiq.a().a((ajc) null);
        any.a().d.a((aoc) null);
    }

    public final boolean q() {
        if (!(axv.a(this) == 0)) {
            k();
            return false;
        }
        aiq.a().a(new ajc(this));
        any.a().d.a(new aoc(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Throwable th) {
        Throwable th2 = th;
        while (!(th2 instanceof axx)) {
            if (th2 instanceof avf) {
                if (any.a().c().a()) {
                    this.s = (Snackbar) Snackbar.a(m(), (int) R.string.invalid_credentials, -2).a(R.string.sign_in, new aqm(this, th2)).a(new aqz());
                    this.s.a();
                } else {
                    j();
                }
                return true;
            } else if (th2.getCause() == null) {
                return false;
            } else {
                th2 = th2.getCause();
            }
        }
        axt.a.a((Activity) this, ((axx) th2).a).show();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    aiq.a().b();
                    h();
                    return;
                }
                return;
            case 1002:
                if (i2 != -1) {
                    Toast.makeText(getApplicationContext(), "This app requires Google Play Services. Please install Google Play Services on your device and relaunch this app.", 1).show();
                    azb.b("This app requires Google Play Services. Please install Google Play Services on your device and relaunch this app.", new Object[0]);
                    return;
                }
                aiq.a().b();
                n();
                return;
            default:
                return;
        }
    }

    public View m() {
        return findViewById(16908290);
    }

    public final boolean r() {
        return isFinishing() || isDestroyed();
    }

    /* access modifiers changed from: package-private */
    public final void a(czq czq) {
        runOnUiThread(new aqq(this, czq));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Intent intent) {
        Snackbar a = Snackbar.a(m(), i, 0);
        a.a(R.string.update_required_button, new aqr(this, intent));
        a.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(int i, cyi cyi, cyu cyu, Locale locale) {
        boolean z = true;
        czq czq = TaskApplication.b().b;
        if (czq != null) {
            a(czq);
        } else if (this.h == null) {
            cyi a = any.a().c().a(i);
            this.h = a;
            a.a(new aqp(this, a), TaskApplication.b().a);
        }
        try {
            ain ain = (ain) cyi.get();
            if (ain.a.getBoolean("setup-called", false)) {
                z = false;
            }
            if (any.a().c().a() || z) {
                runOnUiThread(new aqu(this));
            }
            if (z) {
                try {
                    any.a().c().e(locale.getCountry(), locale.getLanguage()).get();
                    SharedPreferences.Editor edit = ain.a.edit();
                    edit.putBoolean("setup-called", true);
                    edit.apply();
                } catch (InterruptedException | ExecutionException e) {
                    cyu.a(ajh.c());
                }
            }
            if (!any.a().c().a()) {
                cyu.a(ajh.a(false));
            } else {
                try {
                    any.a().c().c().get();
                    try {
                        any.a().c().a("~default").get();
                    } catch (InterruptedException | ExecutionException e2) {
                    }
                    cyu.a(ajh.a(true));
                } catch (InterruptedException | ExecutionException e3) {
                    cyu.a(ajh.c());
                }
            }
        } catch (InterruptedException | ExecutionException e4) {
            cyu.a(ajh.c());
        }
        return null;
    }
}
