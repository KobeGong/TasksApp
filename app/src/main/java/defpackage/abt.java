package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: abt  reason: default package */
/* compiled from: PG */
public class abt extends ImageView implements sm, vu {
    private final abg a;
    private final abs b;

    public abt(Context context) {
        this(context, null);
    }

    public abt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abt(Context context, AttributeSet attributeSet, int i) {
        super(agt.a(context), attributeSet, i);
        this.a = new abg(this);
        this.a.a(attributeSet, i);
        this.b = new abs(this);
        this.b.a(attributeSet, i);
    }

    public void setImageResource(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.b != null) {
            this.b.d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.b != null) {
            this.b.d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.b != null) {
            this.b.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // defpackage.sm
    public final void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    @Override // defpackage.sm
    public final ColorStateList d_() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    @Override // defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    @Override // defpackage.sm
    public final PorterDuff.Mode b() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.vu
    public final void b(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Override // defpackage.vu
    public final ColorStateList c() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // defpackage.vu
    public final void b(PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    @Override // defpackage.vu
    public final PorterDuff.Mode d() {
        if (this.b != null) {
            return this.b.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.d();
        }
        if (this.b != null) {
            this.b.d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
}
