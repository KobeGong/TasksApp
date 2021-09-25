package defpackage;

import android.content.Intent;
import android.view.View;

import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: aql reason: default package */
/* compiled from: PG */
public abstract class aql extends defpackage.wm {
    private defpackage.cyi h;
    public defpackage.wl r;
    public Snackbar s;

    public abstract void a(defpackage.ajn ajn);

    public abstract void h();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void n();

    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.crk crk = defpackage.crk.a;
        if (crk.a()) {
            ((defpackage.aki) crk.b()).a();
        }
    }

    public void onStop() {
        super.onStop();
        defpackage.aiq.get().a((defpackage.ajc) null);
        defpackage.any.get().d.a((defpackage.aoc) null);
    }

    public final boolean q() {
        if (!(defpackage.axv.a(this) == 0)) {
            k();
            return false;
        }
        defpackage.aiq.get().a(new defpackage.ajc(this));
        defpackage.any.get().d.a(new defpackage.aoc(this));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(java.lang.Throwable th) {
        java.lang.Throwable th2 = th;
        while (!(th2 instanceof defpackage.axx)) {
            if (th2 instanceof defpackage.avf) {
                if (defpackage.any.get().c().a()) {
                    final Throwable a = th2;
                    this.s = (Snackbar) Snackbar.a(m(), R.string.invalid_credentials, -2).a(R.string.sign_in, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivityForResult(((defpackage.avf) a).a(), 1001);
                        }
                    }).a(new aqz());
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
        defpackage.axt.a.a(this, ((defpackage.axx) th2).a).show();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1001:
                if (resultCode == -1) {
                    defpackage.aiq.get().b();
                    h();
                    return;
                }
                return;
            case 1002:
                if (resultCode != -1) {
                    java.lang.String str = "This app requires Google Play Services. Please install Google Play Services on your device and relaunch this app.";
                    android.widget.Toast.makeText(getApplicationContext(), str, 1).show();
                    defpackage.azb.b(str, new java.lang.Object[0]);
                    return;
                }
                defpackage.aiq.get().b();
                n();
                return;
            default:
                return;
        }
    }

    public android.view.View m() {
        return findViewById(android.R.id.content);
    }

    public final boolean r() {
        return isFinishing() || isDestroyed();
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.czq czq) {
        runOnUiThread(new defpackage.aqq(this, czq));
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, Intent intent) {
        Snackbar a = Snackbar.a(m(), i, 0);
        a.a(2131951847, new aqr(this, intent));
        a.a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.Object a(int i, defpackage.cyi cyi, defpackage.cyu cyu, java.util.Locale locale) {
        boolean z = true;
        defpackage.czq czq = com.google.android.apps.tasks.common.TaskApplication.getApplication().b;
        if (czq != null) {
            a(czq);
        } else if (this.h == null) {
            defpackage.cyi a = defpackage.any.get().c().a(i);
            this.h = a;
            a.a(new defpackage.aqp(this, a), com.google.android.apps.tasks.common.TaskApplication.getApplication().executor);
        }
        try {
            defpackage.ain ain = (defpackage.ain) cyi.get();
            if (ain.preferences.getBoolean("setup-called", false)) {
                z = false;
            }
            if (defpackage.any.get().c().a() || z) {
                runOnUiThread(new defpackage.aqu(this));
            }
            if (z) {
                try {
                    defpackage.any.get().c().e(locale.getCountry(), locale.getLanguage()).get();
                    android.content.SharedPreferences.Editor edit = ain.preferences.edit();
                    edit.putBoolean("setup-called", true);
                    edit.apply();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    cyu.a(AbsAccountSetupResult.failure());
                }
            }
            if (!defpackage.any.get().c().a()) {
                cyu.a(AbsAccountSetupResult.success(false));
            } else {
                try {
                    defpackage.any.get().c().c().get();
                    try {
                        defpackage.any.get().c().a("~default").get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
                    }
                    cyu.a(AbsAccountSetupResult.success(true));
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e3) {
                    cyu.a(AbsAccountSetupResult.failure());
                }
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e4) {
            cyu.a(AbsAccountSetupResult.failure());
        }
        return null;
    }
}
