package defpackage;

/* renamed from: hi reason: default package */
/* compiled from: PG */
final class hi implements android.graphics.drawable.Drawable.Callback {
    private final /* synthetic */ defpackage.hh a;

    hi(defpackage.hh hhVar) {
        this.a = hhVar;
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        this.a.invalidateSelf();
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
