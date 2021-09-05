package defpackage;

/* renamed from: zr reason: default package */
/* compiled from: PG */
public class zr {
    public android.view.View a;
    public int b = 8388613;
    public android.widget.PopupWindow.OnDismissListener c;
    private final android.content.Context d;
    private final MenuBuilder e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private MenuPresenter_Callback j;
    private defpackage.zq k;
    private final android.widget.PopupWindow.OnDismissListener l;

    public zr(android.content.Context context, MenuBuilder zeVar, android.view.View view, boolean z) {
        this(context, zeVar, view, z, 2130772143, 0);
    }

    public zr(android.content.Context context, MenuBuilder zeVar, android.view.View view, boolean z, int i2, int i3) {
        this.b = 8388611;
        this.l = new defpackage.zs(this);
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

    public final defpackage.zq a() {
        defpackage.zq aaa;
        if (this.k == null) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (java.lang.Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(2131689494)) {
                aaa = new defpackage.yv(this.d, this.a, this.g, this.h, this.f);
            } else {
                aaa = new defpackage.aaa(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            aaa.a(this.e);
            aaa.a(this.l);
            aaa.a(this.a);
            aaa.setCallback(this.j);
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

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, boolean z, boolean z2) {
        defpackage.zq a2 = a();
        a2.c(z2);
        if (z) {
            if ((defpackage.jd.a(this.b, ViewCompat.a.j(this.a)) & 7) == 5) {
                i2 -= this.a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.g = new android.graphics.Rect(i2 - i4, i3 - i4, i2 + i4, i4 + i3);
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

    public final void a(MenuPresenter_Callback zuVar) {
        this.j = zuVar;
        if (this.k != null) {
            this.k.setCallback(zuVar);
        }
    }
}
