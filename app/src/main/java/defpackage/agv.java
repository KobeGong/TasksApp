package defpackage;

/* renamed from: agv reason: default package */
/* compiled from: PG */
final class agv extends defpackage.afy {
    private final java.lang.ref.WeakReference a;

    public agv(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.a = new java.lang.ref.WeakReference(context);
    }

    public final android.graphics.drawable.Drawable getDrawable(int i) {
        android.graphics.drawable.Drawable drawable = super.getDrawable(i);
        android.content.Context context = (android.content.Context) this.a.get();
        if (!(drawable == null || context == null)) {
            defpackage.abl.a();
            defpackage.abl.a(context, i, drawable);
        }
        return drawable;
    }
}
