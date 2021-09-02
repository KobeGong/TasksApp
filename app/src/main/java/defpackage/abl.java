package defpackage;

/* renamed from: abl reason: default package */
/* compiled from: PG */
public final class abl {
    private static final android.graphics.PorterDuff.Mode c = android.graphics.PorterDuff.Mode.SRC_IN;
    private static defpackage.abl d;
    private static final defpackage.abn e = new defpackage.abn();
    private static final int[] f = {2130837585, 2130837583, 2130837504};
    private static final int[] g = {2130837526, 2130837567, 2130837533, 2130837528, 2130837529, 2130837532, 2130837531};
    private static final int[] h = {2130837582, 2130837584, 2130837519, 2130837575, 2130837576, 2130837578, 2130837580, 2130837577, 2130837579, 2130837581};
    private static final int[] i = {2130837557, 2130837517, 2130837556};
    private static final int[] j = {2130837573, 2130837586};
    private static final int[] k = {2130837507, 2130837512};
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.WeakHashMap b = new java.util.WeakHashMap(0);
    private java.util.WeakHashMap l;
    private defpackage.qr m;
    private defpackage.rj n;
    private android.util.TypedValue o;
    private boolean p;

    public static defpackage.abl a() {
        if (d == null) {
            defpackage.abl abl = new defpackage.abl();
            d = abl;
            if (android.os.Build.VERSION.SDK_INT < 24) {
                abl.a("vector", (defpackage.abo) new defpackage.abp());
                abl.a("animated-vector", (defpackage.abo) new defpackage.abm());
            }
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            r10 = 16908288(0x1020000, float:2.387723E-38)
            r9 = 2130772216(0x7f0100f8, float:1.7147544E38)
            r8 = 2130772215(0x7f0100f7, float:1.7147542E38)
            r3 = 1
            r2 = 0
            boolean r0 = r11.p
            if (r0 != 0) goto L_0x003c
            r11.p = r3
            r0 = 2130837587(0x7f020053, float:1.7280132E38)
            android.graphics.drawable.Drawable r0 = r11.a(r12, r0, r2)
            if (r0 == 0) goto L_0x0030
            boolean r1 = r0 instanceof defpackage.hp
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003a
        L_0x002d:
            r0 = r3
        L_0x002e:
            if (r0 != 0) goto L_0x003c
        L_0x0030:
            r11.p = r2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r0.<init>(r1)
            throw r0
        L_0x003a:
            r0 = r2
            goto L_0x002e
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r11.a(r12, r13)
            if (r1 != 0) goto L_0x008a
            android.util.TypedValue r0 = r11.o
            if (r0 != 0) goto L_0x004d
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.o = r0
        L_0x004d:
            android.util.TypedValue r1 = r11.o
            android.content.res.Resources r0 = r12.getResources()
            r0.getValue(r13, r1, r3)
            long r4 = a(r1)
            android.graphics.drawable.Drawable r0 = r11.a(r12, r4)
            if (r0 != 0) goto L_0x0089
            r6 = 2130837518(0x7f02000e, float:1.7279992E38)
            if (r13 != r6) goto L_0x007f
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r7 = 2130837517(0x7f02000d, float:1.727999E38)
            android.graphics.drawable.Drawable r7 = r11.a(r12, r7, r2)
            r6[r2] = r7
            r7 = 2130837519(0x7f02000f, float:1.7279994E38)
            android.graphics.drawable.Drawable r2 = r11.a(r12, r7, r2)
            r6[r3] = r2
            r0.<init>(r6)
        L_0x007f:
            if (r0 == 0) goto L_0x0089
            int r1 = r1.changingConfigurations
            r0.setChangingConfigurations(r1)
            r11.a(r12, r4, r0)
        L_0x0089:
            r1 = r0
        L_0x008a:
            if (r1 != 0) goto L_0x0090
            android.graphics.drawable.Drawable r1 = defpackage.ob.a(r12, r13)
        L_0x0090:
            if (r1 == 0) goto L_0x00b6
            android.content.res.ColorStateList r0 = r11.b(r12, r13)
            if (r0 == 0) goto L_0x00bc
            boolean r2 = defpackage.add.b(r1)
            if (r2 == 0) goto L_0x00a2
            android.graphics.drawable.Drawable r1 = r1.mutate()
        L_0x00a2:
            android.graphics.drawable.Drawable r1 = defpackage.jd.d(r1)
            defpackage.jd.a(r1, r0)
            r0 = 0
            r2 = 2130837571(0x7f020043, float:1.72801E38)
            if (r13 != r2) goto L_0x00b1
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00b1:
            if (r0 == 0) goto L_0x00b6
            defpackage.jd.a(r1, r0)
        L_0x00b6:
            if (r1 == 0) goto L_0x00bb
            defpackage.add.a(r1)
        L_0x00bb:
            return r1
        L_0x00bc:
            r0 = 2130837568(0x7f020040, float:1.7280094E38)
            if (r13 != r0) goto L_0x00f2
            r0 = r1
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r10)
            int r3 = defpackage.agr.a(r12, r8)
            android.graphics.PorterDuff$Mode r4 = c
            a(r2, r3, r4)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r2)
            int r3 = defpackage.agr.a(r12, r8)
            android.graphics.PorterDuff$Mode r4 = c
            a(r2, r3, r4)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r2)
            int r2 = defpackage.agr.a(r12, r9)
            android.graphics.PorterDuff$Mode r3 = c
            a(r0, r2, r3)
            goto L_0x00b6
        L_0x00f2:
            r0 = 2130837559(0x7f020037, float:1.7280075E38)
            if (r13 == r0) goto L_0x0101
            r0 = 2130837558(0x7f020036, float:1.7280073E38)
            if (r13 == r0) goto L_0x0101
            r0 = 2130837560(0x7f020038, float:1.7280078E38)
            if (r13 != r0) goto L_0x0132
        L_0x0101:
            r0 = r1
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r10)
            int r3 = defpackage.agr.c(r12, r8)
            android.graphics.PorterDuff$Mode r4 = c
            a(r2, r3, r4)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r2)
            int r3 = defpackage.agr.a(r12, r9)
            android.graphics.PorterDuff$Mode r4 = c
            a(r2, r3, r4)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r2)
            int r2 = defpackage.agr.a(r12, r9)
            android.graphics.PorterDuff$Mode r3 = c
            a(r0, r2, r3)
            goto L_0x00b6
        L_0x0132:
            boolean r0 = a(r12, r13, r1)
            if (r0 != 0) goto L_0x00b6
            if (r14 == 0) goto L_0x00b6
            r1 = 0
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    private static long a(android.util.TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            r1 = 0
            r8 = 2
            r7 = 1
            qr r0 = r9.m
            if (r0 == 0) goto L_0x00bc
            qr r0 = r9.m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bc
            rj r0 = r9.n
            if (r0 == 0) goto L_0x002f
            rj r0 = r9.n
            java.lang.Object r0 = r0.a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x0036
            qr r2 = r9.m
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0036
        L_0x002d:
            r0 = r1
        L_0x002e:
            return r0
        L_0x002f:
            rj r0 = new rj
            r0.<init>()
            r9.n = r0
        L_0x0036:
            android.util.TypedValue r0 = r9.o
            if (r0 != 0) goto L_0x0041
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.o = r0
        L_0x0041:
            android.util.TypedValue r2 = r9.o
            android.content.res.Resources r0 = r10.getResources()
            r0.getValue(r11, r2, r7)
            long r4 = a(r2)
            android.graphics.drawable.Drawable r1 = r9.a(r10, r4)
            if (r1 == 0) goto L_0x0056
            r0 = r1
            goto L_0x002e
        L_0x0056:
            java.lang.CharSequence r3 = r2.string
            if (r3 == 0) goto L_0x008a
            java.lang.CharSequence r3 = r2.string
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = ".xml"
            boolean r3 = r3.endsWith(r6)
            if (r3 == 0) goto L_0x008a
            android.content.res.XmlResourceParser r3 = r0.getXml(r11)     // Catch:{ Exception -> 0x0082 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0070:
            int r0 = r3.next()     // Catch:{ Exception -> 0x0082 }
            if (r0 == r8) goto L_0x0078
            if (r0 != r7) goto L_0x0070
        L_0x0078:
            if (r0 == r8) goto L_0x0095
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            java.lang.String r2 = "AppCompatDrawableManag"
            java.lang.String r3 = "Exception while inflating drawable"
            android.util.Log.e(r2, r3, r0)
        L_0x008a:
            r0 = r1
        L_0x008b:
            if (r0 != 0) goto L_0x002e
            rj r1 = r9.n
            java.lang.String r2 = "appcompat_skip_skip"
            r1.b(r11, r2)
            goto L_0x002e
        L_0x0095:
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x0082 }
            rj r7 = r9.n     // Catch:{ Exception -> 0x0082 }
            r7.b(r11, r0)     // Catch:{ Exception -> 0x0082 }
            qr r7 = r9.m     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0082 }
            abo r0 = (defpackage.abo) r0     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x00b0
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x0082 }
            android.graphics.drawable.Drawable r1 = r0.a(r10, r3, r6, r7)     // Catch:{ Exception -> 0x0082 }
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            int r0 = r2.changingConfigurations     // Catch:{ Exception -> 0x0082 }
            r1.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0082 }
            r9.a(r10, r4, r1)     // Catch:{ Exception -> 0x0082 }
        L_0x00ba:
            r0 = r1
            goto L_0x008b
        L_0x00bc:
            r0 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable a(android.content.Context r7, long r8) {
        /*
            r6 = this;
            r2 = 0
            java.lang.Object r3 = r6.a
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r6.b     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x002b }
            qx r0 = (defpackage.qx) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            r0 = r2
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.Object r1 = r0.a(r8)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x002e
            android.content.res.Resources r0 = r7.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            goto L_0x0010
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            long[] r1 = r0.c     // Catch:{ all -> 0x002b }
            int r4 = r0.e     // Catch:{ all -> 0x002b }
            int r1 = defpackage.qv.a(r1, r4, r8)     // Catch:{ all -> 0x002b }
            if (r1 < 0) goto L_0x0049
            java.lang.Object[] r4 = r0.d     // Catch:{ all -> 0x002b }
            r4 = r4[r1]     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = defpackage.qx.a     // Catch:{ all -> 0x002b }
            if (r4 == r5) goto L_0x0049
            java.lang.Object[] r4 = r0.d     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = defpackage.qx.a     // Catch:{ all -> 0x002b }
            r4[r1] = r5     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.b = r1     // Catch:{ all -> 0x002b }
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            r0 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private final boolean a(android.content.Context context, long j2, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.a) {
            defpackage.qx qxVar = (defpackage.qx) this.b.get(context);
            if (qxVar == null) {
                qxVar = new defpackage.qx();
                this.b.put(context, qxVar);
            }
            qxVar.a(j2, new java.lang.ref.WeakReference(constantState));
        }
        return true;
    }

    static boolean a(android.content.Context context, int i2, android.graphics.drawable.Drawable drawable) {
        int i3;
        int i4;
        android.graphics.PorterDuff.Mode mode;
        boolean z;
        android.graphics.PorterDuff.Mode mode2 = c;
        if (a(f, i2)) {
            i4 = 2130772215;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(h, i2)) {
            i4 = 2130772216;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(i, i2)) {
            z = true;
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            i4 = 16842801;
            i3 = -1;
        } else if (i2 == 2130837545) {
            i4 = 16842800;
            i3 = java.lang.Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i2 == 2130837521) {
            i4 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i4 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (defpackage.add.b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(defpackage.agr.a(context, i4), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private final void a(java.lang.String str, defpackage.abo abo) {
        if (this.m == null) {
            this.m = new defpackage.qr();
        }
        this.m.put(str, abo);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final android.content.res.ColorStateList b(android.content.Context context, int i2) {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList a2;
        if (this.l != null) {
            defpackage.rj rjVar = (defpackage.rj) this.l.get(context);
            colorStateList = rjVar != null ? (android.content.res.ColorStateList) rjVar.a(i2) : null;
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        if (i2 == 2130837522) {
            a2 = defpackage.xw.a(context, 2131624528);
        } else if (i2 == 2130837572) {
            a2 = defpackage.xw.a(context, 2131624531);
        } else if (i2 == 2130837571) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            android.content.res.ColorStateList b2 = defpackage.agr.b(context, 2130772219);
            if (b2 == null || !b2.isStateful()) {
                iArr[0] = defpackage.agr.a;
                iArr2[0] = defpackage.agr.c(context, 2130772219);
                iArr[1] = defpackage.agr.d;
                iArr2[1] = defpackage.agr.a(context, 2130772216);
                iArr[2] = defpackage.agr.e;
                iArr2[2] = defpackage.agr.a(context, 2130772219);
            } else {
                iArr[0] = defpackage.agr.a;
                iArr2[0] = b2.getColorForState(iArr[0], 0);
                iArr[1] = defpackage.agr.d;
                iArr2[1] = defpackage.agr.a(context, 2130772216);
                iArr[2] = defpackage.agr.e;
                iArr2[2] = b2.getDefaultColor();
            }
            a2 = new android.content.res.ColorStateList(iArr, iArr2);
        } else {
            a2 = i2 == 2130837511 ? c(context, defpackage.agr.a(context, 2130772218)) : i2 == 2130837506 ? c(context, 0) : i2 == 2130837510 ? c(context, defpackage.agr.a(context, 2130772214)) : (i2 == 2130837569 || i2 == 2130837570) ? defpackage.xw.a(context, 2131624530) : a(g, i2) ? defpackage.agr.b(context, 2130772215) : a(j, i2) ? defpackage.xw.a(context, 2131624527) : a(k, i2) ? defpackage.xw.a(context, 2131624526) : i2 == 2130837566 ? defpackage.xw.a(context, 2131624529) : colorStateList;
        }
        if (a2 != null) {
            if (this.l == null) {
                this.l = new java.util.WeakHashMap();
            }
            defpackage.rj rjVar2 = (defpackage.rj) this.l.get(context);
            if (rjVar2 == null) {
                rjVar2 = new defpackage.rj();
                this.l.put(context, rjVar2);
            }
            rjVar2.b(i2, a2);
        }
        return a2;
    }

    private static android.content.res.ColorStateList c(android.content.Context context, int i2) {
        int a2 = defpackage.agr.a(context, 2130772217);
        return new android.content.res.ColorStateList(new int[][]{defpackage.agr.a, defpackage.agr.c, defpackage.agr.b, defpackage.agr.e}, new int[]{defpackage.agr.c(context, 2130772218), defpackage.os.a(a2, i2), defpackage.os.a(a2, i2), i2});
    }

    static void a(android.graphics.drawable.Drawable drawable, defpackage.agu agu, int[] iArr) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
        if (!defpackage.add.b(drawable) || drawable.mutate() == drawable) {
            if (agu.d || agu.c) {
                android.content.res.ColorStateList colorStateList = agu.d ? agu.a : null;
                android.graphics.PorterDuff.Mode mode = agu.c ? agu.b : c;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (android.os.Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    private static android.graphics.PorterDuffColorFilter a(int i2, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) e.a(java.lang.Integer.valueOf(defpackage.abn.a(i2, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = new android.graphics.PorterDuffColorFilter(i2, mode);
        e.a(java.lang.Integer.valueOf(defpackage.abn.a(i2, mode)), porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    private static void a(android.graphics.drawable.Drawable drawable, int i2, android.graphics.PorterDuff.Mode mode) {
        if (defpackage.add.b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = c;
        }
        drawable.setColorFilter(a(i2, mode));
    }
}
