package defpackage;

/* renamed from: aah reason: default package */
/* compiled from: PG */
public class aah extends android.graphics.drawable.Drawable {
    public final android.support.v7.widget.ActionBarContainer a;

    public aah(android.support.v7.widget.ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(android.graphics.Canvas canvas) {
        if (!this.a.e) {
            if (this.a.b != null) {
                this.a.b.draw(canvas);
            }
            if (this.a.c != null && this.a.f) {
                this.a.c.draw(canvas);
            }
        } else if (this.a.d != null) {
            this.a.d.draw(canvas);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }
}
