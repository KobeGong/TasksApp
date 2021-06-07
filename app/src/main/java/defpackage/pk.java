package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: pk  reason: default package */
/* compiled from: PG */
public class pk extends ph {
    public pk(Drawable drawable) {
        super(drawable);
    }

    pk(pi piVar, Resources resources) {
        super(piVar, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ph
    public pi b() {
        return new pl(this.b);
    }
}
