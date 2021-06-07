package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* access modifiers changed from: package-private */
/* renamed from: hw  reason: default package */
/* compiled from: PG */
public final class hw extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public hw(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        hp hpVar = new hp();
        hpVar.b = (VectorDrawable) this.a.newDrawable();
        return hpVar;
    }

    public final Drawable newDrawable(Resources resources) {
        hp hpVar = new hp();
        hpVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return hpVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        hp hpVar = new hp();
        hpVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return hpVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
