package defpackage;

/* renamed from: ih reason: default package */
/* compiled from: PG */
final class ih extends android.util.Property {
    private android.graphics.Rect a = new android.graphics.Rect();

    ih(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
    }

    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        ((android.graphics.drawable.Drawable) obj).copyBounds(this.a);
        return new android.graphics.PointF((float) this.a.left, (float) this.a.top);
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        drawable.copyBounds(this.a);
        this.a.offsetTo(java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
        drawable.setBounds(this.a);
    }
}
