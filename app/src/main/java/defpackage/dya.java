package defpackage;

/* renamed from: dya reason: default package */
/* compiled from: PG */
public final class dya implements defpackage.dwe {
    public static final java.lang.RuntimeException a;
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.dya.class.getName());
    private static final java.lang.reflect.Constructor c;
    private static final java.lang.reflect.Method d;
    private final java.lang.Object e;

    public dya() {
        if (a != null) {
            throw a;
        }
        try {
            this.e = c.newInstance(new java.lang.Object[0]);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.RuntimeException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    public final void a() {
        try {
            d.invoke(this.e, new java.lang.Object[]{java.lang.Long.valueOf(1)});
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[ADDED_TO_REGION] */
    static {
        /*
            r1 = 0
            r7 = 0
            java.lang.Class<dya> r0 = defpackage.dya.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            java.lang.String r0 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x004e }
            java.lang.String r0 = "add"
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x004e }
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x004e }
            r3[r4] = r5     // Catch:{ Throwable -> 0x004e }
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch:{ Throwable -> 0x004e }
            java.lang.String r3 = "sum"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x006c }
            r2.getMethod(r3, r4)     // Catch:{ Throwable -> 0x006c }
            java.lang.reflect.Constructor[] r3 = r2.getConstructors()     // Catch:{ Throwable -> 0x006c }
            int r4 = r3.length     // Catch:{ Throwable -> 0x006c }
            r2 = r1
        L_0x0030:
            if (r2 >= r4) goto L_0x004b
            r1 = r3[r2]     // Catch:{ Throwable -> 0x006c }
            java.lang.Class[] r5 = r1.getParameterTypes()     // Catch:{ Throwable -> 0x006c }
            int r5 = r5.length     // Catch:{ Throwable -> 0x006c }
            if (r5 != 0) goto L_0x0047
            r5 = r7
        L_0x003c:
            if (r5 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            c = r1
            d = r0
            a = r7
        L_0x0046:
            return
        L_0x0047:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0030
        L_0x004b:
            r5 = r7
            r1 = r7
            goto L_0x003c
        L_0x004e:
            r5 = move-exception
            r6 = r7
        L_0x0050:
            java.util.logging.Logger r0 = b
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            java.lang.String r2 = "io.grpc.internal.ReflectionLongAdderCounter"
            java.lang.String r3 = "<clinit>"
            java.lang.String r4 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r0.logp(r1, r2, r3, r4, r5)
            r0 = r6
            r1 = r7
            goto L_0x003c
        L_0x0060:
            c = r7
            d = r7
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            a = r0
            goto L_0x0046
        L_0x006c:
            r5 = move-exception
            r6 = r0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dya.<clinit>():void");
    }
}
