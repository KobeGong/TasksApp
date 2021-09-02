package defpackage;

/* renamed from: ge reason: default package */
/* compiled from: PG */
public final class ge {
    public float a;
    public float b;
    private final java.util.List c = new java.util.ArrayList();

    public ge() {
        a();
    }

    public final void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c.clear();
    }

    public final void a(float f) {
        defpackage.gg ggVar = new defpackage.gg();
        ggVar.a = f;
        this.c.add(ggVar);
        this.a = f;
        this.b = 0.0f;
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        defpackage.gf gfVar = new defpackage.gf(f, f2, f3, f4);
        gfVar.a = f5;
        gfVar.b = f6;
        this.c.add(gfVar);
        this.a = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) java.lang.Math.cos(java.lang.Math.toRadians((double) (f5 + f6)))));
        this.b = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) java.lang.Math.sin(java.lang.Math.toRadians((double) (f5 + f6)))));
    }

    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gh) this.c.get(i)).a(matrix, path);
        }
    }
}
