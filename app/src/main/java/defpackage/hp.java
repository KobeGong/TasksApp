package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: hp  reason: default package */
/* compiled from: PG */
public final class hp extends ho {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public hv c;
    public boolean d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    hp() {
        this.d = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new hv();
    }

    hp(hv hvVar) {
        this.d = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = hvVar;
        this.e = a(hvVar.c, hvVar.d);
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.c = new hv(this.c);
            this.g = true;
        }
        return this;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new hw(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r1 == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        if (this.b != null) {
            return jd.b(this.b);
        }
        return this.c.b.getRootAlpha();
    }

    public final void setAlpha(int i2) {
        if (this.b != null) {
            this.b.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // defpackage.pf
    public final void setTint(int i2) {
        if (this.b != null) {
            jd.a(this.b, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // defpackage.pf
    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            jd.a(this.b, colorStateList);
            return;
        }
        hv hvVar = this.c;
        if (hvVar.c != colorStateList) {
            hvVar.c = colorStateList;
            this.e = a(colorStateList, hvVar.d);
            invalidateSelf();
        }
    }

    @Override // defpackage.pf
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            jd.a(this.b, mode);
            return;
        }
        hv hvVar = this.c;
        if (hvVar.d != mode) {
            hvVar.d = mode;
            this.e = a(hvVar.c, mode);
            invalidateSelf();
        }
    }

    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return super.isStateful() || !(this.c == null || this.c.c == null || !this.c.c.isStateful());
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        hv hvVar = this.c;
        if (hvVar.c == null || hvVar.d == null) {
            return false;
        }
        this.e = a(hvVar.c, hvVar.d);
        invalidateSelf();
        return true;
    }

    public final int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    public final int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.c.b.e;
    }

    public final int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.c.b.f;
    }

    public final boolean canApplyTheme() {
        if (this.b == null) {
            return false;
        }
        jd.c(this.b);
        return false;
    }

    public final boolean isAutoMirrored() {
        if (this.b != null) {
            return jd.a(this.b);
        }
        return this.c.e;
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            jd.a(this.b, z);
        } else {
            this.c.e = z;
        }
    }

    public static hp a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            hp hpVar = new hp();
            hpVar.b = jd.a(resources, i2, theme);
            new hw(hpVar.b.getConstantState());
            return hpVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (IOException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static hp a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        hp hpVar = new hp();
        hpVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hpVar;
    }

    static int a(int i2, float f2) {
        return (((int) (((float) Color.alpha(i2)) * f2)) << 24) | (16777215 & i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        if (this.b != null) {
            jd.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        hv hvVar = this.c;
        hvVar.b = new hu();
        TypedArray a2 = jd.a(resources, theme, attributeSet, hg.a);
        hv hvVar2 = this.c;
        hu huVar = hvVar2.b;
        int a3 = jd.a(a2, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        switch (a3) {
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.ADD;
                break;
        }
        hvVar2.d = mode;
        ColorStateList colorStateList = a2.getColorStateList(1);
        if (colorStateList != null) {
            hvVar2.c = colorStateList;
        }
        boolean z2 = hvVar2.e;
        if (jd.a(xmlPullParser, "autoMirrored")) {
            z2 = a2.getBoolean(5, z2);
        }
        hvVar2.e = z2;
        huVar.g = jd.a(a2, xmlPullParser, "viewportWidth", 7, huVar.g);
        huVar.h = jd.a(a2, xmlPullParser, "viewportHeight", 8, huVar.h);
        if (huVar.g <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (huVar.h <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            huVar.e = a2.getDimension(3, huVar.e);
            huVar.f = a2.getDimension(2, huVar.f);
            if (huVar.e <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (huVar.f <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                huVar.setAlpha(jd.a(a2, xmlPullParser, "alpha", 4, huVar.getAlpha()));
                String string = a2.getString(0);
                if (string != null) {
                    huVar.i = string;
                    huVar.j.put(string, huVar);
                }
                a2.recycle();
                hvVar.a = getChangingConfigurations();
                hvVar.k = true;
                hv hvVar3 = this.c;
                hu huVar2 = hvVar3.b;
                boolean z3 = true;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(huVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        hs hsVar = (hs) arrayDeque.peek();
                        if ("path".equals(name)) {
                            hr hrVar = new hr();
                            TypedArray a4 = jd.a(resources, theme, attributeSet, hg.c);
                            hrVar.a = null;
                            if (jd.a(xmlPullParser, "pathData")) {
                                String string2 = a4.getString(0);
                                if (string2 != null) {
                                    hrVar.o = string2;
                                }
                                String string3 = a4.getString(2);
                                if (string3 != null) {
                                    hrVar.n = jd.b(string3);
                                }
                                hrVar.d = jd.b(a4, xmlPullParser, "fillColor", 1, hrVar.d);
                                hrVar.g = jd.a(a4, xmlPullParser, "fillAlpha", 12, hrVar.g);
                                int a5 = jd.a(a4, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = hrVar.k;
                                switch (a5) {
                                    case 0:
                                        cap = Paint.Cap.BUTT;
                                        break;
                                    case 1:
                                        cap = Paint.Cap.ROUND;
                                        break;
                                    case 2:
                                        cap = Paint.Cap.SQUARE;
                                        break;
                                }
                                hrVar.k = cap;
                                int a6 = jd.a(a4, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = hrVar.l;
                                switch (a6) {
                                    case 0:
                                        join = Paint.Join.MITER;
                                        break;
                                    case 1:
                                        join = Paint.Join.ROUND;
                                        break;
                                    case 2:
                                        join = Paint.Join.BEVEL;
                                        break;
                                }
                                hrVar.l = join;
                                hrVar.m = jd.a(a4, xmlPullParser, "strokeMiterLimit", 10, hrVar.m);
                                hrVar.b = jd.b(a4, xmlPullParser, "strokeColor", 3, hrVar.b);
                                hrVar.e = jd.a(a4, xmlPullParser, "strokeAlpha", 11, hrVar.e);
                                hrVar.c = jd.a(a4, xmlPullParser, "strokeWidth", 4, hrVar.c);
                                hrVar.i = jd.a(a4, xmlPullParser, "trimPathEnd", 6, hrVar.i);
                                hrVar.j = jd.a(a4, xmlPullParser, "trimPathOffset", 7, hrVar.j);
                                hrVar.h = jd.a(a4, xmlPullParser, "trimPathStart", 5, hrVar.h);
                                hrVar.f = jd.a(a4, xmlPullParser, "fillType", 13, hrVar.f);
                            }
                            a4.recycle();
                            hsVar.b.add(hrVar);
                            if (hrVar.getPathName() != null) {
                                huVar2.j.put(hrVar.getPathName(), hrVar);
                            }
                            z = false;
                            hvVar3.a |= hrVar.p;
                        } else if ("clip-path".equals(name)) {
                            hq hqVar = new hq();
                            if (jd.a(xmlPullParser, "pathData")) {
                                TypedArray a7 = jd.a(resources, theme, attributeSet, hg.d);
                                String string4 = a7.getString(0);
                                if (string4 != null) {
                                    hqVar.o = string4;
                                }
                                String string5 = a7.getString(1);
                                if (string5 != null) {
                                    hqVar.n = jd.b(string5);
                                }
                                a7.recycle();
                            }
                            hsVar.b.add(hqVar);
                            if (hqVar.getPathName() != null) {
                                huVar2.j.put(hqVar.getPathName(), hqVar);
                            }
                            hvVar3.a |= hqVar.p;
                            z = z3;
                        } else {
                            if ("group".equals(name)) {
                                hs hsVar2 = new hs();
                                TypedArray a8 = jd.a(resources, theme, attributeSet, hg.b);
                                hsVar2.l = null;
                                hsVar2.c = jd.a(a8, xmlPullParser, "rotation", 5, hsVar2.c);
                                hsVar2.d = a8.getFloat(1, hsVar2.d);
                                hsVar2.e = a8.getFloat(2, hsVar2.e);
                                hsVar2.f = jd.a(a8, xmlPullParser, "scaleX", 3, hsVar2.f);
                                hsVar2.g = jd.a(a8, xmlPullParser, "scaleY", 4, hsVar2.g);
                                hsVar2.h = jd.a(a8, xmlPullParser, "translateX", 6, hsVar2.h);
                                hsVar2.i = jd.a(a8, xmlPullParser, "translateY", 7, hsVar2.i);
                                String string6 = a8.getString(0);
                                if (string6 != null) {
                                    hsVar2.m = string6;
                                }
                                hsVar2.a();
                                a8.recycle();
                                hsVar.b.add(hsVar2);
                                arrayDeque.push(hsVar2);
                                if (hsVar2.getGroupName() != null) {
                                    huVar2.j.put(hsVar2.getGroupName(), hsVar2);
                                }
                                hvVar3.a |= hsVar2.k;
                            }
                            z = z3;
                        }
                    } else {
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                        z = z3;
                    }
                    z3 = z;
                    eventType = xmlPullParser.next();
                }
                if (z3) {
                    throw new XmlPullParserException("no path defined");
                }
                this.e = a(hvVar.c, hvVar.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ho
    public final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public final int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
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
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
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
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // defpackage.ho
    public final /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }
}
