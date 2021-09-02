package defpackage;

/* renamed from: hw reason: default package */
/* compiled from: PG */
final class hw extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public hw(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final android.graphics.drawable.Drawable newDrawable() {
        defpackage.hp hpVar = new defpackage.hp();
        hpVar.b = (android.graphics.drawable.VectorDrawable) this.a.newDrawable();
        return hpVar;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        defpackage.hp hpVar = new defpackage.hp();
        hpVar.b = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources);
        return hpVar;
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        defpackage.hp hpVar = new defpackage.hp();
        hpVar.b = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources, theme);
        return hpVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
