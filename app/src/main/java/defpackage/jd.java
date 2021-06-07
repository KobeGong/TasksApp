package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.AttributedCharacterIterator;
import java.text.CharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jd  reason: default package */
/* compiled from: PG */
public final class jd {
    private static Method d;
    private static boolean e;
    private static Method f;
    private static boolean g;
    public Appendable a;
    public int b;
    public List c;

    jd() {
    }

    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String b2 = b(activity);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b2);
        try {
            if (b(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
            return null;
        }
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b2);
        if (b(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String b(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static String b(Context context, ComponentName componentName) {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static Bundle a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        return nl.a(notification);
    }

    public static int a(Context context, String str, int i, int i2, String str2) {
        String str3;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str3 = AppOpsManager.permissionToOp(str);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i3 = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str3, str2);
        } else {
            i3 = 1;
        }
        if (i3 != 0) {
            return -2;
        }
        return 0;
    }

    public static int a(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static List a(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList2.add(a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList2.add(a(resources.getStringArray(i)));
                    arrayList = arrayList2;
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    private static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, (op) null, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, op opVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, opVar, z);
        if (a2 != null || opVar != null) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r12, android.content.res.Resources r13, android.util.TypedValue r14, int r15, int r16, defpackage.op r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 567
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, op, boolean):android.graphics.Typeface");
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f2) {
        return !a(xmlPullParser, str) ? f2 : typedArray.getFloat(i, f2);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static TypedValue a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static float[] a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(i, length));
        return fArr2;
    }

    public static Path a(String str) {
        Path path = new Path();
        ou[] b2 = b(str);
        if (b2 == null) {
            return null;
        }
        try {
            ou.a(b2, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static ou[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                    break;
                }
                i3++;
            }
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), d(trim));
            }
            i = i3 + 1;
            i2 = i3;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (ou[]) arrayList.toArray(new ou[arrayList.size()]);
    }

    public static ou[] a(ou[] ouVarArr) {
        if (ouVarArr == null) {
            return null;
        }
        ou[] ouVarArr2 = new ou[ouVarArr.length];
        for (int i = 0; i < ouVarArr.length; i++) {
            ouVarArr2[i] = new ou(ouVarArr[i]);
        }
        return ouVarArr2;
    }

    public static boolean a(ou[] ouVarArr, ou[] ouVarArr2) {
        if (ouVarArr == null || ouVarArr2 == null || ouVarArr.length != ouVarArr2.length) {
            return false;
        }
        for (int i = 0; i < ouVarArr.length; i++) {
            if (!(ouVarArr[i].a == ouVarArr2[i].a && ouVarArr[i].b.length == ouVarArr2[i].b.length)) {
                return false;
            }
        }
        return true;
    }

    private static void a(ArrayList arrayList, char c2, float[] fArr) {
        arrayList.add(new ou(c2, fArr));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] d(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.d(java.lang.String):float[]");
    }

    public static File a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException e2) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer a(java.io.File r9) {
        /*
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0026 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x0026 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ Throwable -> 0x001a, all -> 0x0032 }
            long r4 = r0.size()     // Catch:{ Throwable -> 0x001a, all -> 0x0032 }
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x001a, all -> 0x0032 }
            r2 = 0
            java.nio.MappedByteBuffer r0 = r0.map(r1, r2, r4)     // Catch:{ Throwable -> 0x001a, all -> 0x0032 }
            r7.close()
        L_0x0019:
            return r0
        L_0x001a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001c }
        L_0x001c:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0020:
            if (r1 == 0) goto L_0x002e
            r7.close()     // Catch:{ Throwable -> 0x0029 }
        L_0x0025:
            throw r0
        L_0x0026:
            r0 = move-exception
            r0 = r6
            goto L_0x0019
        L_0x0029:
            r2 = move-exception
            defpackage.cza.a(r1, r2)
            goto L_0x0025
        L_0x002e:
            r7.close()
            goto L_0x0025
        L_0x0032:
            r0 = move-exception
            r1 = r6
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0068, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0069, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[ExcHandler: all (th java.lang.Throwable)] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(android.content.Context r10, android.os.CancellationSignal r11, android.net.Uri r12) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static ByteBuffer a(Context context, Resources resources, int i) {
        File a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!a(a2, resources, i)) {
                return null;
            }
            ByteBuffer a3 = a(a2);
            a2.delete();
            return a3;
        } finally {
            a2.delete();
        }
    }

    public static boolean a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        Throwable th;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        a((Closeable) fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a((Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) fileOutputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a((Closeable) fileOutputStream);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            a((Closeable) fileOutputStream);
            throw th;
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        InputStream inputStream = null;
        try {
            inputStream = resources.openRawResource(i);
            return a(file, inputStream);
        } finally {
            a((Closeable) inputStream);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }

    public static void a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void a(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof pf) {
            ((pf) drawable).setTint(i);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof pf) {
            ((pf) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof pf) {
            ((pf) drawable).setTintMode(mode);
        }
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof pf)) {
                return new pm(drawable);
            }
            return drawable;
        } else if (Build.VERSION.SDK_INT >= 19) {
            if (!(drawable instanceof pf)) {
                return new pk(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof pf)) {
            return new ph(drawable);
        } else {
            return drawable;
        }
    }

    public static boolean b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            e = true;
        }
        if (d != null) {
            try {
                d.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e3) {
                d = null;
            }
        }
        return false;
    }

    public static int e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!g) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            g = true;
        }
        if (f != null) {
            try {
                return ((Integer) f.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                f = null;
            }
        }
        return 0;
    }

    public static boolean a() {
        return Build.VERSION.CODENAME.equals("P");
    }

    public static void c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static int a(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(i, i2);
        }
        return -8388609 & i;
    }

    public jd(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
        this.c = null;
    }

    public jd(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    public final void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e2) {
            throw new bs(e2);
        }
    }

    private static int a(Appendable appendable, CharacterIterator characterIterator) {
        try {
            int beginIndex = characterIterator.getBeginIndex();
            int endIndex = characterIterator.getEndIndex();
            int i = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                appendable.append(characterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    }
                    appendable.append(characterIterator.next());
                }
            }
            return i;
        } catch (IOException e2) {
            throw new bs(e2);
        }
    }

    public final void a(Format format, Object obj) {
        if (this.c == null) {
            a((CharSequence) format.format(obj));
            return;
        }
        AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        this.b += a(this.a, (CharacterIterator) formatToCharacterIterator);
        formatToCharacterIterator.first();
        int index = formatToCharacterIterator.getIndex();
        int endIndex = formatToCharacterIterator.getEndIndex();
        int i2 = i - index;
        int i3 = index;
        while (i3 < endIndex) {
            Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
            int runLimit = formatToCharacterIterator.getRunLimit();
            if (attributes.size() != 0) {
                for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                    this.c.add(new lf(entry.getKey(), entry.getValue(), i2 + i3, i2 + runLimit));
                }
            }
            formatToCharacterIterator.setIndex(runLimit);
            i3 = runLimit;
        }
    }

    public final void a(Format format, Object obj, String str) {
        if (this.c != null || str == null) {
            a(format, obj);
        } else {
            a((CharSequence) str);
        }
    }
}
