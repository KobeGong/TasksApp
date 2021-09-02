package defpackage;

/* renamed from: oz reason: default package */
/* compiled from: PG */
public class oz extends defpackage.ox {
    public final java.lang.Class a;
    public final java.lang.reflect.Method b;
    private final java.lang.reflect.Constructor c;
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;
    private final java.lang.reflect.Method f;
    private final java.lang.reflect.Method g;

    public oz() {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Constructor constructor;
        java.lang.Class cls;
        java.lang.reflect.Method method5 = null;
        try {
            java.lang.Class cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor constructor2 = cls2.getConstructor(new java.lang.Class[0]);
            java.lang.reflect.Method method6 = cls2.getMethod("addFontFromAssetManager", new java.lang.Class[]{android.content.res.AssetManager.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class});
            java.lang.reflect.Method method7 = cls2.getMethod("addFontFromBuffer", new java.lang.Class[]{java.nio.ByteBuffer.class, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            java.lang.reflect.Method method8 = cls2.getMethod("freeze", new java.lang.Class[0]);
            java.lang.reflect.Method method9 = cls2.getMethod("abortCreation", new java.lang.Class[0]);
            method = a(cls2);
            method5 = method9;
            method2 = method8;
            method3 = method7;
            method4 = method6;
            constructor = constructor2;
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            constructor = null;
            cls = null;
        }
        this.a = cls;
        this.c = constructor;
        this.d = method4;
        this.e = method3;
        this.f = method2;
        this.g = method5;
        this.b = method;
    }

    private final boolean a() {
        if (this.d == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.d != null;
    }

    private final java.lang.Object b() {
        try {
            return this.c.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private final boolean a(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.d.invoke(obj, new java.lang.Object[]{context.getAssets(), str, java.lang.Integer.valueOf(0), java.lang.Boolean.valueOf(false), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private final boolean a(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((java.lang.Boolean) this.e.invoke(obj, new java.lang.Object[]{byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)})).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public android.graphics.Typeface a(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(this.a, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.b.invoke(null, new java.lang.Object[]{newInstance, java.lang.Integer.valueOf(-1), java.lang.Integer.valueOf(-1)});
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private final boolean b(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f.invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private final void c(java.lang.Object obj) {
        try {
            this.g.invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final android.graphics.Typeface a(android.content.Context context, defpackage.om omVar, android.content.res.Resources resources, int i) {
        defpackage.on[] onVarArr;
        if (!a()) {
            return super.a(context, omVar, resources, i);
        }
        java.lang.Object b2 = b();
        for (defpackage.on onVar : omVar.a) {
            if (!a(context, b2, onVar.a, onVar.e, onVar.b, onVar.c ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(onVar.d))) {
                c(b2);
                return null;
            }
        }
        if (!b(b2)) {
            return null;
        }
        return a(b2);
    }

    public final android.graphics.Typeface a(android.content.Context context, defpackage.pz[] pzVarArr, int i) {
        android.os.ParcelFileDescriptor openFileDescriptor;
        java.lang.Throwable th;
        if (pzVarArr.length <= 0) {
            return null;
        }
        if (!a()) {
            defpackage.pz a2 = defpackage.pb.a(pzVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.a, "r", null);
                th = null;
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.c).setItalic(a2.d).build();
                    if (openFileDescriptor == null) {
                        return build;
                    }
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable th2) {
                    java.lang.Throwable th3 = th2;
                    th = r0;
                    th = th3;
                }
            } catch (java.io.IOException e2) {
                return null;
            }
        } else {
            java.util.Map a3 = defpackage.pt.a(context, pzVarArr, (android.os.CancellationSignal) null);
            java.lang.Object b2 = b();
            boolean z = false;
            for (defpackage.pz pzVar : pzVarArr) {
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) a3.get(pzVar.a);
                if (byteBuffer != null) {
                    if (!a(b2, byteBuffer, pzVar.b, pzVar.c, pzVar.d ? 1 : 0)) {
                        c(b2);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                c(b2);
                return null;
            } else if (!b(b2)) {
                return null;
            } else {
                return android.graphics.Typeface.create(a(b2), i);
            }
        }
        throw th;
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th4) {
                    defpackage.cza.a(th, th4);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th;
    }

    public final android.graphics.Typeface a(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        if (!a()) {
            return super.a(context, resources, i, str, i2);
        }
        java.lang.Object b2 = b();
        if (!a(context, b2, str, 0, -1, -1, null)) {
            c(b2);
            return null;
        } else if (b(b2)) {
            return a(b2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public java.lang.reflect.Method a(java.lang.Class cls) {
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new java.lang.Class[]{java.lang.reflect.Array.newInstance(cls, 1).getClass(), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
