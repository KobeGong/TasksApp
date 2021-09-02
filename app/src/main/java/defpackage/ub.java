package defpackage;

/* renamed from: ub reason: default package */
/* compiled from: PG */
final class ub extends android.graphics.drawable.shapes.OvalShape {
    private android.graphics.RadialGradient a;
    private android.graphics.Paint b = new android.graphics.Paint();
    private final /* synthetic */ defpackage.ua c;

    ub(defpackage.ua uaVar, int i) {
        this.c = uaVar;
        uaVar.b = i;
        a((int) rect().width());
    }

    /* access modifiers changed from: protected */
    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        a((int) f);
    }

    public final void draw(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.b);
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - this.c.b), paint);
    }

    private final void a(int i) {
        this.a = new android.graphics.RadialGradient((float) (i / 2), (float) (i / 2), (float) this.c.b, new int[]{1023410176, 0}, null, android.graphics.Shader.TileMode.CLAMP);
        this.b.setShader(this.a);
    }
}
