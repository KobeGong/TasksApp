package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: hj  reason: default package */
/* compiled from: PG */
public final class hj extends Drawable.ConstantState {
    public hp a;
    public AnimatorSet b;
    public ArrayList c;
    public qr d;

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final int getChangingConfigurations() {
        return 0;
    }
}
