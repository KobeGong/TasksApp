package defpackage;

/* renamed from: aql reason: default package */
/* compiled from: PG */
public abstract class aql extends defpackage.wm {
    private defpackage.cyi h;
    public defpackage.wl r;
    public com.google.android.apps.tasks.ui.components.snackbar.Snackbar s;

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
        defpackage.aiq.a().a((defpackage.ajc) null);
        defpackage.any.a().d.a((defpackage.aoc) null);
    }

    public final boolean q() {
        if (!(defpackage.axv.a((android.content.Context) this) == 0)) {
            k();
            return false;
        }
        defpackage.aiq.a().a(new defpackage.ajc(this));
        defpackage.any.a().d.a(new defpackage.aoc(this));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(java.lang.Throwable th) {
        java.lang.Throwable th2 = th;
        while (!(th2 instanceof defpackage.axx)) {
            if (th2 instanceof defpackage.avf) {
                if (defpackage.any.a().c().a()) {
                    this.s = (com.google.android.apps.tasks.ui.components.snackbar.Snackbar) com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(m(), 2131951741, -2).a(2131951810, (android.view.View.OnClickListener) new defpackage.aqm(this, th2)).a((defpackage.arl) new defpackage.aqz());
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
        defpackage.axt.a.a((android.app.Activity) this, ((defpackage.axx) th2).a).show();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    defpackage.aiq.a().b();
                    h();
                    return;
                }
                return;
            case 1002:
                if (i2 != -1) {
                    java.lang.String str = "This app requires Google Play Services. Please install Google Play Services on your device and relaunch this app.";
                    android.widget.Toast.makeText(getApplicationContext(), str, 1).show();
                    defpackage.azb.b(str, new java.lang.Object[0]);
                    return;
                }
                defpackage.aiq.a().b();
                n();
                return;
            default:
                return;
        }
    }

    public android.view.View m() {
        return findViewById(16908290);
    }

    public final boolean r() {
        return isFinishing() || isDestroyed();
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.czq czq) {
        runOnUiThread(new defpackage.aqq(this, czq));
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, android.content.Intent intent) {
        com.google.android.apps.tasks.ui.components.snackbar.Snackbar a = com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(m(), i, 0);
        a.a(2131951847, (android.view.View.OnClickListener) new defpackage.aqr(this, intent));
        a.a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.Object a(int i, defpackage.cyi cyi, defpackage.cyu cyu, java.util.Locale locale) {
        boolean z = true;
        defpackage.czq czq = com.google.android.apps.tasks.common.TaskApplication.getApplication().b;
        if (czq != null) {
            a(czq);
        } else if (this.h == null) {
            defpackage.cyi a = defpackage.any.a().c().a(i);
            this.h = a;
            a.a(new defpackage.aqp(this, a), com.google.android.apps.tasks.common.TaskApplication.getApplication().a);
        }
        try {
            defpackage.ain ain = (defpackage.ain) cyi.get();
            if (ain.a.getBoolean("setup-called", false)) {
                z = false;
            }
            if (defpackage.any.a().c().a() || z) {
                runOnUiThread(new defpackage.aqu(this));
            }
            if (z) {
                try {
                    defpackage.any.a().c().e(locale.getCountry(), locale.getLanguage()).get();
                    android.content.SharedPreferences.Editor edit = ain.a.edit();
                    edit.putBoolean("setup-called", true);
                    edit.apply();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    cyu.a((java.lang.Object) defpackage.ajh.c());
                }
            }
            if (!defpackage.any.a().c().a()) {
                cyu.a((java.lang.Object) defpackage.ajh.a(false));
            } else {
                try {
                    defpackage.any.a().c().c().get();
                    try {
                        defpackage.any.a().c().a("~default").get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
                    }
                    cyu.a((java.lang.Object) defpackage.ajh.a(true));
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e3) {
                    cyu.a((java.lang.Object) defpackage.ajh.c());
                }
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e4) {
            cyu.a((java.lang.Object) defpackage.ajh.c());
        }
        return null;
    }
}
