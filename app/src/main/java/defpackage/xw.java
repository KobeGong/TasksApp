package defpackage;

/* renamed from: xw reason: default package */
/* compiled from: PG */
public final class xw {
    private static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    private static final java.util.WeakHashMap b = new java.util.WeakHashMap(0);
    private static final java.lang.Object c = new java.lang.Object();

    public static android.content.res.ColorStateList a(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        android.content.res.ColorStateList d = d(context, i);
        if (d != null) {
            return d;
        }
        android.content.res.ColorStateList c2 = c(context, i);
        if (c2 == null) {
            return defpackage.ob.b(context, i);
        }
        synchronized (c) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new defpackage.xx(c2, context.getResources().getConfiguration()));
        }
        return c2;
    }

    public static android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        return defpackage.abl.a().a(context, i, false);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [int[][]] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35, types: [int[][]] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r1v39, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x009f, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x009f, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v5
      assigns: []
      uses: []
      mth insns count: 154
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
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList c(android.content.Context r18, int r19) {
        /*
            android.content.res.Resources r2 = r18.getResources()
            java.lang.ThreadLocal r1 = a
            java.lang.Object r1 = r1.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L_0x0018
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            java.lang.ThreadLocal r3 = a
            r3.set(r1)
        L_0x0018:
            r3 = 1
            r0 = r19
            r2.getValue(r0, r1, r3)
            int r2 = r1.type
            r3 = 28
            if (r2 < r3) goto L_0x002f
            int r1 = r1.type
            r2 = 31
            if (r1 > r2) goto L_0x002f
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0031
            r1 = 0
        L_0x002e:
            return r1
        L_0x002f:
            r1 = 0
            goto L_0x002b
        L_0x0031:
            android.content.res.Resources r9 = r18.getResources()
            r0 = r19
            android.content.res.XmlResourceParser r10 = r9.getXml(r0)
            android.content.res.Resources$Theme r11 = r18.getTheme()     // Catch:{ Exception -> 0x0058 }
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r10)     // Catch:{ Exception -> 0x0058 }
        L_0x0043:
            int r1 = r10.next()     // Catch:{ Exception -> 0x0058 }
            r2 = 2
            if (r1 == r2) goto L_0x004d
            r2 = 1
            if (r1 != r2) goto L_0x0043
        L_0x004d:
            r2 = 2
            if (r1 == r2) goto L_0x0062
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = "No start tag found"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0058 }
            throw r1     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            java.lang.String r2 = "AppCompatResources"
            java.lang.String r3 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.e(r2, r3, r1)
            r1 = 0
            goto L_0x002e
        L_0x0062:
            java.lang.String r1 = r10.getName()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x0058 }
            if (r2 != 0) goto L_0x008f
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
            r3.<init>()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r4 = r10.getPositionDescription()     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r4 = ": invalid color state list tag "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0058 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0058 }
            throw r2     // Catch:{ Exception -> 0x0058 }
        L_0x008f:
            int r1 = r10.getDepth()     // Catch:{ Exception -> 0x0058 }
            int r13 = r1 + 1
            r1 = 20
            int[][] r3 = new int[r1][]     // Catch:{ Exception -> 0x0058 }
            r1 = 20
            int[] r4 = new int[r1]     // Catch:{ Exception -> 0x0058 }
            r1 = 0
            r8 = r1
        L_0x009f:
            int r1 = r10.next()     // Catch:{ Exception -> 0x0058 }
            r2 = 1
            if (r1 == r2) goto L_0x0185
            int r2 = r10.getDepth()     // Catch:{ Exception -> 0x0058 }
            if (r2 >= r13) goto L_0x00af
            r5 = 3
            if (r1 == r5) goto L_0x0185
        L_0x00af:
            r5 = 2
            if (r1 != r5) goto L_0x009f
            if (r2 > r13) goto L_0x009f
            java.lang.String r1 = r10.getName()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = "item"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x009f
            int[] r1 = defpackage.xu.aA     // Catch:{ Exception -> 0x0058 }
            if (r11 != 0) goto L_0x011b
            android.content.res.TypedArray r1 = r9.obtainAttributes(r12, r1)     // Catch:{ Exception -> 0x0058 }
            r2 = r1
        L_0x00c9:
            int r1 = defpackage.xu.aD     // Catch:{ Exception -> 0x0058 }
            r5 = -65281(0xffffffffffff00ff, float:NaN)
            int r14 = r2.getColor(r1, r5)     // Catch:{ Exception -> 0x0058 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r5 = defpackage.xu.aC     // Catch:{ Exception -> 0x0058 }
            boolean r5 = r2.hasValue(r5)     // Catch:{ Exception -> 0x0058 }
            if (r5 == 0) goto L_0x0123
            int r1 = defpackage.xu.aC     // Catch:{ Exception -> 0x0058 }
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.getFloat(r1, r5)     // Catch:{ Exception -> 0x0058 }
            r7 = r1
        L_0x00e5:
            r2.recycle()     // Catch:{ Exception -> 0x0058 }
            r2 = 0
            int r15 = r12.getAttributeCount()     // Catch:{ Exception -> 0x0058 }
            int[] r0 = new int[r15]     // Catch:{ Exception -> 0x0058 }
            r16 = r0
            r1 = 0
            r6 = r1
        L_0x00f3:
            if (r6 >= r15) goto L_0x0137
            int r5 = r12.getAttributeNameResource(r6)     // Catch:{ Exception -> 0x0058 }
            r1 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r5 == r1) goto L_0x019e
            r1 = 16843551(0x101031f, float:2.3695797E-38)
            if (r5 == r1) goto L_0x019e
            r1 = 2130772323(0x7f010163, float:1.7147761E38)
            if (r5 == r1) goto L_0x019e
            int r1 = r2 + 1
            r17 = 0
            r0 = r17
            boolean r17 = r12.getAttributeBooleanValue(r6, r0)     // Catch:{ Exception -> 0x0058 }
            if (r17 == 0) goto L_0x0135
        L_0x0114:
            r16[r2] = r5     // Catch:{ Exception -> 0x0058 }
        L_0x0116:
            int r2 = r6 + 1
            r6 = r2
            r2 = r1
            goto L_0x00f3
        L_0x011b:
            r2 = 0
            r5 = 0
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r2, r5)     // Catch:{ Exception -> 0x0058 }
            r2 = r1
            goto L_0x00c9
        L_0x0123:
            int r5 = defpackage.xu.aB     // Catch:{ Exception -> 0x0058 }
            boolean r5 = r2.hasValue(r5)     // Catch:{ Exception -> 0x0058 }
            if (r5 == 0) goto L_0x01a1
            int r1 = defpackage.xu.aB     // Catch:{ Exception -> 0x0058 }
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.getFloat(r1, r5)     // Catch:{ Exception -> 0x0058 }
            r7 = r1
            goto L_0x00e5
        L_0x0135:
            int r5 = -r5
            goto L_0x0114
        L_0x0137:
            r0 = r16
            int[] r5 = android.util.StateSet.trimStateSet(r0, r2)     // Catch:{ Exception -> 0x0058 }
            int r1 = android.graphics.Color.alpha(r14)     // Catch:{ Exception -> 0x0058 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0058 }
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)     // Catch:{ Exception -> 0x0058 }
            int r6 = defpackage.os.b(r14, r1)     // Catch:{ Exception -> 0x0058 }
            int r1 = r8 + 1
            int r2 = r4.length     // Catch:{ Exception -> 0x0058 }
            if (r1 <= r2) goto L_0x019c
            int r1 = defpackage.ba.a(r8)     // Catch:{ Exception -> 0x0058 }
            int[] r1 = new int[r1]     // Catch:{ Exception -> 0x0058 }
            r2 = 0
            r7 = 0
            java.lang.System.arraycopy(r4, r2, r1, r7, r8)     // Catch:{ Exception -> 0x0058 }
            r2 = r1
        L_0x015c:
            r2[r8] = r6     // Catch:{ Exception -> 0x0058 }
            int r1 = r8 + 1
            int r4 = r3.length     // Catch:{ Exception -> 0x0058 }
            if (r1 <= r4) goto L_0x019a
            java.lang.Class r1 = r3.getClass()     // Catch:{ Exception -> 0x0058 }
            java.lang.Class r1 = r1.getComponentType()     // Catch:{ Exception -> 0x0058 }
            int r4 = defpackage.ba.a(r8)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ Exception -> 0x0058 }
            r4 = 0
            r6 = 0
            java.lang.System.arraycopy(r3, r4, r1, r6, r8)     // Catch:{ Exception -> 0x0058 }
        L_0x017a:
            r1[r8] = r5     // Catch:{ Exception -> 0x0058 }
            int[][] r1 = (int[][]) r1     // Catch:{ Exception -> 0x0058 }
            int r3 = r8 + 1
            r8 = r3
            r4 = r2
            r3 = r1
            goto L_0x009f
        L_0x0185:
            int[] r2 = new int[r8]     // Catch:{ Exception -> 0x0058 }
            int[][] r5 = new int[r8][]     // Catch:{ Exception -> 0x0058 }
            r1 = 0
            r6 = 0
            java.lang.System.arraycopy(r4, r1, r2, r6, r8)     // Catch:{ Exception -> 0x0058 }
            r1 = 0
            r4 = 0
            java.lang.System.arraycopy(r3, r1, r5, r4, r8)     // Catch:{ Exception -> 0x0058 }
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList     // Catch:{ Exception -> 0x0058 }
            r1.<init>(r5, r2)     // Catch:{ Exception -> 0x0058 }
            goto L_0x002e
        L_0x019a:
            r1 = r3
            goto L_0x017a
        L_0x019c:
            r2 = r4
            goto L_0x015c
        L_0x019e:
            r1 = r2
            goto L_0x0116
        L_0x01a1:
            r7 = r1
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList d(android.content.Context r5, int r6) {
        /*
            java.lang.Object r2 = c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            int r1 = r0.size()     // Catch:{ all -> 0x0035 }
            if (r1 <= 0) goto L_0x0032
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0035 }
            xx r1 = (defpackage.xx) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r1.b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r5.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            android.content.res.ColorStateList r0 = r1.a     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            return r0
        L_0x002f:
            r0.remove(r6)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r0 = 0
            goto L_0x002e
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
