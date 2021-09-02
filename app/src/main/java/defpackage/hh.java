package defpackage;

/* renamed from: hh reason: default package */
/* compiled from: PG */
public final class hh extends defpackage.ho implements android.graphics.drawable.Animatable {
    public final android.graphics.drawable.Drawable.Callback a;
    private defpackage.hj c;
    private android.content.Context d;
    private android.animation.ArgbEvaluator e;

    hh() {
        this(null, 0);
    }

    public hh(android.content.Context context) {
        this(context, 0);
    }

    private hh(android.content.Context context, byte b) {
        this.e = null;
        this.a = new defpackage.hi(this);
        this.d = context;
        this.c = new defpackage.hj();
    }

    public final android.graphics.drawable.Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.b == null || android.os.Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new defpackage.hk(this.b.getConstantState());
    }

    public final int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public final void draw(android.graphics.Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.c.a.draw(canvas);
        if (this.c.b.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(android.graphics.Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.c.a.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return this.c.a.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.c.a.setLevel(i);
    }

    public final int getAlpha() {
        if (this.b != null) {
            return defpackage.jd.b(this.b);
        }
        return this.c.a.getAlpha();
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.c.a.setAlpha(i);
        }
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.c.a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        if (this.b != null) {
            defpackage.jd.a(this.b, i);
        } else {
            this.c.a.setTint(i);
        }
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.b != null) {
            defpackage.jd.a(this.b, colorStateList);
        } else {
            this.c.a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.b != null) {
            defpackage.jd.a(this.b, mode);
        } else {
            this.c.a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.c.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return this.c.a.isStateful();
    }

    public final int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return this.c.a.getOpacity();
    }

    public final int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return this.c.a.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return this.c.a.getIntrinsicHeight();
    }

    public final boolean isAutoMirrored() {
        if (this.b != null) {
            return defpackage.jd.a(this.b);
        }
        return this.c.a.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            defpackage.jd.a(this.b, z);
        } else {
            this.c.a.setAutoMirrored(z);
        }
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        android.animation.Animator a2;
        if (this.b != null) {
            defpackage.jd.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    android.content.res.TypedArray a3 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.e);
                    int resourceId = a3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        defpackage.hp a4 = defpackage.hp.a(resources, resourceId, theme);
                        a4.d = false;
                        a4.setCallback(this.a);
                        if (this.c.a != null) {
                            this.c.a.setCallback(null);
                        }
                        this.c.a = a4;
                    }
                    a3.recycle();
                } else if ("target".equals(name)) {
                    android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, defpackage.hg.f);
                    java.lang.String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.d != null) {
                            android.content.Context context = this.d;
                            if (android.os.Build.VERSION.SDK_INT >= 24) {
                                a2 = android.animation.AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                a2 = defpackage.gm.a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            a2.setTarget(this.c.a.c.b.j.get(string));
                            if (android.os.Build.VERSION.SDK_INT < 21) {
                                a(a2);
                            }
                            if (this.c.c == null) {
                                this.c.c = new java.util.ArrayList();
                                this.c.d = new defpackage.qr();
                            }
                            this.c.c.add(a2);
                            this.c.d.put(a2, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        defpackage.hj hjVar = this.c;
        if (hjVar.b == null) {
            hjVar.b = new android.animation.AnimatorSet();
        }
        hjVar.b.playTogether(hjVar.c);
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void applyTheme(android.content.res.Resources.Theme theme) {
        if (this.b != null) {
            defpackage.jd.a(this.b, theme);
        }
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            return defpackage.jd.c(this.b);
        }
        return false;
    }

    private final void a(android.animation.Animator animator) {
        if (animator instanceof android.animation.AnimatorSet) {
            java.util.ArrayList childAnimations = ((android.animation.AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= childAnimations.size()) {
                        break;
                    }
                    a((android.animation.Animator) childAnimations.get(i2));
                    i = i2 + 1;
                }
            }
        }
        if (animator instanceof android.animation.ObjectAnimator) {
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            java.lang.String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new android.animation.ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    public final boolean isRunning() {
        if (this.b != null) {
            return ((android.graphics.drawable.AnimatedVectorDrawable) this.b).isRunning();
        }
        return this.c.b.isRunning();
    }

    public final void start() {
        if (this.b != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.b).start();
        } else if (!this.c.b.isStarted()) {
            this.c.b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.b != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.b).stop();
        } else {
            this.c.b.end();
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ android.graphics.ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }
}
