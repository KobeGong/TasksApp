package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class NavigationMenuItemView extends ey implements zw {
    private static final int[] l = {16842912};
    public boolean a;
    public boolean b;
    public final CheckedTextView c;
    public FrameLayout d;
    public zi e;
    public ColorStateList f;
    public boolean g;
    private final int m;
    private Drawable n;
    private final rn o;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new fa(this);
        c(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.c = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.c.setDuplicateParentStateEnabled(true);
        sn.a(this.c, this.o);
    }

    @Override // defpackage.zw
    public final void a(zi ziVar) {
        StateListDrawable stateListDrawable;
        this.e = ziVar;
        setVisibility(ziVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(l, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            sn.a(this, stateListDrawable);
        }
        boolean isCheckable = ziVar.isCheckable();
        refreshDrawableState();
        if (this.b != isCheckable) {
            this.b = isCheckable;
            rn.a(this.c, 2048);
        }
        boolean isChecked = ziVar.isChecked();
        refreshDrawableState();
        this.c.setChecked(isChecked);
        setEnabled(ziVar.isEnabled());
        this.c.setText(ziVar.getTitle());
        a(ziVar.getIcon());
        View actionView = ziVar.getActionView();
        if (actionView != null) {
            if (this.d == null) {
                this.d = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.d.removeAllViews();
            this.d.addView(actionView);
        }
        setContentDescription(ziVar.getContentDescription());
        aaz.a(this, ziVar.getTooltipText());
        if (this.e.getTitle() == null && this.e.getIcon() == null && this.e.getActionView() != null) {
            this.c.setVisibility(8);
            if (this.d != null) {
                adv adv = (adv) this.d.getLayoutParams();
                adv.width = -1;
                this.d.setLayoutParams(adv);
                return;
            }
            return;
        }
        this.c.setVisibility(0);
        if (this.d != null) {
            adv adv2 = (adv) this.d.getLayoutParams();
            adv2.width = -2;
            this.d.setLayoutParams(adv2);
        }
    }

    @Override // defpackage.zw
    public final zi a() {
        return this.e;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            if (this.g) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = jd.d(drawable).mutate();
                jd.a(drawable, this.f);
            }
            drawable.setBounds(0, 0, this.m, this.m);
        } else if (this.a) {
            if (this.n == null) {
                this.n = jd.a(getResources(), (int) R.drawable.navigation_empty_icon, getContext().getTheme());
                if (this.n != null) {
                    this.n.setBounds(0, 0, this.m, this.m);
                }
            }
            drawable = this.n;
        }
        vo.a.a(this.c, drawable);
    }

    @Override // defpackage.zw
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
