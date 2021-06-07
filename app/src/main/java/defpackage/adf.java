package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: adf  reason: default package */
/* compiled from: PG */
public final class adf extends xy {
    public boolean b = true;

    adf(Drawable drawable) {
        super(drawable);
    }

    @Override // defpackage.xy
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.xy
    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.xy
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.xy
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.xy
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
