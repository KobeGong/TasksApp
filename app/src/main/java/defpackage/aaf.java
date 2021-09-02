package defpackage;

/* renamed from: aaf reason: default package */
/* compiled from: PG */
public class aaf extends android.view.ViewGroup {
    public final android.content.Context a;
    public android.support.v7.widget.ActionMenuView b;
    public defpackage.aap c;
    public int d;
    public defpackage.te e;
    private final defpackage.aag f;
    private boolean g;
    private boolean h;

    aaf(android.content.Context context) {
        this(context, null);
    }

    aaf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aaf(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new defpackage.aag(this);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(2130772144, typedValue, true) || typedValue.resourceId == 0) {
            this.a = context;
        } else {
            this.a = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, defpackage.xu.a, 2130772145, 0);
        a(obtainStyledAttributes.getLayoutDimension(defpackage.xu.l, 0));
        obtainStyledAttributes.recycle();
        if (this.c != null) {
            defpackage.aap aap = this.c;
            aap.h = defpackage.yb.a(aap.b).a();
            if (aap.c != null) {
                aap.c.a(true);
            }
        }
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void a(int i) {
        this.d = i;
        requestLayout();
    }

    public final defpackage.te a(int i, long j) {
        if (this.e != null) {
            this.e.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            defpackage.te a2 = defpackage.sn.b(this).a(1.0f);
            a2.a(j);
            a2.a((defpackage.th) this.f.a(a2, i));
            return a2;
        }
        defpackage.te a3 = defpackage.sn.b(this).a(0.0f);
        a3.a(j);
        a3.a((defpackage.th) this.f.a(a3, i));
        return a3;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.e != null) {
                this.e.a();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.c != null) {
            return this.c.e();
        }
        return false;
    }

    public static int a(android.view.View view, int i, int i2) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return java.lang.Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static int a(android.view.View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
