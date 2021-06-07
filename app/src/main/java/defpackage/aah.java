package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* renamed from: aah  reason: default package */
/* compiled from: PG */
public class aah extends Drawable {
    public final ActionBarContainer a;

    public aah(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
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

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }
}
