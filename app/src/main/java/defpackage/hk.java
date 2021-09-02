package defpackage;

/* renamed from: hk reason: default package */
/* compiled from: PG */
final class hk extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public hk(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final android.graphics.drawable.Drawable newDrawable() {
        defpackage.hh hhVar = new defpackage.hh();
        hhVar.b = this.a.newDrawable();
        hhVar.b.setCallback(hhVar.a);
        return hhVar;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        defpackage.hh hhVar = new defpackage.hh();
        hhVar.b = this.a.newDrawable(resources);
        hhVar.b.setCallback(hhVar.a);
        return hhVar;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        defpackage.hh hhVar = new defpackage.hh();
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
