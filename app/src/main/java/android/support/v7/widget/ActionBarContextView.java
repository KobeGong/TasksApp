package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class ActionBarContextView extends aaf {
    public CharSequence f;
    public CharSequence g;
    public View h;
    public boolean i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private int p;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        agw a = agw.a(context, attributeSet, xu.x, i2, 0);
        sn.a(this, a.a(xu.y));
        this.n = a.g(xu.C, 0);
        this.o = a.g(xu.B, 0);
        this.d = a.f(xu.A, 0);
        this.p = a.g(xu.z, R.layout.abc_action_mode_close_item_material);
        a.b.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.f();
            this.c.h();
        }
    }

    @Override // defpackage.aaf
    public final void a(int i2) {
        this.d = i2;
    }

    public final void a(View view) {
        if (this.j != null) {
            removeView(this.j);
        }
        this.j = view;
        if (!(view == null || this.k == null)) {
            removeView(this.k);
            this.k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        c();
    }

    public final void b(CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    private final void c() {
        int i2;
        int i3 = 8;
        boolean z = true;
        if (this.k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (TextView) this.k.findViewById(R.id.action_bar_title);
            this.m = (TextView) this.k.findViewById(R.id.action_bar_subtitle);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.f);
        this.m.setText(this.g);
        boolean z2 = !TextUtils.isEmpty(this.f);
        if (TextUtils.isEmpty(this.g)) {
            z = false;
        }
        TextView textView = this.m;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout = this.k;
        if (z2 || z) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        if (this.k.getParent() == null) {
            addView(this.k);
        }
    }

    public final void a(yc ycVar) {
        if (this.h == null) {
            this.h = LayoutInflater.from(getContext()).inflate(this.p, (ViewGroup) this, false);
            addView(this.h);
        } else if (this.h.getParent() == null) {
            addView(this.h);
        }
        this.h.findViewById(R.id.action_mode_close_button).setOnClickListener(new aaj(ycVar));
        ze zeVar = (ze) ycVar.b();
        if (this.c != null) {
            this.c.g();
        }
        this.c = new aap(getContext());
        this.c.d();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        zeVar.a(this.c, this.a);
        this.b = (ActionMenuView) this.c.a(this);
        sn.a(this.b, (Drawable) null);
        addView(this.b, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.j = null;
        this.b = null;
    }

    @Override // defpackage.aaf
    public final boolean a() {
        if (this.c != null) {
            return this.c.e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size;
        int i4;
        int i5;
        int i6 = 1073741824;
        int i7 = 0;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size2 = View.MeasureSpec.getSize(i2);
            if (this.d > 0) {
                size = this.d;
            } else {
                size = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size2 - getPaddingLeft()) - getPaddingRight();
            int i8 = size - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            if (this.h != null) {
                int a = a(this.h, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.b != null && this.b.getParent() == this) {
                paddingLeft = a(this.b, paddingLeft, makeMeasureSpec);
            }
            if (this.k != null && this.j == null) {
                if (this.i) {
                    this.k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(this.k, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.j != null) {
                ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i8);
                } else {
                    i5 = i8;
                }
                this.j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i5, i6));
            }
            if (this.d <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                while (i7 < childCount) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight <= i9) {
                        measuredHeight = i9;
                    }
                    i7++;
                    i9 = measuredHeight;
                }
                setMeasuredDimension(size2, i9);
                return;
            }
            setMeasuredDimension(size2, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a = ahr.a(this);
        int paddingRight = a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        if (!(this.h == null || this.h.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = a(paddingRight, i6, a);
            paddingRight = a(a2 + a(this.h, a2, paddingTop, paddingTop2, a), i7, a);
        }
        if (!(this.k == null || this.j != null || this.k.getVisibility() == 8)) {
            paddingRight += a(this.k, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.j != null) {
            a(this.j, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        if (this.b != null) {
            a(this.b, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }
}
