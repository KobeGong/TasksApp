package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: hv  reason: default package */
/* compiled from: PG */
public final class hv extends Drawable.ConstantState {
    public int a;
    public hu b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public hv(hv hvVar) {
        this.c = null;
        this.d = hp.a;
        if (hvVar != null) {
            this.a = hvVar.a;
            this.b = new hu(hvVar.b);
            if (hvVar.b.c != null) {
                this.b.c = new Paint(hvVar.b.c);
            }
            if (hvVar.b.b != null) {
                this.b.b = new Paint(hvVar.b.b);
            }
            this.c = hvVar.c;
            this.d = hvVar.d;
            this.e = hvVar.e;
        }
    }

    public final void a(int i2, int i3) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        hu huVar = this.b;
        huVar.a(huVar.d, hu.a, canvas, i2, i3, null);
    }

    public hv() {
        this.c = null;
        this.d = hp.a;
        this.b = new hu();
    }

    public final Drawable newDrawable() {
        return new hp(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new hp(this);
    }

    public final int getChangingConfigurations() {
        return this.a;
    }
}
