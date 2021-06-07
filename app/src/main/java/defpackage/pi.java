package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: pi  reason: default package */
/* compiled from: PG */
public abstract class pi extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c = null;
    public PorterDuff.Mode d = ph.a;

    pi(pi piVar) {
        if (piVar != null) {
            this.a = piVar.a;
            this.b = piVar.b;
            this.c = piVar.c;
            this.d = piVar.d;
        }
    }

    public abstract Drawable newDrawable(Resources resources);

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.b != null ? this.b.getChangingConfigurations() : 0) | this.a;
    }
}
