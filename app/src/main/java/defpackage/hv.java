package defpackage;

/* renamed from: hv reason: default package */
/* compiled from: PG */
final class hv extends android.graphics.drawable.Drawable.ConstantState {
    public int a;
    public defpackage.hu b;
    public android.content.res.ColorStateList c;
    public android.graphics.PorterDuff.Mode d;
    public boolean e;
    public android.graphics.Bitmap f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public android.graphics.Paint l;

    public hv(defpackage.hv hvVar) {
        this.c = null;
        this.d = defpackage.hp.a;
        if (hvVar != null) {
            this.a = hvVar.a;
            this.b = new defpackage.hu(hvVar.b);
            if (hvVar.b.c != null) {
                this.b.c = new android.graphics.Paint(hvVar.b.c);
            }
            if (hvVar.b.b != null) {
                this.b.b = new android.graphics.Paint(hvVar.b.b);
            }
            this.c = hvVar.c;
            this.d = hvVar.d;
            this.e = hvVar.e;
        }
    }

    public final void a(int i2, int i3) {
        this.f.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.f);
        defpackage.hu huVar = this.b;
        huVar.a(huVar.d, defpackage.hu.a, canvas, i2, i3, null);
    }

    public hv() {
        this.c = null;
        this.d = defpackage.hp.a;
        this.b = new defpackage.hu();
    }

    public final android.graphics.drawable.Drawable newDrawable() {
        return new defpackage.hp(this);
    }

    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new defpackage.hp(this);
    }

    public final int getChangingConfigurations() {
        return this.a;
    }
}
