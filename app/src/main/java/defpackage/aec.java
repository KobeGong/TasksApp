package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: aec  reason: default package */
/* compiled from: PG */
public class aec implements zz {
    private static Method a;
    private static Method b;
    private static Method c;
    private final aef A;
    private final Rect B;
    private Context d;
    public ade e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public final aej n;
    public final Handler o;
    public Rect p;
    public boolean q;
    public PopupWindow r;
    private ListAdapter s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private DataSetObserver x;
    private final aei y;
    private final aeh z;

    public aec(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public aec(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.t = -2;
        this.f = -2;
        this.v = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.n = new aej(this);
        this.y = new aei(this);
        this.z = new aeh(this);
        this.A = new aef(this);
        this.B = new Rect();
        this.d = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.aV, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(xu.aW, 0);
        this.u = obtainStyledAttributes.getDimensionPixelOffset(xu.aX, 0);
        if (this.u != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        this.r = new abv(context, attributeSet, i2, i3);
        this.r.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.x == null) {
            this.x = new aeg(this);
        } else if (this.s != null) {
            this.s.unregisterDataSetObserver(this.x);
        }
        this.s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        if (this.e != null) {
            this.e.setAdapter(this.s);
        }
    }

    public final void b() {
        this.q = true;
        this.r.setFocusable(true);
    }

    public final void a(Drawable drawable) {
        this.r.setBackgroundDrawable(drawable);
    }

    public final int c() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }

    public final void a(int i2) {
        this.u = i2;
        this.w = true;
    }

    public final void b(int i2) {
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            this.f = this.B.left + this.B.right + i2;
            return;
        }
        this.f = i2;
    }

    @Override // defpackage.zz
    public void d() {
        int i2;
        boolean z2;
        int makeMeasureSpec;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (this.e == null) {
            Context context = this.d;
            new aed(this);
            this.e = a(context, !this.q);
            this.e.setAdapter(this.s);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new aee(this));
            this.e.setOnScrollListener(this.z);
            this.r.setContentView(this.e);
        } else {
            this.r.getContentView();
        }
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            int i11 = this.B.top + this.B.bottom;
            if (!this.w) {
                this.u = -this.B.top;
                i2 = i11;
            } else {
                i2 = i11;
            }
        } else {
            this.B.setEmpty();
            i2 = 0;
        }
        if (this.r.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a2 = a(this.l, this.u, z2);
        if (this.t == -1) {
            i4 = a2 + i2;
        } else {
            switch (this.f) {
                case -2:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
                    break;
            }
            int a3 = this.e.a(makeMeasureSpec, 0, -1, a2, -1);
            if (a3 > 0) {
                i3 = this.e.getPaddingTop() + this.e.getPaddingBottom() + i2 + 0;
            } else {
                i3 = 0;
            }
            i4 = i3 + a3;
        }
        boolean j2 = j();
        vb.a(this.r, this.v);
        if (this.r.isShowing()) {
            if (sn.a.s(this.l)) {
                if (this.f == -1) {
                    i6 = -1;
                } else if (this.f == -2) {
                    i6 = this.l.getWidth();
                } else {
                    i6 = this.f;
                }
                if (this.t == -1) {
                    if (j2) {
                        i8 = i4;
                    } else {
                        i8 = -1;
                    }
                    if (j2) {
                        PopupWindow popupWindow = this.r;
                        if (this.f == -1) {
                            i9 = -1;
                        } else {
                            i9 = 0;
                        }
                        popupWindow.setWidth(i9);
                        this.r.setHeight(0);
                        i7 = i8;
                    } else {
                        PopupWindow popupWindow2 = this.r;
                        if (this.f == -1) {
                            i10 = -1;
                        }
                        popupWindow2.setWidth(i10);
                        this.r.setHeight(-1);
                        i7 = i8;
                    }
                } else if (this.t == -2) {
                    i7 = i4;
                } else {
                    i7 = this.t;
                }
                this.r.setOutsideTouchable(true);
                PopupWindow popupWindow3 = this.r;
                View view = this.l;
                int i12 = this.g;
                int i13 = this.u;
                if (i6 < 0) {
                    i6 = -1;
                }
                if (i7 < 0) {
                    i7 = -1;
                }
                popupWindow3.update(view, i12, i13, i6, i7);
                return;
            }
            return;
        }
        if (this.f == -1) {
            i5 = -1;
        } else if (this.f == -2) {
            i5 = this.l.getWidth();
        } else {
            i5 = this.f;
        }
        if (this.t == -1) {
            i4 = -1;
        } else if (this.t != -2) {
            i4 = this.t;
        }
        this.r.setWidth(i5);
        this.r.setHeight(i4);
        if (a != null) {
            try {
                a.invoke(this.r, true);
            } catch (Exception e2) {
            }
        }
        this.r.setOutsideTouchable(true);
        this.r.setTouchInterceptor(this.y);
        if (this.i) {
            vb.a(this.r, this.h);
        }
        if (c != null) {
            try {
                c.invoke(this.r, this.p);
            } catch (Exception e3) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
            }
        }
        vb.a.a(this.r, this.l, this.g, this.u, this.j);
        this.e.setSelection(-1);
        if (!this.q || this.e.isInTouchMode()) {
            i();
        }
        if (!this.q) {
            this.o.post(this.A);
        }
    }

    @Override // defpackage.zz
    public final void e() {
        this.r.dismiss();
        this.r.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.r.setOnDismissListener(onDismissListener);
    }

    public final void h() {
        this.r.setInputMethodMode(2);
    }

    public final void i() {
        ade ade = this.e;
        if (ade != null) {
            ade.a = true;
            ade.requestLayout();
        }
    }

    @Override // defpackage.zz
    public final boolean f() {
        return this.r.isShowing();
    }

    public final boolean j() {
        return this.r.getInputMethodMode() == 2;
    }

    @Override // defpackage.zz
    public final ListView g() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public ade a(Context context, boolean z2) {
        return new ade(context, z2);
    }

    private final int a(View view, int i2, boolean z2) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.r, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception e2) {
            }
        }
        return this.r.getMaxAvailableHeight(view, i2);
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
        }
        try {
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException e4) {
        }
    }
}
