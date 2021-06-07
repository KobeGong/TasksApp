package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: aaa  reason: default package */
/* compiled from: PG */
public final class aaa extends zq implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, zt {
    public final ael a;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new aab(this);
    public View c;
    public ViewTreeObserver d;
    private final Context e;
    private final ze f;
    private final zd h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final View.OnAttachStateChangeListener m = new aac(this);
    private PopupWindow.OnDismissListener n;
    private View o;
    private zu p;
    private boolean q;
    private boolean r;
    private int s;
    private int t = 0;
    private boolean u;

    public aaa(Context context, ze zeVar, View view, int i2, int i3, boolean z) {
        this.e = context;
        this.f = zeVar;
        this.i = z;
        this.h = new zd(zeVar, LayoutInflater.from(context), this.i);
        this.k = i2;
        this.l = i3;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.o = view;
        this.a = new ael(this.e, this.k, this.l);
        zeVar.a(this, context);
    }

    @Override // defpackage.zq
    public final void b(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.zq
    public final void a(int i2) {
        this.t = i2;
    }

    @Override // defpackage.zz
    public final void d() {
        boolean z = true;
        if (!f()) {
            if (this.q || this.o == null) {
                z = false;
            } else {
                this.c = this.o;
                this.a.a(this);
                this.a.m = this;
                this.a.b();
                View view = this.c;
                boolean z2 = this.d == null;
                this.d = view.getViewTreeObserver();
                if (z2) {
                    this.d.addOnGlobalLayoutListener(this.b);
                }
                view.addOnAttachStateChangeListener(this.m);
                this.a.l = view;
                this.a.j = this.t;
                if (!this.r) {
                    this.s = a(this.h, null, this.e, this.j);
                    this.r = true;
                }
                this.a.b(this.s);
                this.a.h();
                this.a.p = this.g;
                this.a.d();
                ade ade = this.a.e;
                ade.setOnKeyListener(this);
                if (this.u && this.f.f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ade, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f.f);
                    }
                    frameLayout.setEnabled(false);
                    ade.addHeaderView(frameLayout, null, false);
                }
                this.a.a(this.h);
                this.a.d();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // defpackage.zz
    public final void e() {
        if (f()) {
            this.a.e();
        }
    }

    @Override // defpackage.zq
    public final void a(ze zeVar) {
    }

    @Override // defpackage.zz
    public final boolean f() {
        return !this.q && this.a.r.isShowing();
    }

    public final void onDismiss() {
        this.q = true;
        this.f.close();
        if (this.d != null) {
            if (!this.d.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        if (this.n != null) {
            this.n.onDismiss();
        }
    }

    @Override // defpackage.zt
    public final void a(boolean z) {
        this.r = false;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override // defpackage.zt
    public final void a(zu zuVar) {
        this.p = zuVar;
    }

    @Override // defpackage.zt
    public final boolean a(aad aad) {
        boolean z;
        if (aad.hasVisibleItems()) {
            zr zrVar = new zr(this.e, aad, this.c, this.i, this.k, this.l);
            zrVar.a(this.p);
            zrVar.a(zq.b(aad));
            zrVar.c = this.n;
            this.n = null;
            this.f.b(false);
            int i2 = this.a.g;
            int c2 = this.a.c();
            if ((Gravity.getAbsoluteGravity(this.t, sn.a.j(this.o)) & 7) == 5) {
                i2 += this.o.getWidth();
            }
            if (zrVar.e()) {
                z = true;
            } else if (zrVar.a == null) {
                z = false;
            } else {
                zrVar.a(i2, c2, true, true);
                z = true;
            }
            if (z) {
                if (this.p != null) {
                    this.p.a(aad);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zt
    public final void a(ze zeVar, boolean z) {
        if (zeVar == this.f) {
            e();
            if (this.p != null) {
                this.p.a(zeVar, z);
            }
        }
    }

    @Override // defpackage.zt
    public final boolean a() {
        return false;
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        return null;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
    }

    @Override // defpackage.zq
    public final void a(View view) {
        this.o = view;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        e();
        return true;
    }

    @Override // defpackage.zq
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    @Override // defpackage.zz
    public final ListView g() {
        return this.a.e;
    }

    @Override // defpackage.zq
    public final void b(int i2) {
        this.a.g = i2;
    }

    @Override // defpackage.zq
    public final void c(int i2) {
        this.a.a(i2);
    }

    @Override // defpackage.zq
    public final void c(boolean z) {
        this.u = z;
    }
}
