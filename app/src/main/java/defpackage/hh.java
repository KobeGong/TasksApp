package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: hh  reason: default package */
/* compiled from: PG */
public final class hh extends ho implements Animatable {
    public final Drawable.Callback a;
    private hj c;
    private Context d;
    private ArgbEvaluator e;

    hh() {
        this(null, (byte) 0);
    }

    public hh(Context context) {
        this(context, (byte) 0);
    }

    private hh(Context context, byte b) {
        this.e = null;
        this.a = new hi(this);
        this.d = context;
        this.c = new hj();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new hk(this.b.getConstantState());
    }

    public final int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public final void draw(Canvas canvas) {
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
    @Override // defpackage.ho
    public final void onBoundsChange(Rect rect) {
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
    @Override // defpackage.ho
    public final boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.c.a.setLevel(i);
    }

    public final int getAlpha() {
        if (this.b != null) {
            return jd.b(this.b);
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

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.c.a.setColorFilter(colorFilter);
        }
    }

    @Override // defpackage.pf
    public final void setTint(int i) {
        if (this.b != null) {
            jd.a(this.b, i);
        } else {
            this.c.a.setTint(i);
        }
    }

    @Override // defpackage.pf
    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            jd.a(this.b, colorStateList);
        } else {
            this.c.a.setTintList(colorStateList);
        }
    }

    @Override // defpackage.pf
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            jd.a(this.b, mode);
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
            return jd.a(this.b);
        }
        return this.c.a.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            jd.a(this.b, z);
        } else {
            this.c.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator a2;
        if (this.b != null) {
            jd.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a3 = jd.a(resources, theme, attributeSet, hg.e);
                    int resourceId = a3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        hp a4 = hp.a(resources, resourceId, theme);
                        a4.d = false;
                        a4.setCallback(this.a);
                        if (this.c.a != null) {
                            this.c.a.setCallback(null);
                        }
                        this.c.a = a4;
                    }
                    a3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, hg.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.d != null) {
                            Context context = this.d;
                            if (Build.VERSION.SDK_INT >= 24) {
                                a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                a2 = gm.a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            a2.setTarget(this.c.a.c.b.j.get(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                a(a2);
                            }
                            if (this.c.c == null) {
                                this.c.c = new ArrayList();
                                this.c.d = new qr();
                            }
                            this.c.c.add(a2);
                            this.c.d.put(a2, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        hj hjVar = this.c;
        if (hjVar.b == null) {
            hjVar.b = new AnimatorSet();
        }
        hjVar.b.playTogether(hjVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // defpackage.ho
    public final void applyTheme(Resources.Theme theme) {
        if (this.b != null) {
            jd.a(this.b, theme);
        }
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            return jd.c(this.b);
        }
        return false;
    }

    private final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    public final boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        return this.c.b.isRunning();
    }

    public final void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.c.b.isStarted()) {
            this.c.b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.c.b.end();
        }
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }
}
