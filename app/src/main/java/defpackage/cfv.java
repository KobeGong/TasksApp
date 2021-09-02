package defpackage;

/* renamed from: cfv reason: default package */
final /* synthetic */ class cfv implements defpackage.cdq {
    private final defpackage.cdq a;

    cfv(defpackage.cdq cdq) {
        this.a = cdq;
    }

    public final void a(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap createBitmap;
        defpackage.cdq cdq = this.a;
        if (bitmap == null) {
            createBitmap = null;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int min = java.lang.Math.min(width, height);
            int i = (min - width) / 2;
            int i2 = (min - height) / 2;
            createBitmap = android.graphics.Bitmap.createBitmap(min, min, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setColor(-16777216);
            canvas.drawCircle((float) (min / 2), (float) (min / 2), (float) (min / 2), paint);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (float) i, (float) i2, paint);
        }
        cdq.a(createBitmap);
    }
}
