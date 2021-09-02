package defpackage;

/* renamed from: gm reason: default package */
/* compiled from: PG */
public class gm {
    public void a() {
    }

    public static void a(defpackage.ci ciVar, defpackage.cd cdVar, int i, defpackage.ch chVar) {
        float f;
        float f2;
        float c;
        int i2;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        defpackage.ch chVar2 = null;
        defpackage.ch chVar3 = chVar;
        while (chVar3 != null) {
            if (!(chVar3.J == 8)) {
                i2 = i4 + 1;
                if (chVar3.G != defpackage.bg.y) {
                    i3 = (chVar3.k.c != null ? chVar3.k.b() : 0) + i3 + chVar3.c() + (chVar3.i.c != null ? chVar3.i.b() : 0);
                } else {
                    f3 = chVar3.Y + f3;
                }
            } else {
                i2 = i4;
            }
            defpackage.ch chVar4 = chVar3.k.c != null ? chVar3.k.c.a : null;
            if (chVar4 != null && (chVar4.i.c == null || !(chVar4.i.c == null || chVar4.i.c.a == chVar3))) {
                chVar4 = null;
            }
            chVar2 = chVar3;
            chVar3 = chVar4;
            i4 = i2;
        }
        int i5 = 0;
        if (chVar2 != null) {
            if (chVar2.k.c != null) {
                i5 = chVar2.k.c.a.t;
            } else {
                i5 = 0;
            }
            if (chVar2.k.c != null && chVar2.k.c.a == ciVar) {
                i5 = ciVar.i();
            }
        }
        float f4 = ((float) i5) - ((float) i3);
        float f5 = f4 / ((float) (i4 + 1));
        if (i == 0) {
            f = f5;
        } else {
            f = f4 / ((float) i);
            f5 = 0.0f;
        }
        while (chVar != null) {
            int i6 = chVar.i.c != null ? chVar.i.b() : 0;
            int i7 = chVar.k.c != null ? chVar.k.b() : 0;
            if (chVar.J != 8) {
                float f6 = f5 + ((float) i6);
                cdVar.a(chVar.i.h, (int) (0.5f + f6));
                if (chVar.G != defpackage.bg.y) {
                    c = ((float) chVar.c()) + f6;
                } else if (f3 == 0.0f) {
                    c = ((f - ((float) i6)) - ((float) i7)) + f6;
                } else {
                    c = ((((chVar.Y * f4) / f3) - ((float) i6)) - ((float) i7)) + f6;
                }
                cdVar.a(chVar.k.h, (int) (0.5f + c));
                if (i == 0) {
                    c += f;
                }
                f2 = c + ((float) i7);
            } else {
                float f7 = f5 - (f / 2.0f);
                cdVar.a(chVar.i.h, (int) (0.5f + f7));
                cdVar.a(chVar.k.h, (int) (f7 + 0.5f));
                f2 = f5;
            }
            defpackage.ch chVar5 = chVar.k.c != null ? chVar.k.c.a : null;
            if (!(chVar5 == null || chVar5.i.c == null || chVar5.i.c.a == chVar)) {
                chVar5 = null;
            }
            if (chVar5 == ciVar) {
                chVar5 = null;
            }
            f5 = f2;
            chVar = chVar5;
        }
    }

    public static void b(defpackage.ci ciVar, defpackage.cd cdVar, int i, defpackage.ch chVar) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        float f4 = 0.0f;
        defpackage.ch chVar2 = null;
        defpackage.ch chVar3 = chVar;
        while (chVar3 != null) {
            if (!(chVar3.J == 8)) {
                i2 = i4 + 1;
                if (chVar3.H != defpackage.bg.y) {
                    i3 = (chVar3.l.c != null ? chVar3.l.b() : 0) + i3 + chVar3.f() + (chVar3.j.c != null ? chVar3.j.b() : 0);
                } else {
                    f4 = chVar3.Z + f4;
                }
            } else {
                i2 = i4;
            }
            defpackage.ch chVar4 = chVar3.l.c != null ? chVar3.l.c.a : null;
            if (chVar4 != null && (chVar4.j.c == null || !(chVar4.j.c == null || chVar4.j.c.a == chVar3))) {
                chVar4 = null;
            }
            chVar2 = chVar3;
            chVar3 = chVar4;
            i4 = i2;
        }
        int i5 = 0;
        if (chVar2 != null) {
            if (chVar2.l.c != null) {
                i5 = chVar2.l.c.a.t;
            } else {
                i5 = 0;
            }
            if (chVar2.l.c != null && chVar2.l.c.a == ciVar) {
                i5 = ciVar.j();
            }
        }
        float f5 = ((float) i5) - ((float) i3);
        float f6 = f5 / ((float) (i4 + 1));
        if (i == 0) {
            f = f6;
        } else {
            f = f5 / ((float) i);
            f6 = 0.0f;
        }
        while (chVar != null) {
            int i6 = chVar.j.c != null ? chVar.j.b() : 0;
            int i7 = chVar.l.c != null ? chVar.l.b() : 0;
            if (chVar.J != 8) {
                float f7 = f6 + ((float) i6);
                cdVar.a(chVar.j.h, (int) (0.5f + f7));
                if (chVar.H != defpackage.bg.y) {
                    f3 = ((float) chVar.f()) + f7;
                } else if (f4 == 0.0f) {
                    f3 = ((f - ((float) i6)) - ((float) i7)) + f7;
                } else {
                    f3 = ((((chVar.Z * f5) / f4) - ((float) i6)) - ((float) i7)) + f7;
                }
                cdVar.a(chVar.l.h, (int) (0.5f + f3));
                if (i == 0) {
                    f3 += f;
                }
                f2 = f3 + ((float) i7);
            } else {
                float f8 = f6 - (f / 2.0f);
                cdVar.a(chVar.j.h, (int) (0.5f + f8));
                cdVar.a(chVar.l.h, (int) (f8 + 0.5f));
                f2 = f6;
            }
            defpackage.ch chVar5 = chVar.l.c != null ? chVar.l.c.a : null;
            if (!(chVar5 == null || chVar5.j.c == null || chVar5.j.c.a == chVar)) {
                chVar5 = null;
            }
            if (chVar5 == ciVar) {
                chVar5 = null;
            }
            f6 = f2;
            chVar = chVar5;
        }
    }

    public static void a(defpackage.ci ciVar, defpackage.cd cdVar, defpackage.ch chVar) {
        boolean z;
        float f;
        int f2;
        boolean z2 = true;
        if (chVar.H == defpackage.bg.y) {
            chVar.b = 1;
        } else if (ciVar.H != defpackage.bg.x && chVar.H == defpackage.bg.z) {
            chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
            chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
            int i = chVar.j.d;
            int f3 = ciVar.f() - chVar.l.d;
            cdVar.a(chVar.j.h, i);
            cdVar.a(chVar.l.h, f3);
            if (chVar.z > 0 || chVar.J == 8) {
                chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                cdVar.a(chVar.m.h, chVar.z + i);
            }
            chVar.c(i, f3);
            chVar.b = 2;
        } else if (chVar.j.c == null || chVar.l.c == null) {
            if (chVar.j.c != null && chVar.j.c.a == ciVar) {
                int b = chVar.j.b();
                int f4 = chVar.f() + b;
                chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                cdVar.a(chVar.j.h, b);
                cdVar.a(chVar.l.h, f4);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + b);
                }
                chVar.b = 2;
                chVar.c(b, f4);
            } else if (chVar.l.c != null && chVar.l.c.a == ciVar) {
                chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                int f5 = ciVar.f() - chVar.l.b();
                int f6 = f5 - chVar.f();
                cdVar.a(chVar.j.h, f6);
                cdVar.a(chVar.l.h, f5);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + f6);
                }
                chVar.b = 2;
                chVar.c(f6, f5);
            } else if (chVar.j.c != null && chVar.j.c.a.b == 2) {
                defpackage.cf cfVar = chVar.j.c.h;
                chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                int b2 = (int) (cfVar.d + ((float) chVar.j.b()) + 0.5f);
                int f7 = chVar.f() + b2;
                cdVar.a(chVar.j.h, b2);
                cdVar.a(chVar.l.h, f7);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + b2);
                }
                chVar.b = 2;
                chVar.c(b2, f7);
            } else if (chVar.l.c != null && chVar.l.c.a.b == 2) {
                defpackage.cf cfVar2 = chVar.l.c.h;
                chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                int b3 = (int) ((cfVar2.d - ((float) chVar.l.b())) + 0.5f);
                int f8 = b3 - chVar.f();
                cdVar.a(chVar.j.h, f8);
                cdVar.a(chVar.l.h, b3);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + f8);
                }
                chVar.b = 2;
                chVar.c(f8, b3);
            } else if (chVar.m.c == null || chVar.m.c.a.b != 2) {
                boolean z3 = chVar.m.c != null;
                if (chVar.j.c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (chVar.l.c == null) {
                    z2 = false;
                }
                if (!z3 && !z && !z2) {
                    if (chVar instanceof defpackage.cj) {
                        defpackage.cj cjVar = (defpackage.cj) chVar;
                        if (cjVar.af == 0) {
                            chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                            chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                            if (cjVar.ad != -1) {
                                f = (float) cjVar.ad;
                            } else if (cjVar.ae != -1) {
                                f = (float) (ciVar.f() - cjVar.ae);
                            } else {
                                f = cjVar.ac * ((float) ciVar.f());
                            }
                            int i2 = (int) (f + 0.5f);
                            cdVar.a(chVar.j.h, i2);
                            cdVar.a(chVar.l.h, i2);
                            chVar.b = 2;
                            chVar.a = 2;
                            chVar.c(i2, i2);
                            chVar.b(0, ciVar.c());
                            return;
                        }
                        return;
                    }
                    chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                    chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                    int i3 = chVar.u;
                    int f9 = chVar.f() + i3;
                    cdVar.a(chVar.j.h, i3);
                    cdVar.a(chVar.l.h, f9);
                    if (chVar.z > 0 || chVar.J == 8) {
                        chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                        cdVar.a(chVar.m.h, i3 + chVar.z);
                    }
                    chVar.b = 2;
                }
            } else {
                defpackage.cf cfVar3 = chVar.m.c.h;
                chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
                chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
                int i4 = (int) ((cfVar3.d - ((float) chVar.z)) + 0.5f);
                int f10 = chVar.f() + i4;
                cdVar.a(chVar.j.h, i4);
                cdVar.a(chVar.l.h, f10);
                chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                cdVar.a(chVar.m.h, chVar.z + i4);
                chVar.b = 2;
                chVar.c(i4, f10);
            }
        } else if (chVar.j.c.a == ciVar && chVar.l.c.a == ciVar) {
            int b4 = chVar.j.b();
            int b5 = chVar.l.b();
            if (ciVar.H == defpackage.bg.y) {
                f2 = chVar.f() + b4;
            } else {
                b4 = (int) ((((float) (((ciVar.f() - b4) - b5) - chVar.f())) * chVar.F) + ((float) b4) + 0.5f);
                f2 = chVar.f() + b4;
            }
            chVar.j.h = cdVar.a((java.lang.Object) chVar.j);
            chVar.l.h = cdVar.a((java.lang.Object) chVar.l);
            cdVar.a(chVar.j.h, b4);
            cdVar.a(chVar.l.h, f2);
            if (chVar.z > 0 || chVar.J == 8) {
                chVar.m.h = cdVar.a((java.lang.Object) chVar.m);
                cdVar.a(chVar.m.h, chVar.z + b4);
            }
            chVar.b = 2;
            chVar.c(b4, f2);
        } else {
            chVar.b = 1;
        }
    }

    public static android.graphics.PorterDuffColorFilter a(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static android.graphics.PorterDuff.Mode a(int i, android.graphics.PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return android.graphics.PorterDuff.Mode.SRC_OVER;
            case 5:
                return android.graphics.PorterDuff.Mode.SRC_IN;
            case 9:
                return android.graphics.PorterDuff.Mode.SRC_ATOP;
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean a(android.view.View view) {
        if (defpackage.sn.a.j(view) == 1) {
            return true;
        }
        return false;
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static android.content.res.ColorStateList a(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                android.content.res.ColorStateList a = defpackage.xw.a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static android.graphics.drawable.Drawable b(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                android.graphics.drawable.Drawable b = defpackage.xw.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.animation.Interpolator a(android.content.Context r5, int r6) {
        /*
            r1 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x000c
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r5, r6)
        L_0x000b:
            return r0
        L_0x000c:
            r0 = 17563663(0x10c000f, float:2.571398E-38)
            if (r6 != r0) goto L_0x003c
            ts r0 = new ts     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            goto L_0x000b
        L_0x0017:
            r0 = move-exception
        L_0x0018:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "Can't load animation resource ID #0x"
            r3.<init>(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = java.lang.Integer.toHexString(r6)     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
            r2.initCause(r0)     // Catch:{ all -> 0x0034 }
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = 17563661(0x10c000d, float:2.5713975E-38)
            if (r6 != r0) goto L_0x0067
            tt r0 = new tt     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            goto L_0x000b
        L_0x0047:
            r0 = move-exception
            r2 = r1
        L_0x0049:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "Can't load animation resource ID #0x"
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = java.lang.Integer.toHexString(r6)     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0065 }
            r1.<init>(r3)     // Catch:{ all -> 0x0065 }
            r1.initCause(r0)     // Catch:{ all -> 0x0065 }
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            goto L_0x0036
        L_0x0067:
            r0 = 17563662(0x10c000e, float:2.5713978E-38)
            if (r6 != r0) goto L_0x0075
            tu r0 = new tu     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            goto L_0x000b
        L_0x0072:
            r0 = move-exception
            r2 = r1
            goto L_0x0036
        L_0x0075:
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            android.content.res.XmlResourceParser r2 = r0.getAnimation(r6)     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0047, all -> 0x0072 }
            r5.getResources()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r5.getTheme()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            int r3 = r2.getDepth()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0 = r1
        L_0x0088:
            int r1 = r2.next()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r4 = 3
            if (r1 != r4) goto L_0x0095
            int r4 = r2.getDepth()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 <= r3) goto L_0x0152
        L_0x0095:
            r4 = 1
            if (r1 == r4) goto L_0x0152
            r4 = 2
            if (r1 != r4) goto L_0x0088
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r2)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.String r0 = r2.getName()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.String r4 = "linearInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00b5
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00b1:
            r0 = move-exception
            r1 = r2
            goto L_0x0018
        L_0x00b5:
            java.lang.String r4 = "accelerateInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00c5
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00c3:
            r0 = move-exception
            goto L_0x0049
        L_0x00c5:
            java.lang.String r4 = "decelerateInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00d3
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00d3:
            java.lang.String r4 = "accelerateDecelerateInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00e1
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00e1:
            java.lang.String r4 = "cycleInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00ef
            android.view.animation.CycleInterpolator r0 = new android.view.animation.CycleInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00ef:
            java.lang.String r4 = "anticipateInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00fd
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x00fd:
            java.lang.String r4 = "overshootInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x010c
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x010c:
            java.lang.String r4 = "anticipateOvershootInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x011b
            android.view.animation.AnticipateOvershootInterpolator r0 = new android.view.animation.AnticipateOvershootInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x011b:
            java.lang.String r4 = "bounceInterpolator"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x012a
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x012a:
            java.lang.String r4 = "pathInterpolator"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            if (r0 == 0) goto L_0x0139
            hn r0 = new hn     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r5, r1, r2)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            goto L_0x0088
        L_0x0139:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.String r3 = "Unknown interpolator name: "
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.String r3 = r2.getName()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x00c3 }
        L_0x0152:
            if (r2 == 0) goto L_0x000b
            r2.close()
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(android.content.Context, int):android.view.animation.Interpolator");
    }

    public static android.animation.Animator a(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, int i) {
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            android.animation.Animator a = a(context, resources, theme, xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (java.io.IOException e2) {
            android.content.res.Resources.NotFoundException notFoundException2 = new android.content.res.Resources.NotFoundException("Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static android.animation.PropertyValuesHolder a(android.content.res.TypedArray typedArray, int i, int i2, int i3, java.lang.String str) {
        boolean z;
        android.animation.PropertyValuesHolder propertyValuesHolder;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        android.util.TypedValue peekValue = typedArray.peekValue(i2);
        boolean z2 = peekValue != null;
        int i7 = z2 ? peekValue.type : 0;
        android.util.TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z3 = peekValue2 != null;
        int i8 = z3 ? peekValue2.type : 0;
        if (i == 4) {
            if ((!z2 || !a(i7)) && (!z3 || !a(i8))) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 2) {
            java.lang.String string = typedArray.getString(i2);
            java.lang.String string2 = typedArray.getString(i3);
            defpackage.ou[] b = defpackage.jd.b(string);
            defpackage.ou[] b2 = defpackage.jd.b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    defpackage.hl hlVar = new defpackage.hl();
                    if (b2 == null) {
                        return android.animation.PropertyValuesHolder.ofObject(str, hlVar, new java.lang.Object[]{b});
                    } else if (!defpackage.jd.a(b, b2)) {
                        throw new android.view.InflateException(" Can't morph from " + string + " to " + string2);
                    } else {
                        return android.animation.PropertyValuesHolder.ofObject(str, hlVar, new java.lang.Object[]{b, b2});
                    }
                } else if (b2 != null) {
                    return android.animation.PropertyValuesHolder.ofObject(str, new defpackage.hl(), new java.lang.Object[]{b2});
                }
            }
            return null;
        }
        defpackage.hm hmVar = null;
        if (i == 3) {
            hmVar = defpackage.hm.a;
        }
        if (z) {
            if (z2) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z3) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = android.animation.PropertyValuesHolder.ofFloat(str, new float[]{f2, f3});
                } else {
                    propertyValuesHolder = android.animation.PropertyValuesHolder.ofFloat(str, new float[]{f2});
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = android.animation.PropertyValuesHolder.ofFloat(str, new float[]{f});
            }
        } else if (z2) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z3) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, new int[]{i5, i6});
            } else {
                propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, new int[]{i5});
            }
        } else if (z3) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, new int[]{i4});
        } else {
            propertyValuesHolder = null;
        }
        if (propertyValuesHolder == null || hmVar == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(hmVar);
        return propertyValuesHolder;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v18, types: [android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0006, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 328
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JavaClass.getCode(JavaClass.java:48)
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d9  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
        /*
            r5 = 0
            r12 = 0
            int r14 = r24.getDepth()
        L_0x0006:
            int r3 = r24.next()
            r4 = 3
            if (r3 != r4) goto L_0x0013
            int r4 = r24.getDepth()
            if (r4 <= r14) goto L_0x031c
        L_0x0013:
            r4 = 1
            if (r3 == r4) goto L_0x031c
            r4 = 2
            if (r3 != r4) goto L_0x0006
            java.lang.String r3 = r24.getName()
            r13 = 0
            java.lang.String r4 = "objectAnimator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x004b
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r8 = r28
            r9 = r24
            a(r3, r4, r5, r6, r7, r8, r9)
            r3 = r13
            r5 = r7
        L_0x003c:
            if (r26 == 0) goto L_0x0006
            if (r3 != 0) goto L_0x0006
            if (r12 != 0) goto L_0x0047
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0047:
            r12.add(r5)
            goto L_0x0006
        L_0x004b:
            java.lang.String r4 = "animator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0066
            r7 = 0
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r8 = r28
            r9 = r24
            android.animation.ValueAnimator r5 = a(r3, r4, r5, r6, r7, r8, r9)
            r3 = r13
            goto L_0x003c
        L_0x0066:
            java.lang.String r4 = "set"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00a1
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            int[] r3 = defpackage.hg.h
            r0 = r22
            r1 = r23
            r2 = r25
            android.content.res.TypedArray r15 = defpackage.jd.a(r0, r1, r2, r3)
            java.lang.String r3 = "ordering"
            r4 = 0
            r5 = 0
            r0 = r24
            int r9 = defpackage.jd.a(r15, r0, r3, r4, r5)
            r8 = r11
            android.animation.AnimatorSet r8 = (android.animation.AnimatorSet) r8
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r10 = r28
            a(r3, r4, r5, r6, r7, r8, r9, r10)
            r15.recycle()
            r3 = r13
            r5 = r11
            goto L_0x003c
        L_0x00a1:
            java.lang.String r4 = "propertyValuesHolder"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0303
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r24)
            r3 = 0
            r6 = r3
        L_0x00af:
            int r3 = r24.getEventType()
            r4 = 3
            if (r3 == r4) goto L_0x02d8
            r4 = 1
            if (r3 == r4) goto L_0x02d8
            r4 = 2
            if (r3 == r4) goto L_0x00c0
            r24.next()
            goto L_0x00af
        L_0x00c0:
            java.lang.String r3 = r24.getName()
            java.lang.String r4 = "propertyValuesHolder"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02d1
            int[] r3 = defpackage.hg.i
            r0 = r22
            r1 = r23
            android.content.res.TypedArray r15 = defpackage.jd.a(r0, r1, r13, r3)
            java.lang.String r3 = "propertyName"
            r4 = 3
            r0 = r24
            java.lang.String r16 = defpackage.jd.b(r15, r0, r3, r4)
            java.lang.String r3 = "valueType"
            r4 = 2
            r7 = 4
            r0 = r24
            int r9 = defpackage.jd.a(r15, r0, r3, r4, r7)
            r11 = 0
            r3 = 0
            r7 = r3
            r8 = r9
        L_0x00ed:
            int r3 = r24.next()
            r4 = 3
            if (r3 == r4) goto L_0x01d7
            r4 = 1
            if (r3 == r4) goto L_0x01d7
            java.lang.String r3 = r24.getName()
            java.lang.String r4 = "keyframe"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x035b
            r3 = 4
            if (r8 != r3) goto L_0x0358
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r24)
            int[] r4 = defpackage.hg.j
            r0 = r22
            r1 = r23
            android.content.res.TypedArray r4 = defpackage.jd.a(r0, r1, r3, r4)
            java.lang.String r3 = "value"
            r0 = r24
            android.util.TypedValue r8 = defpackage.jd.a(r4, r0, r3)
            if (r8 == 0) goto L_0x019c
            r3 = 1
        L_0x011f:
            if (r3 == 0) goto L_0x019e
            int r3 = r8.type
            boolean r3 = a(r3)
            if (r3 == 0) goto L_0x019e
            r3 = 3
        L_0x012a:
            r4.recycle()
        L_0x012d:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r24)
            int[] r8 = defpackage.hg.j
            r0 = r22
            r1 = r23
            android.content.res.TypedArray r17 = defpackage.jd.a(r0, r1, r4, r8)
            r4 = 0
            java.lang.String r8 = "fraction"
            r10 = 3
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r17
            r1 = r24
            r2 = r18
            float r18 = defpackage.jd.a(r0, r1, r8, r10, r2)
            java.lang.String r8 = "value"
            r0 = r17
            r1 = r24
            android.util.TypedValue r19 = defpackage.jd.a(r0, r1, r8)
            if (r19 == 0) goto L_0x01a0
            r8 = 1
            r10 = r8
        L_0x0159:
            r8 = 4
            if (r3 != r8) goto L_0x0355
            if (r10 == 0) goto L_0x01a3
            r0 = r19
            int r8 = r0.type
            boolean r8 = a(r8)
            if (r8 == 0) goto L_0x01a3
            r8 = 3
        L_0x0169:
            if (r10 == 0) goto L_0x01cb
            switch(r8) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x01b8;
                case 2: goto L_0x016e;
                case 3: goto L_0x01b8;
                default: goto L_0x016e;
            }
        L_0x016e:
            java.lang.String r8 = "interpolator"
            r10 = 1
            r0 = r17
            r1 = r24
            int r8 = defpackage.jd.a(r0, r1, r8, r10)
            if (r8 <= 0) goto L_0x0184
            r0 = r21
            android.view.animation.Interpolator r8 = a(r0, r8)
            r4.setInterpolator(r8)
        L_0x0184:
            r17.recycle()
            if (r4 == 0) goto L_0x0193
            if (r7 != 0) goto L_0x0190
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0190:
            r7.add(r4)
        L_0x0193:
            r24.next()
            r4 = r3
            r3 = r7
        L_0x0198:
            r7 = r3
            r8 = r4
            goto L_0x00ed
        L_0x019c:
            r3 = 0
            goto L_0x011f
        L_0x019e:
            r3 = 0
            goto L_0x012a
        L_0x01a0:
            r8 = 0
            r10 = r8
            goto L_0x0159
        L_0x01a3:
            r8 = 0
            goto L_0x0169
        L_0x01a5:
            java.lang.String r4 = "value"
            r8 = 0
            r10 = 0
            r0 = r17
            r1 = r24
            float r4 = defpackage.jd.a(r0, r1, r4, r8, r10)
            r0 = r18
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r0, r4)
            goto L_0x016e
        L_0x01b8:
            java.lang.String r4 = "value"
            r8 = 0
            r10 = 0
            r0 = r17
            r1 = r24
            int r4 = defpackage.jd.a(r0, r1, r4, r8, r10)
            r0 = r18
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r0, r4)
            goto L_0x016e
        L_0x01cb:
            if (r8 != 0) goto L_0x01d2
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r18)
            goto L_0x016e
        L_0x01d2:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r18)
            goto L_0x016e
        L_0x01d7:
            if (r7 == 0) goto L_0x0352
            int r10 = r7.size()
            if (r10 <= 0) goto L_0x0352
            r3 = 0
            java.lang.Object r3 = r7.get(r3)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            int r4 = r10 + -1
            java.lang.Object r4 = r7.get(r4)
            android.animation.Keyframe r4 = (android.animation.Keyframe) r4
            float r11 = r4.getFraction()
            r17 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r17 >= 0) goto L_0x034f
            r17 = 0
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 >= 0) goto L_0x0233
            r11 = 1065353216(0x3f800000, float:1.0)
            r4.setFraction(r11)
            r4 = r10
        L_0x0204:
            float r10 = r3.getFraction()
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0216
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0245
            r10 = 0
            r3.setFraction(r10)
        L_0x0216:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r4]
            r7.toArray(r11)
            r7 = 0
        L_0x021c:
            if (r7 >= r4) goto L_0x02aa
            r3 = r11[r7]
            float r10 = r3.getFraction()
            r17 = 0
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x0230
            if (r7 != 0) goto L_0x0251
            r10 = 0
            r3.setFraction(r10)
        L_0x0230:
            int r7 = r7 + 1
            goto L_0x021c
        L_0x0233:
            int r11 = r7.size()
            r17 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            android.animation.Keyframe r4 = a(r4, r0)
            r7.add(r11, r4)
            int r4 = r10 + 1
            goto L_0x0204
        L_0x0245:
            r10 = 0
            r11 = 0
            android.animation.Keyframe r3 = a(r3, r11)
            r7.add(r10, r3)
            int r4 = r4 + 1
            goto L_0x0216
        L_0x0251:
            int r10 = r4 + -1
            if (r7 != r10) goto L_0x025b
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.setFraction(r10)
            goto L_0x0230
        L_0x025b:
            int r3 = r7 + 1
            r10 = r7
        L_0x025e:
            int r17 = r4 + -1
            r0 = r17
            if (r3 >= r0) goto L_0x0278
            r17 = r11[r3]
            float r17 = r17.getFraction()
            r18 = 0
            int r17 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r17 >= 0) goto L_0x0278
            int r10 = r3 + 1
            r20 = r10
            r10 = r3
            r3 = r20
            goto L_0x025e
        L_0x0278:
            int r3 = r10 + 1
            r3 = r11[r3]
            float r3 = r3.getFraction()
            int r17 = r7 + -1
            r17 = r11[r17]
            float r17 = r17.getFraction()
            float r3 = r3 - r17
            int r17 = r10 - r7
            int r17 = r17 + 2
            r0 = r17
            float r0 = (float) r0
            r17 = r0
            float r17 = r3 / r17
            r3 = r7
        L_0x0296:
            if (r3 > r10) goto L_0x0230
            r18 = r11[r3]
            int r19 = r3 + -1
            r19 = r11[r19]
            float r19 = r19.getFraction()
            float r19 = r19 + r17
            r18.setFraction(r19)
            int r3 = r3 + 1
            goto L_0x0296
        L_0x02aa:
            r0 = r16
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofKeyframe(r0, r11)
            r4 = 3
            if (r8 != r4) goto L_0x02b8
            hm r4 = defpackage.hm.a
            r3.setEvaluator(r4)
        L_0x02b8:
            if (r3 != 0) goto L_0x02c2
            r3 = 0
            r4 = 1
            r0 = r16
            android.animation.PropertyValuesHolder r3 = a(r15, r9, r3, r4, r0)
        L_0x02c2:
            if (r3 == 0) goto L_0x02ce
            if (r6 != 0) goto L_0x02cb
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x02cb:
            r6.add(r3)
        L_0x02ce:
            r15.recycle()
        L_0x02d1:
            r3 = r6
            r24.next()
            r6 = r3
            goto L_0x00af
        L_0x02d8:
            r3 = 0
            if (r6 == 0) goto L_0x02f1
            int r8 = r6.size()
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r8]
            r3 = 0
            r7 = r3
        L_0x02e3:
            if (r7 >= r8) goto L_0x02f2
            java.lang.Object r3 = r6.get(r7)
            android.animation.PropertyValuesHolder r3 = (android.animation.PropertyValuesHolder) r3
            r4[r7] = r3
            int r3 = r7 + 1
            r7 = r3
            goto L_0x02e3
        L_0x02f1:
            r4 = r3
        L_0x02f2:
            if (r4 == 0) goto L_0x0300
            if (r5 == 0) goto L_0x0300
            boolean r3 = r5 instanceof android.animation.ValueAnimator
            if (r3 == 0) goto L_0x0300
            r3 = r5
            android.animation.ValueAnimator r3 = (android.animation.ValueAnimator) r3
            r3.setValues(r4)
        L_0x0300:
            r3 = 1
            goto L_0x003c
        L_0x0303:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown animator name: "
            r4.<init>(r5)
            java.lang.String r5 = r24.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x031c:
            if (r26 == 0) goto L_0x0348
            if (r12 == 0) goto L_0x0348
            int r3 = r12.size()
            android.animation.Animator[] r9 = new android.animation.Animator[r3]
            r6 = 0
            r3 = r12
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r10 = r3.size()
            r4 = 0
            r7 = r6
            r6 = r4
        L_0x0331:
            if (r6 >= r10) goto L_0x0341
            java.lang.Object r4 = r3.get(r6)
            int r6 = r6 + 1
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r8 = r7 + 1
            r9[r7] = r4
            r7 = r8
            goto L_0x0331
        L_0x0341:
            if (r27 != 0) goto L_0x0349
            r0 = r26
            r0.playTogether(r9)
        L_0x0348:
            return r5
        L_0x0349:
            r0 = r26
            r0.playSequentially(r9)
            goto L_0x0348
        L_0x034f:
            r4 = r10
            goto L_0x0204
        L_0x0352:
            r3 = r11
            goto L_0x02b8
        L_0x0355:
            r8 = r3
            goto L_0x0169
        L_0x0358:
            r3 = r8
            goto L_0x012d
        L_0x035b:
            r3 = r7
            r4 = r8
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static android.animation.Keyframe a(android.animation.Keyframe keyframe, float f) {
        if (keyframe.getType() == java.lang.Float.TYPE) {
            return android.animation.Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == java.lang.Integer.TYPE) {
            return android.animation.Keyframe.ofInt(f);
        }
        return android.animation.Keyframe.ofObject(f);
    }

    private static android.animation.ValueAnimator a(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, android.animation.ValueAnimator valueAnimator, float f, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.animation.ValueAnimator valueAnimator2;
        int i;
        android.content.res.TypedArray a = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.g);
        android.content.res.TypedArray a2 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.k);
        if (valueAnimator == null) {
            valueAnimator2 = new android.animation.ValueAnimator();
        } else {
            valueAnimator2 = valueAnimator;
        }
        long a3 = (long) defpackage.jd.a(a, xmlPullParser, "duration", 1, 300);
        long a4 = (long) defpackage.jd.a(a, xmlPullParser, "startOffset", 2, 0);
        int a5 = defpackage.jd.a(a, xmlPullParser, "valueType", 7, 4);
        if (defpackage.jd.a(xmlPullParser, "valueFrom")) {
            if (defpackage.jd.a(xmlPullParser, "valueTo")) {
                if (a5 == 4) {
                    android.util.TypedValue peekValue = a.peekValue(5);
                    boolean z = peekValue != null;
                    int i2 = z ? peekValue.type : 0;
                    android.util.TypedValue peekValue2 = a.peekValue(6);
                    boolean z2 = peekValue2 != null;
                    int i3 = z2 ? peekValue2.type : 0;
                    if ((!z || !a(i2)) && (!z2 || !a(i3))) {
                        a5 = 0;
                    } else {
                        a5 = 3;
                    }
                }
                android.animation.PropertyValuesHolder a6 = a(a, a5, 5, 6, "");
                if (a6 != null) {
                    valueAnimator2.setValues(new android.animation.PropertyValuesHolder[]{a6});
                }
            }
        }
        valueAnimator2.setDuration(a3);
        valueAnimator2.setStartDelay(a4);
        valueAnimator2.setRepeatCount(defpackage.jd.a(a, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(defpackage.jd.a(a, xmlPullParser, "repeatMode", 4, 1));
        if (a2 != null) {
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) valueAnimator2;
            java.lang.String b = defpackage.jd.b(a2, xmlPullParser, "pathData", 1);
            if (b != null) {
                java.lang.String b2 = defpackage.jd.b(a2, xmlPullParser, "propertyXName", 2);
                java.lang.String b3 = defpackage.jd.b(a2, xmlPullParser, "propertyYName", 3);
                if (b2 == null && b3 == null) {
                    throw new android.view.InflateException(a2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                android.graphics.Path a7 = defpackage.jd.a(b);
                float f2 = 0.5f * f;
                android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(a7, false);
                float f3 = 0.0f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(java.lang.Float.valueOf(0.0f));
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(java.lang.Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                android.graphics.PathMeasure pathMeasure2 = new android.graphics.PathMeasure(a7, false);
                int min = java.lang.Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                int i4 = 0;
                float f4 = f3 / ((float) (min - 1));
                int i5 = 0;
                float f5 = 0.0f;
                while (i5 < min) {
                    pathMeasure2.getPosTan(f5, fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    float f6 = f5 + f4;
                    if (i4 + 1 >= arrayList.size() || f6 <= ((java.lang.Float) arrayList.get(i4 + 1)).floatValue()) {
                        f5 = f6;
                        i = i4;
                    } else {
                        f5 = f6 - ((java.lang.Float) arrayList.get(i4 + 1)).floatValue();
                        i = i4 + 1;
                        pathMeasure2.nextContour();
                    }
                    i5++;
                    i4 = i;
                }
                android.animation.PropertyValuesHolder propertyValuesHolder = null;
                android.animation.PropertyValuesHolder propertyValuesHolder2 = null;
                if (b2 != null) {
                    propertyValuesHolder = android.animation.PropertyValuesHolder.ofFloat(b2, fArr);
                }
                if (b3 != null) {
                    propertyValuesHolder2 = android.animation.PropertyValuesHolder.ofFloat(b3, fArr2);
                }
                if (propertyValuesHolder == null) {
                    objectAnimator.setValues(new android.animation.PropertyValuesHolder[]{propertyValuesHolder2});
                } else if (propertyValuesHolder2 == null) {
                    objectAnimator.setValues(new android.animation.PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    objectAnimator.setValues(new android.animation.PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2});
                }
            } else {
                objectAnimator.setPropertyName(defpackage.jd.b(a2, xmlPullParser, "propertyName", 0));
            }
        }
        int a8 = defpackage.jd.a(a, xmlPullParser, "interpolator", 0);
        if (a8 > 0) {
            valueAnimator2.setInterpolator(a(context, a8));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator2;
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(android.content.Context r28, android.content.pm.ApplicationInfo r29, java.io.File r30) {
        /*
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MultiDexExtractor.load("
            r4.<init>(r5)
            r0 = r29
            java.lang.String r5 = r0.sourceDir
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", false)"
            r4.append(r5)
            java.io.File r7 = new java.io.File
            r0 = r29
            java.lang.String r4 = r0.sourceDir
            r7.<init>(r4)
            long r8 = b(r7)
            java.io.File r14 = new java.io.File
            java.lang.String r4 = "MultiDex.lock"
            r0 = r30
            r14.<init>(r0, r4)
            java.io.RandomAccessFile r15 = new java.io.RandomAccessFile
            java.lang.String r4 = "rw"
            r15.<init>(r14, r4)
            r6 = 0
            r5 = 0
            r13 = 0
            java.nio.channels.FileChannel r12 = r15.getChannel()     // Catch:{ all -> 0x0241 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = "Blocking on lock "
            r4.<init>(r6)     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = r14.getPath()     // Catch:{ all -> 0x0243 }
            r4.append(r6)     // Catch:{ all -> 0x0243 }
            java.nio.channels.FileLock r11 = r12.lock()     // Catch:{ all -> 0x0243 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d7 }
            r4.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = r14.getPath()     // Catch:{ all -> 0x01d7 }
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = " locked"
            r4.append(r5)     // Catch:{ all -> 0x01d7 }
            android.content.SharedPreferences r4 = a(r28)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = "timestamp"
            r16 = -1
            r0 = r16
            long r16 = r4.getLong(r5, r0)     // Catch:{ all -> 0x01d7 }
            long r18 = a(r7)     // Catch:{ all -> 0x01d7 }
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x0080
            java.lang.String r5 = "crc"
            r16 = -1
            r0 = r16
            long r4 = r4.getLong(r5, r0)     // Catch:{ all -> 0x01d7 }
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x01ac
        L_0x0080:
            r4 = 1
        L_0x0081:
            if (r4 != 0) goto L_0x01e8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            r4.<init>()     // Catch:{ IOException -> 0x0184 }
            java.lang.String r5 = r7.getName()     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r5 = ".classes"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r5 = r4.toString()     // Catch:{ IOException -> 0x0184 }
            android.content.SharedPreferences r6 = a(r28)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = "dex.number"
            r10 = 1
            int r16 = r6.getInt(r4, r10)     // Catch:{ IOException -> 0x0184 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x0184 }
            int r4 = r16 + -1
            r10.<init>(r4)     // Catch:{ IOException -> 0x0184 }
            r4 = 2
        L_0x00ad:
            r0 = r16
            if (r4 > r0) goto L_0x019b
            java.lang.StringBuilder r17 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            r17.<init>()     // Catch:{ IOException -> 0x0184 }
            r0 = r17
            java.lang.StringBuilder r17 = r0.append(r5)     // Catch:{ IOException -> 0x0184 }
            r0 = r17
            java.lang.StringBuilder r17 = r0.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r18 = ".zip"
            java.lang.StringBuilder r17 = r17.append(r18)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r17 = r17.toString()     // Catch:{ IOException -> 0x0184 }
            hz r18 = new hz     // Catch:{ IOException -> 0x0184 }
            r0 = r18
            r1 = r30
            r2 = r17
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0184 }
            boolean r17 = r18.isFile()     // Catch:{ IOException -> 0x0184 }
            if (r17 == 0) goto L_0x01b8
            long r20 = b(r18)     // Catch:{ IOException -> 0x0184 }
            r0 = r20
            r2 = r18
            r2.a = r0     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r17 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            java.lang.String r19 = "dex.crc."
            r0 = r17
            r1 = r19
            r0.<init>(r1)     // Catch:{ IOException -> 0x0184 }
            r0 = r17
            java.lang.StringBuilder r17 = r0.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r17 = r17.toString()     // Catch:{ IOException -> 0x0184 }
            r20 = -1
            r0 = r17
            r1 = r20
            long r20 = r6.getLong(r0, r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r17 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            java.lang.String r19 = "dex.time."
            r0 = r17
            r1 = r19
            r0.<init>(r1)     // Catch:{ IOException -> 0x0184 }
            r0 = r17
            java.lang.StringBuilder r17 = r0.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r17 = r17.toString()     // Catch:{ IOException -> 0x0184 }
            r22 = -1
            r0 = r17
            r1 = r22
            long r22 = r6.getLong(r0, r1)     // Catch:{ IOException -> 0x0184 }
            long r24 = r18.lastModified()     // Catch:{ IOException -> 0x0184 }
            int r17 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r17 != 0) goto L_0x0137
            r0 = r18
            long r0 = r0.a     // Catch:{ IOException -> 0x0184 }
            r26 = r0
            int r17 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r17 == 0) goto L_0x01af
        L_0x0137:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = "Invalid extracted dex: "
            r5.<init>(r6)     // Catch:{ IOException -> 0x0184 }
            r0 = r18
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = ", expected modification time: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            r0 = r22
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = ", modification time: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            r0 = r24
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = ", expected crc: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            r0 = r20
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = ", file crc: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            r0 = r18
            long r0 = r0.a     // Catch:{ IOException -> 0x0184 }
            r16 = r0
            r0 = r16
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0184 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0184 }
            throw r4     // Catch:{ IOException -> 0x0184 }
        L_0x0184:
            r4 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r5, r6, r4)     // Catch:{ all -> 0x01d7 }
            r0 = r30
            java.util.List r10 = a(r7, r0)     // Catch:{ all -> 0x01d7 }
            long r6 = a(r7)     // Catch:{ all -> 0x01d7 }
            r5 = r28
            a(r5, r6, r8, r10)     // Catch:{ all -> 0x01d7 }
        L_0x019b:
            if (r11 == 0) goto L_0x0246
            r11.release()     // Catch:{ IOException -> 0x01f8 }
            r4 = r13
        L_0x01a1:
            if (r12 == 0) goto L_0x01a6
            a(r12)
        L_0x01a6:
            a(r15)
            if (r4 == 0) goto L_0x022c
            throw r4
        L_0x01ac:
            r4 = 0
            goto L_0x0081
        L_0x01af:
            r0 = r18
            r10.add(r0)     // Catch:{ IOException -> 0x0184 }
            int r4 = r4 + 1
            goto L_0x00ad
        L_0x01b8:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = "Missing extracted secondary dex file '"
            r5.<init>(r6)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = r18.getPath()     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r6 = "'"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0184 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0184 }
            throw r4     // Catch:{ IOException -> 0x0184 }
        L_0x01d7:
            r4 = move-exception
            r5 = r11
            r6 = r12
        L_0x01da:
            if (r5 == 0) goto L_0x01df
            r5.release()     // Catch:{ IOException -> 0x0212 }
        L_0x01df:
            if (r6 == 0) goto L_0x01e4
            a(r6)
        L_0x01e4:
            a(r15)
            throw r4
        L_0x01e8:
            r0 = r30
            java.util.List r10 = a(r7, r0)     // Catch:{ all -> 0x01d7 }
            long r6 = a(r7)     // Catch:{ all -> 0x01d7 }
            r5 = r28
            a(r5, r6, r8, r10)     // Catch:{ all -> 0x01d7 }
            goto L_0x019b
        L_0x01f8:
            r4 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to release lock on "
            r6.<init>(r7)
            java.lang.String r7 = r14.getPath()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r5, r6)
            goto L_0x01a1
        L_0x0212:
            r5 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to release lock on "
            r7.<init>(r8)
            java.lang.String r8 = r14.getPath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r5, r7)
            goto L_0x01df
        L_0x022c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "load found "
            r4.<init>(r5)
            int r5 = r10.size()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " secondary dex files"
            r4.append(r5)
            return r10
        L_0x0241:
            r4 = move-exception
            goto L_0x01da
        L_0x0243:
            r4 = move-exception
            r6 = r12
            goto L_0x01da
        L_0x0246:
            r4 = r13
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(android.content.Context, android.content.pm.ApplicationInfo, java.io.File):java.util.List");
    }

    private static long a(java.io.File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long b(java.io.File file) {
        long a = defpackage.gn.a(file);
        if (a == -1) {
            return a - 1;
        }
        return a;
    }

    private static java.util.List a(java.io.File file, java.io.File file2) {
        java.io.InputStream inputStream;
        java.io.File createTempFile;
        java.util.zip.ZipOutputStream zipOutputStream;
        java.lang.String str = file.getName() + ".classes";
        java.io.File[] listFiles = file2.listFiles(new defpackage.hy(str));
        if (listFiles == null) {
            android.util.Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (java.io.File file3 : listFiles) {
                new java.lang.StringBuilder("Trying to delete old file ").append(file3.getPath()).append(" of size ").append(file3.length());
                if (!file3.delete()) {
                    android.util.Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                } else {
                    new java.lang.StringBuilder("Deleted old file ").append(file3.getPath());
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        try {
            int i = 2;
            java.util.zip.ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            while (entry != null) {
                defpackage.hz hzVar = new defpackage.hz(file2, str + i + ".zip");
                arrayList.add(hzVar);
                new java.lang.StringBuilder("Extraction is needed for file ").append(hzVar);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    i2++;
                    inputStream = zipFile.getInputStream(entry);
                    createTempFile = java.io.File.createTempFile("tmp-" + str, ".zip", hzVar.getParentFile());
                    new java.lang.StringBuilder("Extracting ").append(createTempFile.getPath());
                    zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(createTempFile)));
                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("classes.dex");
                    zipEntry.setTime(entry.getTime());
                    zipOutputStream.putNextEntry(zipEntry);
                    byte[] bArr = new byte[16384];
                    for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                        zipOutputStream.write(bArr, 0, read);
                    }
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    if (!createTempFile.setReadOnly()) {
                        throw new java.io.IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + hzVar.getAbsolutePath() + "\")");
                    }
                    new java.lang.StringBuilder("Renaming to ").append(hzVar.getPath());
                    if (!createTempFile.renameTo(hzVar)) {
                        throw new java.io.IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + hzVar.getAbsolutePath() + "\"");
                    }
                    a((java.io.Closeable) inputStream);
                    createTempFile.delete();
                    try {
                        hzVar.a = b(hzVar);
                        z = true;
                    } catch (java.io.IOException e) {
                        android.util.Log.w("MultiDex", "Failed to read crc from " + hzVar.getAbsolutePath(), e);
                        z = false;
                    }
                    new java.lang.StringBuilder("Extraction ").append(z ? "succeeded" : "failed").append(" - length ").append(hzVar.getAbsolutePath()).append(": ").append(hzVar.length()).append(" - crc: ").append(hzVar.a);
                    if (!z) {
                        hzVar.delete();
                        if (hzVar.exists()) {
                            android.util.Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + hzVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new java.io.IOException("Could not create zip file " + hzVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                int i3 = i + 1;
                i = i3;
                entry = zipFile.getEntry("classes" + i3 + ".dex");
            }
            try {
                zipFile.close();
            } catch (java.io.IOException e2) {
                android.util.Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (java.io.IOException e3) {
                android.util.Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    private static void a(android.content.Context context, long j, long j2, java.util.List list) {
        android.content.SharedPreferences.Editor edit = a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        int i = 2;
        java.util.Iterator it = list.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                defpackage.hz hzVar = (defpackage.hz) it.next();
                edit.putLong("dex.crc." + i2, hzVar.a);
                edit.putLong("dex.time." + i2, hzVar.lastModified());
                i = i2 + 1;
            } else {
                edit.commit();
                return;
            }
        }
    }

    private static android.content.SharedPreferences a(android.content.Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
