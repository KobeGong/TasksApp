package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: pb  reason: default package */
/* compiled from: PG */
public class pb implements ow {
    pb() {
    }

    private static Object a(Object[] objArr, int i, pe peVar) {
        boolean z;
        int i2;
        Object obj;
        int i3 = (i & 1) == 0 ? 400 : 700;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj2 = null;
        int i4 = Integer.MAX_VALUE;
        int length = objArr.length;
        int i5 = 0;
        while (i5 < length) {
            Object obj3 = objArr[i5];
            int abs = Math.abs(peVar.b(obj3) - i3) << 1;
            if (peVar.a(obj3) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i6 = i2 + abs;
            if (obj2 == null || i4 > i6) {
                i4 = i6;
                obj = obj3;
            } else {
                obj = obj2;
            }
            i5++;
            obj2 = obj;
        }
        return obj2;
    }

    protected static pz a(pz[] pzVarArr, int i) {
        return (pz) a(pzVarArr, i, new pc());
    }

    protected static Typeface a(Context context, InputStream inputStream) {
        File a = jd.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!jd.a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            a.delete();
        }
    }

    @Override // defpackage.ow
    public Typeface a(Context context, pz[] pzVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        Typeface typeface = null;
        if (pzVarArr.length > 0) {
            try {
                inputStream = context.getContentResolver().openInputStream(a(pzVarArr, i).a);
                try {
                    typeface = a(context, inputStream);
                    jd.a((Closeable) inputStream);
                } catch (IOException e) {
                    jd.a((Closeable) inputStream);
                    return typeface;
                } catch (Throwable th2) {
                    th = th2;
                    jd.a((Closeable) inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                inputStream = null;
                jd.a((Closeable) inputStream);
                return typeface;
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
                jd.a((Closeable) inputStream);
                throw th;
            }
        }
        return typeface;
    }

    @Override // defpackage.ow
    public Typeface a(Context context, om omVar, Resources resources, int i) {
        on onVar = (on) a(omVar.a, i, new pd());
        if (onVar == null) {
            return null;
        }
        return ov.a(context, resources, onVar.f, onVar.a, i);
    }

    @Override // defpackage.ow
    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a = jd.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!jd.a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            a.delete();
        }
    }
}
