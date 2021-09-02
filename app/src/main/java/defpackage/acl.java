package defpackage;

/* renamed from: acl reason: default package */
/* compiled from: PG */
final class acl {
    private static final android.graphics.RectF i = new android.graphics.RectF();
    private static java.util.concurrent.ConcurrentHashMap j = new java.util.concurrent.ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final android.content.Context h;
    private android.text.TextPaint k;
    private final android.widget.TextView l;

    acl(android.widget.TextView textView) {
        this.l = textView;
        this.h = this.l.getContext();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        int length = this.f.length;
        this.g = length > 0;
        if (this.g) {
            this.a = 1;
            this.d = (float) this.f[0];
            this.e = (float) this.f[length - 1];
            this.c = -1.0f;
        }
        return this.g;
    }

    static int[] a(int[] iArr) {
        if (r2 != 0) {
            java.util.Arrays.sort(iArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i2)) < 0) {
                    arrayList.add(java.lang.Integer.valueOf(i2));
                }
            }
            if (r2 != arrayList.size()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        if (!e() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                float round = (float) java.lang.Math.round(this.d);
                int i2 = 1;
                while (java.lang.Math.round(this.c + round) <= java.lang.Math.round(this.e)) {
                    i2++;
                    round += this.c;
                }
                int[] iArr = new int[i2];
                float f2 = this.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = java.lang.Math.round(f2);
                    f2 += this.c;
                }
                this.f = a(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r1 != null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r15 = this;
            boolean r0 = r15.d()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            boolean r0 = r15.b
            if (r0 == 0) goto L_0x01b3
            android.widget.TextView r0 = r15.l
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L_0x0006
            android.widget.TextView r0 = r15.l
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0006
            android.widget.TextView r0 = r15.l
            java.lang.String r1 = "getHorizontallyScrolling"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = a(r0, r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006e
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0032:
            android.widget.TextView r1 = r15.l
            int r1 = r1.getHeight()
            android.widget.TextView r2 = r15.l
            int r2 = r2.getCompoundPaddingBottom()
            int r1 = r1 - r2
            android.widget.TextView r2 = r15.l
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 - r2
            if (r0 <= 0) goto L_0x0006
            if (r1 <= 0) goto L_0x0006
            android.graphics.RectF r11 = i
            monitor-enter(r11)
            android.graphics.RectF r2 = i     // Catch:{ all -> 0x006b }
            r2.setEmpty()     // Catch:{ all -> 0x006b }
            android.graphics.RectF r2 = i     // Catch:{ all -> 0x006b }
            float r0 = (float) r0     // Catch:{ all -> 0x006b }
            r2.right = r0     // Catch:{ all -> 0x006b }
            android.graphics.RectF r0 = i     // Catch:{ all -> 0x006b }
            float r1 = (float) r1     // Catch:{ all -> 0x006b }
            r0.bottom = r1     // Catch:{ all -> 0x006b }
            android.graphics.RectF r12 = i     // Catch:{ all -> 0x006b }
            int[] r0 = r15.f     // Catch:{ all -> 0x006b }
            int r0 = r0.length     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0083
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "No available text sizes to choose from."
            r0.<init>(r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            android.widget.TextView r0 = r15.l
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r15.l
            int r1 = r1.getTotalPaddingLeft()
            int r0 = r0 - r1
            android.widget.TextView r1 = r15.l
            int r1 = r1.getTotalPaddingRight()
            int r0 = r0 - r1
            goto L_0x0032
        L_0x0083:
            r10 = 0
            r1 = 1
            int r0 = r0 + -1
            r9 = r0
            r0 = r10
            r10 = r1
        L_0x008a:
            if (r10 > r9) goto L_0x019f
            int r0 = r10 + r9
            int r13 = r0 / 2
            int[] r0 = r15.f     // Catch:{ all -> 0x006b }
            r2 = r0[r13]     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ all -> 0x006b }
            android.widget.TextView r1 = r15.l     // Catch:{ all -> 0x006b }
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x01b8
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            java.lang.CharSequence r1 = r1.getTransformation(r0, r3)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x01b8
        L_0x00aa:
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            int r8 = r0.getMaxLines()     // Catch:{ all -> 0x006b }
            android.text.TextPaint r0 = r15.k     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0162
            android.text.TextPaint r0 = new android.text.TextPaint     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r15.k = r0     // Catch:{ all -> 0x006b }
        L_0x00bb:
            android.text.TextPaint r0 = r15.k     // Catch:{ all -> 0x006b }
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            android.text.TextPaint r3 = r3.getPaint()     // Catch:{ all -> 0x006b }
            r0.set(r3)     // Catch:{ all -> 0x006b }
            android.text.TextPaint r0 = r15.k     // Catch:{ all -> 0x006b }
            float r2 = (float) r2     // Catch:{ all -> 0x006b }
            r0.setTextSize(r2)     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "getLayoutAlignment"
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ all -> 0x006b }
            java.lang.Object r4 = a(r0, r2, r3)     // Catch:{ all -> 0x006b }
            android.text.Layout$Alignment r4 = (android.text.Layout.Alignment) r4     // Catch:{ all -> 0x006b }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x006b }
            r2 = 23
            if (r0 < r2) goto L_0x016b
            float r0 = r12.right     // Catch:{ all -> 0x006b }
            int r2 = java.lang.Math.round(r0)     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "getTextDirectionHeuristic"
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = a(r0, r3, r5)     // Catch:{ all -> 0x006b }
            android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0     // Catch:{ all -> 0x006b }
            r3 = 0
            int r5 = r1.length()     // Catch:{ all -> 0x006b }
            android.text.TextPaint r6 = r15.k     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r1, r3, r5, r6, r2)     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r2 = r2.setAlignment(r4)     // Catch:{ all -> 0x006b }
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            float r3 = r3.getLineSpacingExtra()     // Catch:{ all -> 0x006b }
            android.widget.TextView r4 = r15.l     // Catch:{ all -> 0x006b }
            float r4 = r4.getLineSpacingMultiplier()     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r2 = r2.setLineSpacing(r3, r4)     // Catch:{ all -> 0x006b }
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            boolean r3 = r3.getIncludeFontPadding()     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r2 = r2.setIncludePad(r3)     // Catch:{ all -> 0x006b }
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            int r3 = r3.getBreakStrategy()     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r2 = r2.setBreakStrategy(r3)     // Catch:{ all -> 0x006b }
            android.widget.TextView r3 = r15.l     // Catch:{ all -> 0x006b }
            int r3 = r3.getHyphenationFrequency()     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r3 = r2.setHyphenationFrequency(r3)     // Catch:{ all -> 0x006b }
            r2 = -1
            if (r8 != r2) goto L_0x0169
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0133:
            android.text.StaticLayout$Builder r2 = r3.setMaxLines(r2)     // Catch:{ all -> 0x006b }
            android.text.StaticLayout$Builder r0 = r2.setTextDirection(r0)     // Catch:{ all -> 0x006b }
            android.text.StaticLayout r0 = r0.build()     // Catch:{ all -> 0x006b }
        L_0x013f:
            r2 = -1
            if (r8 == r2) goto L_0x018b
            int r2 = r0.getLineCount()     // Catch:{ all -> 0x006b }
            if (r2 > r8) goto L_0x0158
            int r2 = r0.getLineCount()     // Catch:{ all -> 0x006b }
            int r2 = r2 + -1
            int r2 = r0.getLineEnd(r2)     // Catch:{ all -> 0x006b }
            int r1 = r1.length()     // Catch:{ all -> 0x006b }
            if (r2 == r1) goto L_0x018b
        L_0x0158:
            r0 = 0
        L_0x0159:
            if (r0 == 0) goto L_0x019a
            int r0 = r13 + 1
            r14 = r0
            r0 = r10
            r10 = r14
            goto L_0x008a
        L_0x0162:
            android.text.TextPaint r0 = r15.k     // Catch:{ all -> 0x006b }
            r0.reset()     // Catch:{ all -> 0x006b }
            goto L_0x00bb
        L_0x0169:
            r2 = r8
            goto L_0x0133
        L_0x016b:
            float r0 = r12.right     // Catch:{ all -> 0x006b }
            int r3 = java.lang.Math.round(r0)     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            float r5 = r0.getLineSpacingMultiplier()     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            float r6 = r0.getLineSpacingExtra()     // Catch:{ all -> 0x006b }
            android.widget.TextView r0 = r15.l     // Catch:{ all -> 0x006b }
            boolean r7 = r0.getIncludeFontPadding()     // Catch:{ all -> 0x006b }
            android.text.StaticLayout r0 = new android.text.StaticLayout     // Catch:{ all -> 0x006b }
            android.text.TextPaint r2 = r15.k     // Catch:{ all -> 0x006b }
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006b }
            goto L_0x013f
        L_0x018b:
            int r0 = r0.getHeight()     // Catch:{ all -> 0x006b }
            float r0 = (float) r0     // Catch:{ all -> 0x006b }
            float r1 = r12.bottom     // Catch:{ all -> 0x006b }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0198
            r0 = 0
            goto L_0x0159
        L_0x0198:
            r0 = 1
            goto L_0x0159
        L_0x019a:
            int r0 = r13 + -1
            r9 = r0
            goto L_0x008a
        L_0x019f:
            int[] r1 = r15.f     // Catch:{ all -> 0x006b }
            r0 = r1[r0]     // Catch:{ all -> 0x006b }
            float r0 = (float) r0     // Catch:{ all -> 0x006b }
            android.widget.TextView r1 = r15.l     // Catch:{ all -> 0x006b }
            float r1 = r1.getTextSize()     // Catch:{ all -> 0x006b }
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01b2
            r1 = 0
            r15.a(r1, r0)     // Catch:{ all -> 0x006b }
        L_0x01b2:
            monitor-exit(r11)     // Catch:{ all -> 0x006b }
        L_0x01b3:
            r0 = 1
            r15.b = r0
            goto L_0x0006
        L_0x01b8:
            r1 = r0
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acl.c():void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, float f2) {
        android.content.res.Resources resources;
        boolean z;
        if (this.h == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = this.h.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(applyDimension);
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                z = this.l.isInLayout();
            } else {
                z = false;
            }
            if (this.l.getLayout() != null) {
                this.b = false;
                try {
                    java.lang.reflect.Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.l, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception e2) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!z) {
                    this.l.requestLayout();
                } else {
                    this.l.forceLayout();
                }
                this.l.invalidate();
            }
        }
    }

    private static java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        try {
            obj2 = a(str).invoke(obj, new java.lang.Object[0]);
            if (obj2 == null) {
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
        }
        return obj2;
    }

    private static java.lang.reflect.Method a(java.lang.String str) {
        try {
            java.lang.reflect.Method method = (java.lang.reflect.Method) j.get(str);
            if (method != null) {
                return method;
            }
            java.lang.reflect.Method declaredMethod = android.widget.TextView.class.getDeclaredMethod(str, new java.lang.Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            j.put(str, declaredMethod);
            return declaredMethod;
        } catch (java.lang.Exception e2) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return e() && this.a != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return !(this.l instanceof defpackage.abq);
    }
}
