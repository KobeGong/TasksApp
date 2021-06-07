package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: pj  reason: default package */
/* compiled from: PG */
public final class pj extends pi {
    pj(pi piVar) {
        super(piVar);
    }

    @Override // defpackage.pi
    public final Drawable newDrawable(Resources resources) {
        return new ph(this, resources);
    }
}
