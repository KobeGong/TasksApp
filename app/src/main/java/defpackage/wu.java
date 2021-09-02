package defpackage;

/* renamed from: wu reason: default package */
/* compiled from: PG */
class wu extends defpackage.wz {
    private int v = -100;
    private boolean w;
    private boolean x = true;
    private defpackage.xl y;

    wu(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        super(context, window, wnVar);
    }

    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.v == -100) {
            this.v = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View a(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public android.view.Window.Callback a(android.view.Window.Callback callback) {
        return new defpackage.wv(this, callback);
    }

    public final boolean n() {
        return this.x;
    }

    public final boolean k() {
        int i;
        boolean z;
        if (this.v != -100) {
            i = this.v;
        } else {
            i = defpackage.wo.a;
        }
        int f = f(i);
        if (f != -1) {
            android.content.res.Resources resources = this.b.getResources();
            android.content.res.Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            int i3 = f == 2 ? 32 : 16;
            if (i2 != i3) {
                if (r()) {
                    ((android.app.Activity) this.b).recreate();
                } else {
                    android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = i3 | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (android.os.Build.VERSION.SDK_INT < 26) {
                        if (android.os.Build.VERSION.SDK_INT >= 24) {
                            defpackage.agq.c(resources);
                        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
                            defpackage.agq.b(resources);
                        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
                            defpackage.agq.a(resources);
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i == 0) {
            q();
            defpackage.xl xlVar = this.y;
            xlVar.a();
            if (xlVar.c == null) {
                xlVar.c = new defpackage.ww(xlVar);
            }
            if (xlVar.d == null) {
                xlVar.d = new android.content.IntentFilter();
                xlVar.d.addAction("android.intent.action.TIME_SET");
                xlVar.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                xlVar.d.addAction("android.intent.action.TIME_TICK");
            }
            xlVar.e.b.registerReceiver(xlVar.c, xlVar.d);
        }
        this.w = true;
        return z;
    }

    public final void e() {
        super.e();
        k();
    }

    public final void f() {
        super.f();
        if (this.y != null) {
            this.y.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public int f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                q();
                defpackage.xl xlVar = this.y;
                xlVar.b = xlVar.a.a();
                return xlVar.b ? 2 : 1;
            default:
                return i;
        }
    }

    public final void b(android.os.Bundle bundle) {
        super.b(bundle);
        if (this.v != -100) {
            bundle.putInt("appcompat:local_night_mode", this.v);
        }
    }

    public final void i() {
        super.i();
        if (this.y != null) {
            this.y.a();
        }
    }

    private final void q() {
        if (this.y == null) {
            android.content.Context context = this.b;
            if (defpackage.xn.a == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                defpackage.xn.a = new defpackage.xn(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
            }
            this.y = new defpackage.xl(this, defpackage.xn.a);
        }
    }

    private final boolean r() {
        if (!this.w || !(this.b instanceof android.app.Activity)) {
            return false;
        }
        try {
            if ((this.b.getPackageManager().getActivityInfo(new android.content.ComponentName(this.b, this.b.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            return true;
        }
    }
}
