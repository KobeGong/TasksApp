package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.apps.tasks.R;
import java.util.List;

/* renamed from: byp  reason: default package */
/* compiled from: PG */
public final class byp {
    public Context a;

    public final Bitmap a(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            a(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            int i3 = width / 4;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) i3);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            canvas.drawCircle((float) i2, (float) i2, (float) ((i3 / 2) + i2), paint);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            bty.b("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new Object[0]);
            return null;
        } catch (Exception e2) {
            bty.b("ChimeImageProcessorImpl", e2, "Failed to create circular avatar.", new Object[0]);
            return null;
        }
    }

    public final Bitmap b(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            a(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            switch (list.size()) {
                case 0:
                    bty.e("ChimeImageProcessorImpl", "Got empty list of images to draw seprator on.", new Object[0]);
                    break;
                case 1:
                    bty.a("ChimeImageProcessorImpl", "Not adding any separators since there is only one image.", new Object[0]);
                    break;
                case 2:
                    canvas.drawLine((float) i2, 0.0f, (float) i2, (float) width, paint);
                    break;
                case 3:
                    canvas.drawLine((float) i2, 0.0f, (float) i2, (float) width, paint);
                    canvas.drawLine((float) i2, (float) i2, (float) width, (float) i2, paint);
                    break;
                default:
                    canvas.drawLine((float) i2, 0.0f, (float) i2, (float) width, paint);
                    canvas.drawLine(0.0f, (float) i2, (float) width, (float) i2, paint);
                    break;
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            bty.b("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new Object[0]);
            return null;
        } catch (Exception e2) {
            bty.b("ChimeImageProcessorImpl", e2, "Failed to create square avatar.", new Object[0]);
            return null;
        }
    }

    private static void a(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        switch (list.size()) {
            case 0:
                bty.e("ChimeImageProcessorImpl", "Got empty list of avatars to merge.", new Object[0]);
                return;
            case 1:
                canvas.drawBitmap((Bitmap) list.get(0), a((Bitmap) list.get(0), 1.0f), new Rect(0, 0, width, width), paint);
                return;
            case 2:
                canvas.drawBitmap((Bitmap) list.get(0), a((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
                canvas.drawBitmap((Bitmap) list.get(1), a((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
                return;
            case 3:
                canvas.drawBitmap((Bitmap) list.get(0), a((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
                canvas.drawBitmap((Bitmap) list.get(1), a((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
                canvas.drawBitmap((Bitmap) list.get(2), a((Bitmap) list.get(2), 1.0f), new Rect(i, i, width, width), paint);
                return;
            default:
                canvas.drawBitmap((Bitmap) list.get(0), a((Bitmap) list.get(0), 1.0f), new Rect(0, 0, i, i), paint);
                canvas.drawBitmap((Bitmap) list.get(1), a((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
                canvas.drawBitmap((Bitmap) list.get(2), a((Bitmap) list.get(2), 1.0f), new Rect(0, i, i, width), paint);
                canvas.drawBitmap((Bitmap) list.get(3), a((Bitmap) list.get(3), 1.0f), new Rect(i, i, width, width), paint);
                return;
        }
    }

    private static Rect a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = (1.0f * ((float) width)) / ((float) height);
        if (f2 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f2 > f) {
            int i = (int) (((float) height) * f);
            int i2 = (width - i) / 2;
            return new Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (((float) width) * f))) / 2;
        return new Rect(0, i3, width, i3 + width);
    }
}
