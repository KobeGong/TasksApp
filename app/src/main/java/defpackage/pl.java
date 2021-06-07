package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: pl  reason: default package */
/* compiled from: PG */
final class pl extends pi {
    pl(pi piVar) {
        super(piVar);
    }

    @Override // defpackage.pi
    public final Drawable newDrawable(Resources resources) {
        return new pk(this, resources);
    }
}
