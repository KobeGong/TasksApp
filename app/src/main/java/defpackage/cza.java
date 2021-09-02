package defpackage;

/* renamed from: cza reason: default package */
/* compiled from: PG */
public final class cza {
    public static final defpackage.czb a;

    public static void a(java.lang.Throwable th, java.lang.Throwable th2) {
        a.a(th, th2);
    }

    public static void a(java.lang.Throwable th, java.io.PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    public static void a(java.lang.Throwable th, java.io.PrintStream printStream) {
        a.a(th, printStream);
    }

    private static java.lang.Integer a() {
        try {
            return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Exception e) {
            java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(java.lang.System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r1 = 0
            java.lang.Integer r0 = a()     // Catch:{ Throwable -> 0x006f }
            if (r0 == 0) goto L_0x001c
            int r1 = r0.intValue()     // Catch:{ Throwable -> 0x002d }
            r2 = 19
            if (r1 < r2) goto L_0x001c
            czg r1 = new czg     // Catch:{ Throwable -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x002d }
        L_0x0014:
            a = r1
            if (r0 == 0) goto L_0x001b
            r0.intValue()
        L_0x001b:
            return
        L_0x001c:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ Throwable -> 0x002d }
            if (r1 != 0) goto L_0x0067
            r1 = 1
        L_0x0025:
            if (r1 == 0) goto L_0x0069
            cze r1 = new cze     // Catch:{ Throwable -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x002d }
            goto L_0x0014
        L_0x002d:
            r1 = move-exception
        L_0x002e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<czf> r3 = defpackage.czf.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 132
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "will be used. The error is: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            czf r1 = new czf
            r1.<init>()
            goto L_0x0014
        L_0x0067:
            r1 = 0
            goto L_0x0025
        L_0x0069:
            czf r1 = new czf     // Catch:{ Throwable -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x002d }
            goto L_0x0014
        L_0x006f:
            r0 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cza.<clinit>():void");
    }
}
