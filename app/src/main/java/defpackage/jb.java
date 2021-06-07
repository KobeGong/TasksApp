package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: jb  reason: default package */
/* compiled from: PG */
final class jb extends Property {
    private final Property a;
    private final PathMeasure b;
    private final float c;
    private final float[] d = new float[2];
    private final PointF e = new PointF();
    private float f;

    jb(Property property, Path path) {
        super(Float.class, property.getName());
        this.a = property;
        this.b = new PathMeasure(path, false);
        this.c = this.b.getLength();
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f2 = (Float) obj2;
        this.f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.d, null);
        this.e.x = this.d[0];
        this.e.y = this.d[1];
        this.a.set(obj, this.e);
    }
}
