package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: pn  reason: default package */
/* compiled from: PG */
final class pn extends pi {
    pn(pi piVar) {
        super(piVar);
    }

    @Override // defpackage.pi
    public final Drawable newDrawable(Resources resources) {
        return new pm(this, resources);
    }
}
