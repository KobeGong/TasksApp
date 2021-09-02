package defpackage;

/* renamed from: abt reason: default package */
/* compiled from: PG */
public class abt extends android.widget.ImageView implements defpackage.sm, defpackage.vu {
    private final defpackage.abg a;
    private final defpackage.abs b;

    public abt(android.content.Context context) {
        this(context, null);
    }

    public abt(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(defpackage.agt.a(context), attributeSet, i);
        this.a = new defpackage.abg(this);
        this.a.a(attributeSet, i);
        this.b = new defpackage.abs(this);
        this.b.a(attributeSet, i);
    }

    public void setImageResource(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.b != null) {
            this.b.d();
        }
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.b != null) {
            this.b.d();
        }
    }

    public void setImageURI(android.net.Uri uri) {
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

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList d_() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode b() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList c() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public final void b(android.graphics.PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode d() {
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
