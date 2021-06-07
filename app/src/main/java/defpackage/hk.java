package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: hk  reason: default package */
/* compiled from: PG */
final class hk extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public hk(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        hh hhVar = new hh();
        hhVar.b = this.a.newDrawable();
        hhVar.b.setCallback(hhVar.a);
        return hhVar;
    }

    public final Drawable newDrawable(Resources resources) {
        hh hhVar = new hh();
        hhVar.b = this.a.newDrawable(resources);
        hhVar.b.setCallback(hhVar.a);
        return hhVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        hh hhVar = new hh();
        hhVar.b = this.a.newDrawable(resources, theme);
        hhVar.b.setCallback(hhVar.a);
        return hhVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
