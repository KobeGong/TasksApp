package android.support.design.internal;

import defpackage.MenuItemImpl;
import defpackage.ViewCompat;

/* compiled from: PG */
public class NavigationMenuItemView extends defpackage.ey implements defpackage.zw {
    private static final int[] l = {16842912};
    public boolean a;
    public boolean b;
    public final android.widget.CheckedTextView c;
    public android.widget.FrameLayout d;
    public MenuItemImpl e;
    public android.content.res.ColorStateList f;
    public boolean g;
    private final int m;
    private android.graphics.drawable.Drawable n;
    private final defpackage.rn o;

    public NavigationMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new defpackage.fa(this);
        c(0);
        android.view.LayoutInflater.from(context).inflate(2131034169, this, true);
        this.m = context.getResources().getDimensionPixelSize(2131689639);
        this.c = (android.widget.CheckedTextView) findViewById(2131755285);
        this.c.setDuplicateParentStateEnabled(true);
        ViewCompat.a((android.view.View) this.c, this.o);
    }

    public final void a(MenuItemImpl ziVar) {
        android.graphics.drawable.StateListDrawable stateListDrawable;
        this.e = ziVar;
        setVisibility(ziVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (getContext().getTheme().resolveAttribute(2130772217, typedValue, true)) {
                stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(l, new android.graphics.drawable.ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.a((android.view.View) this, (android.graphics.drawable.Drawable) stateListDrawable);
        }
        boolean isCheckable = ziVar.isCheckable();
        refreshDrawableState();
        if (this.b != isCheckable) {
            this.b = isCheckable;
            defpackage.rn.a((android.view.View) this.c, 2048);
        }
        boolean isChecked = ziVar.isChecked();
        refreshDrawableState();
        this.c.setChecked(isChecked);
        setEnabled(ziVar.isEnabled());
        this.c.setText(ziVar.getTitle());
        a(ziVar.getIcon());
        android.view.View actionView = ziVar.getActionView();
        if (actionView != null) {
            if (this.d == null) {
                this.d = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(2131755286)).inflate();
            }
            this.d.removeAllViews();
            this.d.addView(actionView);
        }
        setContentDescription(ziVar.getContentDescription());
        defpackage.aaz.a((android.view.View) this, ziVar.getTooltipText());
        if (this.e.getTitle() == null && this.e.getIcon() == null && this.e.getActionView() != null) {
            this.c.setVisibility(8);
            if (this.d != null) {
                defpackage.adv adv = (defpackage.adv) this.d.getLayoutParams();
                adv.width = -1;
                this.d.setLayoutParams(adv);
                return;
            }
            return;
        }
        this.c.setVisibility(0);
        if (this.d != null) {
            defpackage.adv adv2 = (defpackage.adv) this.d.getLayoutParams();
            adv2.width = -2;
            this.d.setLayoutParams(adv2);
        }
    }

    public final MenuItemImpl a() {
        return this.e;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.g) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = defpackage.jd.d(drawable).mutate();
                defpackage.jd.a(drawable, this.f);
            }
            drawable.setBounds(0, 0, this.m, this.m);
        } else if (this.a) {
            if (this.n == null) {
                this.n = defpackage.jd.a(getResources(), 2130837639, getContext().getTheme());
                if (this.n != null) {
                    this.n.setBounds(0, 0, this.m, this.m);
                }
            }
            drawable = this.n;
        }
        defpackage.vo.a.a((android.widget.TextView) this.c, drawable);
    }

    public final boolean c_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.e != null && this.e.isCheckable() && this.e.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }
}
