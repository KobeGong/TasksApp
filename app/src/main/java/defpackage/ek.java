package defpackage;

@android.annotation.TargetApi(21)
/* renamed from: ek reason: default package */
/* compiled from: PG */
public final class ek extends android.graphics.drawable.RippleDrawable {
    public ek(android.content.res.ColorStateList colorStateList, android.graphics.drawable.InsetDrawable insetDrawable, android.graphics.drawable.Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((android.graphics.drawable.GradientDrawable) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }
}
