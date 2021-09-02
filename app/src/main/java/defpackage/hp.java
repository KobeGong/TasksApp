package defpackage;

/* renamed from: hp reason: default package */
/* compiled from: PG */
public final class hp extends defpackage.ho {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public defpackage.hv c;
    public boolean d;
    private android.graphics.PorterDuffColorFilter e;
    private android.graphics.ColorFilter f;
    private boolean g;
    private final float[] h;
    private final android.graphics.Matrix i;
    private final android.graphics.Rect j;

    hp() {
        this.d = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.c = new defpackage.hv();
    }

    hp(defpackage.hv hvVar) {
        this.d = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.c = hvVar;
        this.e = a(hvVar.c, hvVar.d);
    }

    public final android.graphics.drawable.Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.c = new defpackage.hv(this.c);
            this.g = true;
        }
        return this;
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.b != null && android.os.Build.VERSION.SDK_INT >= 24) {
            return new defpackage.hw(this.b.getConstantState());
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
            r11 = this;
            r10 = 2048(0x800, float:2.87E-42)
            r2 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4 = 1
            r5 = 0
            android.graphics.drawable.Drawable r0 = r11.b
            if (r0 == 0) goto L_0x0011
            android.graphics.drawable.Drawable r0 = r11.b
            r0.draw(r12)
        L_0x0010:
            return
        L_0x0011:
            android.graphics.Rect r0 = r11.j
            r11.copyBounds(r0)
            android.graphics.Rect r0 = r11.j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0010
            android.graphics.Rect r0 = r11.j
            int r0 = r0.height()
            if (r0 <= 0) goto L_0x0010
            android.graphics.ColorFilter r0 = r11.f
            if (r0 != 0) goto L_0x0107
            android.graphics.PorterDuffColorFilter r0 = r11.e
        L_0x002c:
            android.graphics.Matrix r1 = r11.i
            r12.getMatrix(r1)
            android.graphics.Matrix r1 = r11.i
            float[] r3 = r11.h
            r1.getValues(r3)
            float[] r1 = r11.h
            r1 = r1[r5]
            float r3 = java.lang.Math.abs(r1)
            float[] r1 = r11.h
            r6 = 4
            r1 = r1[r6]
            float r1 = java.lang.Math.abs(r1)
            float[] r6 = r11.h
            r6 = r6[r4]
            float r6 = java.lang.Math.abs(r6)
            float[] r7 = r11.h
            r8 = 3
            r7 = r7[r8]
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
        L_0x0062:
            r1 = r2
            r3 = r2
        L_0x0064:
            android.graphics.Rect r6 = r11.j
            int r6 = r6.width()
            float r6 = (float) r6
            float r3 = r3 * r6
            int r3 = (int) r3
            android.graphics.Rect r6 = r11.j
            int r6 = r6.height()
            float r6 = (float) r6
            float r1 = r1 * r6
            int r1 = (int) r1
            int r3 = java.lang.Math.min(r10, r3)
            int r6 = java.lang.Math.min(r10, r1)
            if (r3 <= 0) goto L_0x0010
            if (r6 <= 0) goto L_0x0010
            int r7 = r12.save()
            android.graphics.Rect r1 = r11.j
            int r1 = r1.left
            float r1 = (float) r1
            android.graphics.Rect r8 = r11.j
            int r8 = r8.top
            float r8 = (float) r8
            r12.translate(r1, r8)
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 17
            if (r1 < r8) goto L_0x010d
            boolean r1 = r11.isAutoMirrored()
            if (r1 == 0) goto L_0x010b
            int r1 = defpackage.jd.e(r11)
            if (r1 != r4) goto L_0x010b
            r1 = r4
        L_0x00a6:
            if (r1 == 0) goto L_0x00b7
            android.graphics.Rect r1 = r11.j
            int r1 = r1.width()
            float r1 = (float) r1
            r12.translate(r1, r9)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.scale(r1, r2)
        L_0x00b7:
            android.graphics.Rect r1 = r11.j
            r1.offsetTo(r5, r5)
            hv r2 = r11.c
            android.graphics.Bitmap r1 = r2.f
            if (r1 == 0) goto L_0x00d5
            android.graphics.Bitmap r1 = r2.f
            int r1 = r1.getWidth()
            if (r3 != r1) goto L_0x010f
            android.graphics.Bitmap r1 = r2.f
            int r1 = r1.getHeight()
            if (r6 != r1) goto L_0x010f
            r1 = r4
        L_0x00d3:
            if (r1 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r3, r6, r1)
            r2.f = r1
            r2.k = r4
        L_0x00df:
            boolean r1 = r11.d
            if (r1 != 0) goto L_0x0111
            hv r1 = r11.c
            r1.a(r3, r6)
        L_0x00e8:
            hv r2 = r11.c
            android.graphics.Rect r3 = r11.j
            hu r1 = r2.b
            int r1 = r1.getRootAlpha()
            r6 = 255(0xff, float:3.57E-43)
            if (r1 >= r6) goto L_0x0156
            r1 = r4
        L_0x00f7:
            if (r1 != 0) goto L_0x0158
            if (r0 != 0) goto L_0x0158
            r0 = 0
        L_0x00fc:
            android.graphics.Bitmap r1 = r2.f
            r2 = 0
            r12.drawBitmap(r1, r2, r3, r0)
            r12.restoreToCount(r7)
            goto L_0x0010
        L_0x0107:
            android.graphics.ColorFilter r0 = r11.f
            goto L_0x002c
        L_0x010b:
            r1 = r5
            goto L_0x00a6
        L_0x010d:
            r1 = r5
            goto L_0x00a6
        L_0x010f:
            r1 = r5
            goto L_0x00d3
        L_0x0111:
            hv r1 = r11.c
            boolean r2 = r1.k
            if (r2 != 0) goto L_0x0154
            android.content.res.ColorStateList r2 = r1.g
            android.content.res.ColorStateList r8 = r1.c
            if (r2 != r8) goto L_0x0154
            android.graphics.PorterDuff$Mode r2 = r1.h
            android.graphics.PorterDuff$Mode r8 = r1.d
            if (r2 != r8) goto L_0x0154
            boolean r2 = r1.j
            boolean r8 = r1.e
            if (r2 != r8) goto L_0x0154
            int r2 = r1.i
            hu r1 = r1.b
            int r1 = r1.getRootAlpha()
            if (r2 != r1) goto L_0x0154
            r1 = r4
        L_0x0134:
            if (r1 != 0) goto L_0x00e8
            hv r1 = r11.c
            r1.a(r3, r6)
            hv r1 = r11.c
            android.content.res.ColorStateList r2 = r1.c
            r1.g = r2
            android.graphics.PorterDuff$Mode r2 = r1.d
            r1.h = r2
            hu r2 = r1.b
            int r2 = r2.getRootAlpha()
            r1.i = r2
            boolean r2 = r1.e
            r1.j = r2
            r1.k = r5
            goto L_0x00e8
        L_0x0154:
            r1 = r5
            goto L_0x0134
        L_0x0156:
            r1 = r5
            goto L_0x00f7
        L_0x0158:
            android.graphics.Paint r1 = r2.l
            if (r1 != 0) goto L_0x0168
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r2.l = r1
            android.graphics.Paint r1 = r2.l
            r1.setFilterBitmap(r4)
        L_0x0168:
            android.graphics.Paint r1 = r2.l
            hu r4 = r2.b
            int r4 = r4.getRootAlpha()
            r1.setAlpha(r4)
            android.graphics.Paint r1 = r2.l
            r1.setColorFilter(r0)
            android.graphics.Paint r0 = r2.l
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        if (this.b != null) {
            return defpackage.jd.b(this.b);
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

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    private final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void setTint(int i2) {
        if (this.b != null) {
            defpackage.jd.a(this.b, i2);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i2));
        }
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.b != null) {
            defpackage.jd.a(this.b, colorStateList);
            return;
        }
        defpackage.hv hvVar = this.c;
        if (hvVar.c != colorStateList) {
            hvVar.c = colorStateList;
            this.e = a(colorStateList, hvVar.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.b != null) {
            defpackage.jd.a(this.b, mode);
            return;
        }
        defpackage.hv hvVar = this.c;
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
        defpackage.hv hvVar = this.c;
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
        if (this.b != null) {
            defpackage.jd.c(this.b);
        }
        return false;
    }

    public final boolean isAutoMirrored() {
        if (this.b != null) {
            return defpackage.jd.a(this.b);
        }
        return this.c.e;
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            defpackage.jd.a(this.b, z);
        } else {
            this.c.e = z;
        }
    }

    public static defpackage.hp a(android.content.res.Resources resources, int i2, android.content.res.Resources.Theme theme) {
        int next;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            defpackage.hp hpVar = new defpackage.hp();
            hpVar.b = defpackage.jd.a(resources, i2, theme);
            new defpackage.hw(hpVar.b.getConstantState());
            return hpVar;
        }
        try {
            android.content.res.XmlResourceParser xml = resources.getXml(i2);
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return a(resources, xml, asAttributeSet, theme);
            }
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("VectorDrawableCompat", "parser error", e2);
        } catch (java.io.IOException e3) {
            android.util.Log.e("VectorDrawableCompat", "parser error", e3);
        }
        return null;
    }

    public static defpackage.hp a(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        defpackage.hp hpVar = new defpackage.hp();
        hpVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hpVar;
    }

    static int a(int i2, float f2) {
        return (((int) (((float) android.graphics.Color.alpha(i2)) * f2)) << 24) | (16777215 & i2);
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        boolean z;
        if (this.b != null) {
            defpackage.jd.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        defpackage.hv hvVar = this.c;
        hvVar.b = new defpackage.hu();
        android.content.res.TypedArray a2 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.a);
        defpackage.hv hvVar2 = this.c;
        defpackage.hu huVar = hvVar2.b;
        int a3 = defpackage.jd.a(a2, xmlPullParser, "tintMode", 6, -1);
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
        switch (a3) {
            case 3:
                mode = android.graphics.PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = android.graphics.PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = android.graphics.PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = android.graphics.PorterDuff.Mode.ADD;
                break;
        }
        hvVar2.d = mode;
        android.content.res.ColorStateList colorStateList = a2.getColorStateList(1);
        if (colorStateList != null) {
            hvVar2.c = colorStateList;
        }
        boolean z2 = hvVar2.e;
        if (defpackage.jd.a(xmlPullParser, "autoMirrored")) {
            z2 = a2.getBoolean(5, z2);
        }
        hvVar2.e = z2;
        huVar.g = defpackage.jd.a(a2, xmlPullParser, "viewportWidth", 7, huVar.g);
        huVar.h = defpackage.jd.a(a2, xmlPullParser, "viewportHeight", 8, huVar.h);
        if (huVar.g <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (huVar.h <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            huVar.e = a2.getDimension(3, huVar.e);
            huVar.f = a2.getDimension(2, huVar.f);
            if (huVar.e <= 0.0f) {
                throw new org.xmlpull.v1.XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (huVar.f <= 0.0f) {
                throw new org.xmlpull.v1.XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                huVar.setAlpha(defpackage.jd.a(a2, xmlPullParser, "alpha", 4, huVar.getAlpha()));
                java.lang.String string = a2.getString(0);
                if (string != null) {
                    huVar.i = string;
                    huVar.j.put(string, huVar);
                }
                a2.recycle();
                hvVar.a = getChangingConfigurations();
                hvVar.k = true;
                defpackage.hv hvVar3 = this.c;
                defpackage.hu huVar2 = hvVar3.b;
                boolean z3 = true;
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                arrayDeque.push(huVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        java.lang.String name = xmlPullParser.getName();
                        defpackage.hs hsVar = (defpackage.hs) arrayDeque.peek();
                        if ("path".equals(name)) {
                            defpackage.hr hrVar = new defpackage.hr();
                            android.content.res.TypedArray a4 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.c);
                            hrVar.a = null;
                            if (defpackage.jd.a(xmlPullParser, "pathData")) {
                                java.lang.String string2 = a4.getString(0);
                                if (string2 != null) {
                                    hrVar.o = string2;
                                }
                                java.lang.String string3 = a4.getString(2);
                                if (string3 != null) {
                                    hrVar.n = defpackage.jd.b(string3);
                                }
                                hrVar.d = defpackage.jd.b(a4, xmlPullParser, "fillColor", 1, hrVar.d);
                                hrVar.g = defpackage.jd.a(a4, xmlPullParser, "fillAlpha", 12, hrVar.g);
                                int a5 = defpackage.jd.a(a4, xmlPullParser, "strokeLineCap", 8, -1);
                                android.graphics.Paint.Cap cap = hrVar.k;
                                switch (a5) {
                                    case 0:
                                        cap = android.graphics.Paint.Cap.BUTT;
                                        break;
                                    case 1:
                                        cap = android.graphics.Paint.Cap.ROUND;
                                        break;
                                    case 2:
                                        cap = android.graphics.Paint.Cap.SQUARE;
                                        break;
                                }
                                hrVar.k = cap;
                                int a6 = defpackage.jd.a(a4, xmlPullParser, "strokeLineJoin", 9, -1);
                                android.graphics.Paint.Join join = hrVar.l;
                                switch (a6) {
                                    case 0:
                                        join = android.graphics.Paint.Join.MITER;
                                        break;
                                    case 1:
                                        join = android.graphics.Paint.Join.ROUND;
                                        break;
                                    case 2:
                                        join = android.graphics.Paint.Join.BEVEL;
                                        break;
                                }
                                hrVar.l = join;
                                hrVar.m = defpackage.jd.a(a4, xmlPullParser, "strokeMiterLimit", 10, hrVar.m);
                                hrVar.b = defpackage.jd.b(a4, xmlPullParser, "strokeColor", 3, hrVar.b);
                                hrVar.e = defpackage.jd.a(a4, xmlPullParser, "strokeAlpha", 11, hrVar.e);
                                hrVar.c = defpackage.jd.a(a4, xmlPullParser, "strokeWidth", 4, hrVar.c);
                                hrVar.i = defpackage.jd.a(a4, xmlPullParser, "trimPathEnd", 6, hrVar.i);
                                hrVar.j = defpackage.jd.a(a4, xmlPullParser, "trimPathOffset", 7, hrVar.j);
                                hrVar.h = defpackage.jd.a(a4, xmlPullParser, "trimPathStart", 5, hrVar.h);
                                hrVar.f = defpackage.jd.a(a4, xmlPullParser, "fillType", 13, hrVar.f);
                            }
                            a4.recycle();
                            hsVar.b.add(hrVar);
                            if (hrVar.getPathName() != null) {
                                huVar2.j.put(hrVar.getPathName(), hrVar);
                            }
                            z = false;
                            hvVar3.a |= hrVar.p;
                        } else if ("clip-path".equals(name)) {
                            defpackage.hq hqVar = new defpackage.hq();
                            if (defpackage.jd.a(xmlPullParser, "pathData")) {
                                android.content.res.TypedArray a7 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.d);
                                java.lang.String string4 = a7.getString(0);
                                if (string4 != null) {
                                    hqVar.o = string4;
                                }
                                java.lang.String string5 = a7.getString(1);
                                if (string5 != null) {
                                    hqVar.n = defpackage.jd.b(string5);
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
                                defpackage.hs hsVar2 = new defpackage.hs();
                                android.content.res.TypedArray a8 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.b);
                                hsVar2.l = null;
                                hsVar2.c = defpackage.jd.a(a8, xmlPullParser, "rotation", 5, hsVar2.c);
                                hsVar2.d = a8.getFloat(1, hsVar2.d);
                                hsVar2.e = a8.getFloat(2, hsVar2.e);
                                hsVar2.f = defpackage.jd.a(a8, xmlPullParser, "scaleX", 3, hsVar2.f);
                                hsVar2.g = defpackage.jd.a(a8, xmlPullParser, "scaleY", 4, hsVar2.g);
                                hsVar2.h = defpackage.jd.a(a8, xmlPullParser, "translateX", 6, hsVar2.h);
                                hsVar2.i = defpackage.jd.a(a8, xmlPullParser, "translateY", 7, hsVar2.i);
                                java.lang.String string6 = a8.getString(0);
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
                        if (eventType == 3) {
                            if ("group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        z = z3;
                    }
                    z3 = z;
                    eventType = xmlPullParser.next();
                }
                if (z3) {
                    throw new org.xmlpull.v1.XmlPullParserException("no path defined");
                }
                this.e = a(hvVar.c, hvVar.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(android.graphics.Rect rect) {
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

    public final void scheduleSelf(java.lang.Runnable runnable, long j2) {
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

    public final void unscheduleSelf(java.lang.Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
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

    public final /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public final /* bridge */ /* synthetic */ android.graphics.ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i2, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }
}
