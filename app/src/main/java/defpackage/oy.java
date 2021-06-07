package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: oy  reason: default package */
/* compiled from: PG */
final class oy extends pb {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    oy() {
    }

    private static Object a() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.pb, defpackage.ow
    public final Typeface a(Context context, pz[] pzVarArr, int i) {
        Object a2 = a();
        ri riVar = new ri();
        for (pz pzVar : pzVarArr) {
            Uri uri = pzVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) riVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = jd.a(context, (CancellationSignal) null, uri);
                riVar.put(uri, byteBuffer);
            }
            if (!a(a2, byteBuffer, pzVar.b, pzVar.c, pzVar.d)) {
                return null;
            }
        }
        return Typeface.create(a(a2), i);
    }

    @Override // defpackage.pb, defpackage.ow
    public final Typeface a(Context context, om omVar, Resources resources, int i) {
        Object a2 = a();
        on[] onVarArr = omVar.a;
        for (on onVar : onVarArr) {
            ByteBuffer a3 = jd.a(context, resources, onVar.f);
            if (a3 == null || !a(a2, a3, onVar.e, onVar.b, onVar.c)) {
                return null;
            }
        }
        return a(a2);
    }

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
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
