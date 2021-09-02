package defpackage;

/* renamed from: jb reason: default package */
/* compiled from: PG */
final class jb extends android.util.Property {
    private final android.util.Property a;
    private final android.graphics.PathMeasure b;
    private final float c;
    private final float[] d = new float[2];
    private final android.graphics.PointF e = new android.graphics.PointF();
    private float f;

    jb(android.util.Property property, android.graphics.Path path) {
        super(java.lang.Float.class, property.getName());
        this.a = property;
        this.b = new android.graphics.PathMeasure(path, false);
        this.c = this.b.getLength();
    }

    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(this.f);
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Float f2 = (java.lang.Float) obj2;
        this.f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.d, null);
        this.e.x = this.d[0];
        this.e.y = this.d[1];
        this.a.set(obj, this.e);
    }
}
