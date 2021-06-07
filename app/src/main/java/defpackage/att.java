package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: att  reason: default package */
/* compiled from: PG */
public final class att extends afc {
    public final List a;
    public final Rect b = new Rect();
    private final int c;
    private final int d;
    private final LruCache e = new LruCache(2);
    private final Paint f = new Paint();
    private final long g;

    att(int i, int i2, long j) {
        this.c = i;
        this.d = i2;
        this.a = new ArrayList();
        this.g = 200 + j;
    }

    @Override // defpackage.afc
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        this.f.setColor(this.c);
        int width = recyclerView.getWidth();
        long a2 = auz.a();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            atu atu = (atu) it.next();
            long j = a2 - atu.b;
            if (j >= this.g) {
                it.remove();
            } else {
                this.f.setAlpha((int) (255.0f * (1.0f - (((float) j) / ((float) this.g)))));
                for (Pair pair : atu.a) {
                    this.b.top = ((Integer) pair.first).intValue();
                    this.b.bottom = ((Integer) pair.second).intValue();
                    this.b.left = 0;
                    this.b.right = width;
                    canvas.drawRect(this.b, this.f);
                }
            }
        }
        int width2 = recyclerView.getWidth();
        this.f.setAlpha(255);
        int childCount = recyclerView.getChildCount();
        ali ali = (ali) crk.a.c();
        Context context = recyclerView.getContext();
        boolean z = sn.a.j(recyclerView) == 0;
        Bitmap bitmap = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getTranslationX() != 0.0f) {
                RecyclerView.a(childAt, this.b);
                int translationX = (int) childAt.getTranslationX();
                if (translationX < 0) {
                    translationX = -translationX;
                    this.b.left = width2 - translationX;
                }
                this.b.right = this.b.left + translationX;
                boolean z2 = z ? childAt.getTranslationX() < 0.0f : childAt.getTranslationX() >= 0.0f;
                this.f.setColor(z2 ? this.d : this.c);
                canvas.drawRect(this.b, this.f);
                if (z2) {
                    if (ali != null) {
                        canvas.save();
                        canvas.clipRect(this.b);
                        Bitmap a3 = a(context, ali.a());
                        canvas.drawBitmap(a3, a(a3, childAt, !z), (float) (this.b.top + (((this.b.bottom - this.b.top) - a3.getHeight()) / 2)), this.f);
                        canvas.restore();
                    }
                } else if (bitmap == null && translationX < width2 && ali != null) {
                    canvas.save();
                    canvas.clipRect(this.b);
                    bitmap = a(context, R.drawable.quantum_ic_thumb_up_white_24);
                    canvas.drawBitmap(bitmap, a(bitmap, childAt, z), (float) (this.b.top + (((this.b.bottom - this.b.top) - bitmap.getHeight()) / 2)), this.f);
                    canvas.restore();
                }
            }
        }
    }

    private final Bitmap a(Context context, int i) {
        Bitmap bitmap = (Bitmap) this.e.get(String.valueOf(i));
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        this.e.put(String.valueOf(i), decodeResource);
        return decodeResource;
    }

    private static float a(Bitmap bitmap, View view, boolean z) {
        float dimension = view.getContext().getResources().getDimension(R.dimen.swipe_icon_margin);
        if (z) {
            return dimension + ((float) view.getLeft());
        }
        return ((float) (view.getRight() - bitmap.getWidth())) - dimension;
    }
}
