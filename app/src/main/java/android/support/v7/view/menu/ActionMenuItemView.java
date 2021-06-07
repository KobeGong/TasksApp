package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
public class ActionMenuItemView extends ack implements aay, View.OnClickListener, zw {
    public zi a;
    public zg c;
    public yr d;
    private CharSequence e;
    private Drawable f;
    private ado g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.v, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(xu.w, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    private final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    @Override // defpackage.zw
    public final zi a() {
        return this.a;
    }

    @Override // defpackage.zw
    public final void a(zi ziVar) {
        this.a = ziVar;
        Drawable icon = ziVar.getIcon();
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
        this.e = ziVar.a(this);
        g();
        setId(ziVar.getItemId());
        setVisibility(ziVar.isVisible() ? 0 : 8);
        setEnabled(ziVar.isEnabled());
        if (ziVar.hasSubMenu() && this.g == null) {
            this.g = new yq(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.hasSubMenu() || this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        if (this.c != null) {
            this.c.a(this.a);
        }
    }

    @Override // defpackage.zw
    public final boolean c_() {
        return true;
    }

    private final void g() {
        CharSequence charSequence;
        boolean z = false;
        CharSequence charSequence2 = null;
        boolean z2 = !TextUtils.isEmpty(this.e);
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
        CharSequence contentDescription = this.a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.a.getTitle();
            }
            aaz.a(this, charSequence2);
            return;
        }
        aaz.a(this, tooltipText);
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.aay
    public final boolean e_() {
        return c() && this.a.getIcon() == null;
    }

    @Override // defpackage.aay
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
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!c2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
