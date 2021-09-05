package android.support.v7.view.menu;

import defpackage.AppCompatTextView;
import defpackage.MenuItemImpl;

/* compiled from: PG */
public class ActionMenuItemView extends AppCompatTextView implements defpackage.aay, android.view.View.OnClickListener, defpackage.zw {
    public MenuItemImpl a;
    public defpackage.zg c;
    public defpackage.yr d;
    private java.lang.CharSequence e;
    private android.graphics.drawable.Drawable f;
    private defpackage.ado g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        android.content.res.Resources resources = context.getResources();
        this.h = f();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.v, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(defpackage.xu.w, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    private final boolean f() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public final MenuItemImpl a() {
        return this.a;
    }

    public final void a(MenuItemImpl ziVar) {
        this.a = ziVar;
        android.graphics.drawable.Drawable icon = ziVar.getIcon();
        this.f = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f2 = ((float) this.k) / ((float) intrinsicWidth);
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f2);
            }
            if (intrinsicHeight > this.k) {
                float f3 = ((float) this.k) / ((float) intrinsicHeight);
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f3);
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = ziVar.a((defpackage.zw) this);
        g();
        setId(ziVar.getItemId());
        setVisibility(ziVar.isVisible() ? 0 : 8);
        setEnabled(ziVar.isEnabled());
        if (ziVar.hasSubMenu() && this.g == null) {
            this.g = new defpackage.yq(this);
        }
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.a.hasSubMenu() || this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(android.view.View view) {
        if (this.c != null) {
            this.c.a(this.a);
        }
    }

    public final boolean c_() {
        return true;
    }

    private final void g() {
        java.lang.CharSequence charSequence;
        boolean z = false;
        java.lang.CharSequence charSequence2 = null;
        boolean z2 = !android.text.TextUtils.isEmpty(this.e);
        if (this.f == null || ((this.a.e & 4) == 4 && this.h)) {
            z = true;
        }
        boolean z3 = z2 & z;
        if (z3) {
            charSequence = this.e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        java.lang.CharSequence contentDescription = this.a.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        java.lang.CharSequence tooltipText = this.a.getTooltipText();
        if (android.text.TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.a.getTitle();
            }
            defpackage.aaz.a((android.view.View) this, charSequence2);
            return;
        }
        defpackage.aaz.a((android.view.View) this, tooltipText);
    }

    public final boolean c() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    public final boolean e_() {
        return c() && this.a.getIcon() == null;
    }

    public final boolean e() {
        return c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean c2 = c();
        if (c2 && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i4 = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < i4) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
        if (!c2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
