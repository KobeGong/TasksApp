package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: ih  reason: default package */
/* compiled from: PG */
final class ih extends Property {
    private Rect a = new Rect();

    ih(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.a);
        return new PointF((float) this.a.left, (float) this.a.top);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.a);
    }
}