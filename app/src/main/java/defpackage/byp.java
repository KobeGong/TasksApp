package defpackage;

/* renamed from: byp reason: default package */
/* compiled from: PG */
public final class byp {
    public android.content.Context a;

    public final android.graphics.Bitmap a(int i, java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            a(canvas, list);
            android.graphics.Paint paint = new android.graphics.Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            int i3 = width / 4;
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth((float) i3);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
            canvas.drawCircle((float) i2, (float) i2, (float) ((i3 / 2) + i2), paint);
            return createBitmap;
        } catch (java.lang.OutOfMemoryError e) {
            defpackage.bty.b("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Exception e2) {
            defpackage.bty.b("ChimeImageProcessorImpl", e2, "Failed to create circular avatar.", new java.lang.Object[0]);
            return null;
        }
    }

    public final android.graphics.Bitmap b(int i, java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131689838);
            a(canvas, list);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth((float) dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            switch (list.size()) {
                case 0:
                    defpackage.bty.e("ChimeImageProcessorImpl", "Got empty list of images to draw seprator on.", new java.lang.Object[0]);
                    break;
                case 1:
                    defpackage.bty.a("ChimeImageProcessorImpl", "Not adding any separators since there is only one image.", new java.lang.Object[0]);
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
        } catch (java.lang.OutOfMemoryError e) {
            defpackage.bty.b("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Exception e2) {
            defpackage.bty.b("ChimeImageProcessorImpl", e2, "Failed to create square avatar.", new java.lang.Object[0]);
            return null;
        }
    }

    private static void a(android.graphics.Canvas canvas, java.util.List list) {
        android.graphics.Paint paint = new android.graphics.Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        switch (list.size()) {
            case 0:
                defpackage.bty.e("ChimeImageProcessorImpl", "Got empty list of avatars to merge.", new java.lang.Object[0]);
                return;
            case 1:
                canvas.drawBitmap((android.graphics.Bitmap) list.get(0), a((android.graphics.Bitmap) list.get(0), 1.0f), new android.graphics.Rect(0, 0, width, width), paint);
                return;
            case 2:
                canvas.drawBitmap((android.graphics.Bitmap) list.get(0), a((android.graphics.Bitmap) list.get(0), 0.5f), new android.graphics.Rect(0, 0, i, width), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(1), a((android.graphics.Bitmap) list.get(1), 0.5f), new android.graphics.Rect(i, 0, width, width), paint);
                return;
            case 3:
                canvas.drawBitmap((android.graphics.Bitmap) list.get(0), a((android.graphics.Bitmap) list.get(0), 0.5f), new android.graphics.Rect(0, 0, i, width), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(1), a((android.graphics.Bitmap) list.get(1), 1.0f), new android.graphics.Rect(i, 0, width, i), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(2), a((android.graphics.Bitmap) list.get(2), 1.0f), new android.graphics.Rect(i, i, width, width), paint);
                return;
            default:
                canvas.drawBitmap((android.graphics.Bitmap) list.get(0), a((android.graphics.Bitmap) list.get(0), 1.0f), new android.graphics.Rect(0, 0, i, i), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(1), a((android.graphics.Bitmap) list.get(1), 1.0f), new android.graphics.Rect(i, 0, width, i), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(2), a((android.graphics.Bitmap) list.get(2), 1.0f), new android.graphics.Rect(0, i, i, width), paint);
                canvas.drawBitmap((android.graphics.Bitmap) list.get(3), a((android.graphics.Bitmap) list.get(3), 1.0f), new android.graphics.Rect(i, i, width, width), paint);
                return;
        }
    }

    private static android.graphics.Rect a(android.graphics.Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = (1.0f * ((float) width)) / ((float) height);
        if (f2 == f) {
            return new android.graphics.Rect(0, 0, width, height);
        }
        if (f2 > f) {
            int i = (int) (((float) height) * f);
            int i2 = (width - i) / 2;
            return new android.graphics.Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (((float) width) * f))) / 2;
        return new android.graphics.Rect(0, i3, width, i3 + width);
    }
}
