package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: wu  reason: default package */
/* compiled from: PG */
public class wu extends wz {
    private int v = -100;
    private boolean w;
    private boolean x = true;
    private xl y;

    wu(Context context, Window window, wn wnVar) {
        super(context, window, wnVar);
    }

    @Override // defpackage.wz, defpackage.wo
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.v == -100) {
            this.v = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wz
    public final View a(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public Window.Callback a(Window.Callback callback) {
        return new wv(this, callback);
    }

    @Override // defpackage.wp
    public final boolean n() {
        return this.x;
    }

    @Override // defpackage.wo, defpackage.wp
    public final boolean k() {
        int i;
        boolean z;
        if (this.v != -100) {
            i = this.v;
        } else {
            i = wo.a;
        }
        int f = f(i);
        if (f != -1) {
            Resources resources = this.b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            int i3 = f == 2 ? 32 : 16;
            if (i2 != i3) {
                if (r()) {
                    ((Activity) this.b).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = i3 | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (Build.VERSION.SDK_INT < 26) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            agq.c(resources);
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            agq.b(resources);
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            agq.a(resources);
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
            xl xlVar = this.y;
            xlVar.a();
            if (xlVar.c == null) {
                xlVar.c = new ww(xlVar);
            }
            if (xlVar.d == null) {
                xlVar.d = new IntentFilter();
                xlVar.d.addAction("android.intent.action.TIME_SET");
                xlVar.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                xlVar.d.addAction("android.intent.action.TIME_TICK");
            }
            xlVar.e.b.registerReceiver(xlVar.c, xlVar.d);
        }
        this.w = true;
        return z;
    }

    @Override // defpackage.wo, defpackage.wp
    public final void e() {
        super.e();
        k();
    }

    @Override // defpackage.wz, defpackage.wo, defpackage.wp
    public final void f() {
        super.f();
        if (this.y != null) {
            this.y.a();
        }
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                q();
                xl xlVar = this.y;
                xlVar.b = xlVar.a.a();
                return xlVar.b ? 2 : 1;
            default:
                return i;
        }
    }

    @Override // defpackage.wo, defpackage.wp
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.v != -100) {
            bundle.putInt("appcompat:local_night_mode", this.v);
        }
    }

    @Override // defpackage.wz, defpackage.wo, defpackage.wp
    public final void i() {
        super.i();
        if (this.y != null) {
            this.y.a();
        }
    }

    private final void q() {
        if (this.y == null) {
            Context context = this.b;
            if (xn.a == null) {
                Context applicationContext = context.getApplicationContext();
                xn.a = new xn(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.y = new xl(this, xn.a);
        }
    }

    private final boolean r() {
        if (!this.w || !(this.b instanceof Activity)) {
            return false;
        }
        try {
            return (this.b.getPackageManager().getActivityInfo(new ComponentName(this.b, this.b.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }
}
