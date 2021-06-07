package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.tasks.R;

/* renamed from: zr  reason: default package */
/* compiled from: PG */
public class zr {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final ze e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private zu j;
    private zq k;
    private final PopupWindow.OnDismissListener l;

    public zr(Context context, ze zeVar, View view, boolean z) {
        this(context, zeVar, view, z, R.attr.actionOverflowMenuStyle, 0);
    }

    public zr(Context context, ze zeVar, View view, boolean z, int i2, int i3) {
        this.b = 8388611;
        this.l = new zs(this);
        this.d = context;
        this.e = zeVar;
        this.a = view;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    public final void a(boolean z) {
        this.i = z;
        if (this.k != null) {
            this.k.b(z);
        }
    }

    public final zq a() {
        zq aaa;
        if (this.k == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                aaa = new yv(this.d, this.a, this.g, this.h, this.f);
            } else {
                aaa = new aaa(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            aaa.a(this.e);
            aaa.a(this.l);
            aaa.a(this.a);
            aaa.a(this.j);
            aaa.b(this.i);
            aaa.a(this.b);
            this.k = aaa;
        }
        return this.k;
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, boolean z, boolean z2) {
        zq a2 = a();
        a2.c(z2);
        if (z) {
            if ((jd.a(this.b, sn.a.j(this.a)) & 7) == 5) {
                i2 -= this.a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.g = new Rect(i2 - i4, i3 - i4, i2 + i4, i4 + i3);
        }
        a2.d();
    }

    public final void c() {
        if (e()) {
            this.k.e();
        }
    }

    public void d() {
        this.k = null;
        if (this.c != null) {
            this.c.onDismiss();
        }
    }

    public final boolean e() {
        return this.k != null && this.k.f();
    }

    public final void a(zu zuVar) {
        this.j = zuVar;
        if (this.k != null) {
            this.k.a(zuVar);
        }
    }
}
