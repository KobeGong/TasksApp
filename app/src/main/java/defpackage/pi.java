package defpackage;

/* renamed from: pi reason: default package */
/* compiled from: PG */
public abstract class pi extends android.graphics.drawable.Drawable.ConstantState {
    public int a;
    public android.graphics.drawable.Drawable.ConstantState b;
    public android.content.res.ColorStateList c = null;
    public android.graphics.PorterDuff.Mode d = defpackage.ph.a;

    pi(defpackage.pi piVar) {
        if (piVar != null) {
            this.a = piVar.a;
            this.b = piVar.b;
            this.c = piVar.c;
            this.d = piVar.d;
        }
    }

    public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources);

    public android.graphics.drawable.Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.b != null ? this.b.getChangingConfigurations() : 0) | this.a;
    }
}
