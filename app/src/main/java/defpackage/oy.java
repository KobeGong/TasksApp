package defpackage;

/* renamed from: oy reason: default package */
/* compiled from: PG */
final class oy extends defpackage.pb {
    public static final java.lang.reflect.Method a;
    private static final java.lang.Class b;
    private static final java.lang.reflect.Constructor c;
    private static final java.lang.reflect.Method d;

    oy() {
    }

    private static java.lang.Object a() {
        try {
            return c.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static boolean a(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((java.lang.Boolean) a.invoke(obj, new java.lang.Object[]{byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z)})).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static android.graphics.Typeface a(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(b, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) d.invoke(null, new java.lang.Object[]{newInstance});
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final android.graphics.Typeface a(android.content.Context context, defpackage.pz[] pzVarArr, int i) {
        java.lang.Object a2 = a();
        defpackage.ri riVar = new defpackage.ri();
        for (defpackage.pz pzVar : pzVarArr) {
            android.net.Uri uri = pzVar.a;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) riVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = defpackage.jd.a(context, (android.os.CancellationSignal) null, uri);
                riVar.put(uri, byteBuffer);
            }
            if (!a(a2, byteBuffer, pzVar.b, pzVar.c, pzVar.d)) {
                return null;
            }
        }
        return android.graphics.Typeface.create(a(a2), i);
    }

    public final android.graphics.Typeface a(android.content.Context context, defpackage.om omVar, android.content.res.Resources resources, int i) {
        defpackage.on[] onVarArr;
        java.lang.Object a2 = a();
        for (defpackage.on onVar : omVar.a) {
            java.nio.ByteBuffer a3 = defpackage.jd.a(context, resources, onVar.f);
            if (a3 == null || !a(a2, a3, onVar.e, onVar.b, onVar.c)) {
                return null;
            }
        }
        return a(a2);
    }

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor constructor;
        java.lang.Class cls;
        java.lang.reflect.Method method2 = null;
        try {
            java.lang.Class cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor constructor2 = cls2.getConstructor(new java.lang.Class[0]);
            java.lang.reflect.Method method3 = cls2.getMethod("addFontWeightStyle", new java.lang.Class[]{java.nio.ByteBuffer.class, java.lang.Integer.TYPE, java.util.List.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE});
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", new java.lang.Class[]{java.lang.reflect.Array.newInstance(cls2, 1).getClass()});
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            constructor = null;
            cls = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }
}
