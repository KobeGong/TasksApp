package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: agv  reason: default package */
/* compiled from: PG */
public final class agv extends afy {
    private final WeakReference a;

    public agv(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference(context);
    }

    @Override // defpackage.afy, android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (!(drawable == null || context == null)) {
            abl.a();
            abl.a(context, i, drawable);
        }
        return drawable;
    }
}
