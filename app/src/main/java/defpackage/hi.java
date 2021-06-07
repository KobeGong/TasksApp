package defpackage;

import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: hi  reason: default package */
/* compiled from: PG */
public final class hi implements Drawable.Callback {
    private final /* synthetic */ hh a;

    hi(hh hhVar) {
        this.a = hhVar;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
