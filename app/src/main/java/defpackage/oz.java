package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: oz  reason: default package */
/* compiled from: PG */
public class oz extends ox {
    public final Class a;
    public final Method b;
    private final Constructor c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;

    public oz() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Class<?> cls;
        Method method5 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method6 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            Method method7 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            Method method8 = cls2.getMethod("freeze", new Class[0]);
            Method method9 = cls2.getMethod("abortCreation", new Class[0]);
            method = a((Class) cls2);
            method5 = method9;
            method2 = method8;
            method3 = method7;
            method4 = method6;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
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
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.d != null;
    }

    private final Object b() {
        try {
            return this.c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.d.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.b.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final boolean b(Object obj) {
        try {
            return ((Boolean) this.f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final void c(Object obj) {
        try {
            this.g.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.pb, defpackage.ow
    public final Typeface a(Context context, om omVar, Resources resources, int i) {
        if (!a()) {
            return super.a(context, omVar, resources, i);
        }
        Object b2 = b();
        on[] onVarArr = omVar.a;
        for (on onVar : onVarArr) {
            if (!a(context, b2, onVar.a, onVar.e, onVar.b, onVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(onVar.d))) {
                c(b2);
                return null;
            }
        }
        if (!b(b2)) {
            return null;
        }
        return a(b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r0 = th;
     */
    @Override // defpackage.pb, defpackage.ow, defpackage.ox
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface a(android.content.Context r11, defpackage.pz[] r12, int r13) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz.a(android.content.Context, pz[], int):android.graphics.Typeface");
    }

    @Override // defpackage.pb, defpackage.ow
    public final Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!a()) {
            return super.a(context, resources, i, str, i2);
        }
        Object b2 = b();
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
    public Method a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
