package defpackage;

/* renamed from: ho reason: default package */
/* compiled from: PG */
abstract class ho extends android.graphics.drawable.Drawable implements defpackage.pf {
    public android.graphics.drawable.Drawable b;

    ho() {
    }

    public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public android.graphics.ColorFilter getColorFilter() {
        if (this.b == null) {
            return null;
        }
        android.graphics.drawable.Drawable drawable = this.b;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(android.graphics.Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.b != null) {
            defpackage.jd.a(this.b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b != null) {
            defpackage.jd.a(this.b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.b != null) {
            this.b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.b != null) {
            this.b.jumpToCurrentState();
        }
    }

    public void applyTheme(android.content.res.Resources.Theme theme) {
        if (this.b != null) {
            defpackage.jd.a(this.b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.b != null) {
            this.b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public android.graphics.drawable.Drawable getCurrent() {
        if (this.b != null) {
            return this.b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.b != null) {
            return this.b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.b != null) {
            return this.b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(android.graphics.Rect rect) {
        if (this.b != null) {
            return this.b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.b != null) {
            return this.b.getState();
        }
        return super.getState();
    }

    public android.graphics.Region getTransparentRegion() {
        if (this.b != null) {
            return this.b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.b != null) {
            this.b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
