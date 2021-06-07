package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* access modifiers changed from: package-private */
/* renamed from: cfv  reason: default package */
public final /* synthetic */ class cfv implements cdq {
    private final cdq a;

    cfv(cdq cdq) {
        this.a = cdq;
    }

    @Override // defpackage.cdq
    public final void a(Bitmap bitmap) {
        Bitmap createBitmap;
        cdq cdq = this.a;
        if (bitmap == null) {
            createBitmap = null;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int min = Math.min(width, height);
            createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            canvas.drawCircle((float) (min / 2), (float) (min / 2), (float) (min / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (float) ((min - width) / 2), (float) ((min - height) / 2), paint);
        }
        cdq.a(createBitmap);
    }
}
