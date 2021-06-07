package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;

/* renamed from: aaf  reason: default package */
/* compiled from: PG */
public class aaf extends ViewGroup {
    public final Context a;
    public ActionMenuView b;
    public aap c;
    public int d;
    public te e;
    private final aag f;
    private boolean g;
    private boolean h;

    aaf(Context context) {
        this(context, null);
    }

    aaf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aaf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new aag(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.a = context;
        } else {
            this.a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, xu.a, R.attr.actionBarStyle, 0);
        a(obtainStyledAttributes.getLayoutDimension(xu.l, 0));
        obtainStyledAttributes.recycle();
        if (this.c != null) {
            aap aap = this.c;
            aap.h = yb.a(aap.b).a();
            if (aap.c != null) {
                aap.c.a(true);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
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

    public boolean onHoverEvent(MotionEvent motionEvent) {
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

    public final te a(int i, long j) {
        if (this.e != null) {
            this.e.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            te a2 = sn.b(this).a(1.0f);
            a2.a(j);
            a2.a(this.f.a(a2, i));
            return a2;
        }
        te a3 = sn.b(this).a(0.0f);
        a3.a(j);
        a3.a(this.f.a(a3, i));
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

    public static int a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static int a(View view, int i, int i2, int i3, boolean z) {
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
