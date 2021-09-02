package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;

/* renamed from: jd reason: default package */
/* compiled from: PG */
public final class jd {
    private static java.lang.reflect.Method d;
    private static boolean e;
    private static java.lang.reflect.Method f;
    private static boolean g;
    public java.lang.Appendable a;
    public int b;
    public java.util.List c;

    jd() {
    }

    public static android.content.Intent a(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        java.lang.String b2 = b(activity);
        if (b2 == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(activity, b2);
        try {
            if (b((Context) activity, componentName) == null) {
                return android.content.Intent.makeMainActivity(componentName);
            }
            return new android.content.Intent().setComponent(componentName);
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            android.util.Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
            return null;
        }
    }

    public static android.content.Intent a(Context context, android.content.ComponentName componentName) {
        java.lang.String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), b2);
        if (b(context, componentName2) == null) {
            return android.content.Intent.makeMainActivity(componentName2);
        }
        return new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String b(android.app.Activity activity) {
        try {
            return b((Context) activity, activity.getComponentName());
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    private static java.lang.String b(Context context, android.content.ComponentName componentName) {
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        java.lang.String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static android.os.Bundle a(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        return defpackage.nl.a(notification);
    }

    public static int a(Context context, java.lang.String str, int i, int i2, java.lang.String str2) {
        java.lang.String str3;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            str3 = android.app.AppOpsManager.permissionToOp(str);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return 0;
        }
        if (str2 == null) {
            java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            i3 = ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOpNoThrow(str3, str2);
        } else {
            i3 = 1;
        }
        if (i3 != 0) {
            return -2;
        }
        return 0;
    }

    public static int a(Context context, java.lang.String str) {
        return a(context, str, android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName());
    }

    public static java.util.List a(android.content.res.Resources resources, int i) {
        java.util.List list = null;
        if (i != 0) {
            android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                    list = arrayList;
                } else {
                    arrayList.add(a(resources.getStringArray(i)));
                    list = arrayList;
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : java.util.Collections.emptyList();
    }

    private static java.util.List a(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String decode : strArr) {
            arrayList.add(android.util.Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static void a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
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

    public static android.graphics.drawable.Drawable a(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int b(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, (defpackage.op) null, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, defpackage.op opVar, boolean z) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, opVar, z);
        if (a2 != null || opVar != null) {
            return a2;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static Typeface a(Context r12, android.content.res.Resources r13, TypedValue r14, int r15, int r16, defpackage.op r17, boolean r18) {
        /*
            java.lang.CharSequence r1 = r14.string
            if (r1 != 0) goto L_0x0035
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r13.getResourceName(r15)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\" ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0035:
            java.lang.CharSequence r1 = r14.string
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x004e
            if (r17 == 0) goto L_0x004c
            r1 = -3
            r2 = 0
            r0 = r17
            r0.a(r1, r2)
        L_0x004c:
            r1 = 0
        L_0x004d:
            return r1
        L_0x004e:
            qy r1 = defpackage.ov.b
            r0 = r16
            java.lang.String r2 = defpackage.ov.a(r13, r15, r0)
            java.lang.Object r1 = r1.a(r2)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0067
            if (r17 == 0) goto L_0x004d
            r2 = 0
            r0 = r17
            r0.a(r1, r2)
            goto L_0x004d
        L_0x0067:
            java.lang.String r1 = r9.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x021c
            android.content.res.XmlResourceParser r8 = r13.getXml(r15)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x0077:
            int r1 = r8.next()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = 2
            if (r1 == r2) goto L_0x0081
            r2 = 1
            if (r1 != r2) goto L_0x0077
        L_0x0081:
            r2 = 2
            if (r1 == r2) goto L_0x00ac
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r2 = "No start tag found"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            throw r1     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x008c:
            r1 = move-exception
            java.lang.String r2 = "ResourcesCompat"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse xml resource "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3, r1)
        L_0x00a1:
            if (r17 == 0) goto L_0x00aa
            r1 = -3
            r2 = 0
            r0 = r17
            r0.a(r1, r2)
        L_0x00aa:
            r1 = 0
            goto L_0x004d
        L_0x00ac:
            r1 = 2
            r2 = 0
            java.lang.String r3 = "font-family"
            r8.require(r1, r2, r3)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r1 = r8.getName()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r2 = "font-family"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x0206
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int[] r2 = defpackage.bt.a     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            android.content.res.TypedArray r1 = r13.obtainAttributes(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r2 = defpackage.bt.m     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r3 = r1.getString(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r2 = defpackage.bt.q     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r4 = r1.getString(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r2 = defpackage.bt.r     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r5 = r1.getString(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r2 = defpackage.bt.n     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r6 = 0
            int r2 = r1.getResourceId(r2, r6)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r6 = defpackage.bt.o     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r7 = 1
            int r6 = r1.getInteger(r6, r7)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r7 = defpackage.bt.p     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r10 = 500(0x1f4, float:7.0E-43)
            int r7 = r1.getInteger(r7, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r1.recycle()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r3 == 0) goto L_0x013e
            if (r4 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x013e
        L_0x00fa:
            int r1 = r8.next()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r10 = 3
            if (r1 == r10) goto L_0x011b
            a(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x00fa
        L_0x0105:
            r1 = move-exception
            java.lang.String r2 = "ResourcesCompat"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to read xml resource "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3, r1)
            goto L_0x00a1
        L_0x011b:
            java.util.List r1 = a(r13, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            oo r2 = new oo     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            ps r8 = new ps     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r8.<init>(r3, r4, r5, r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2.<init>(r8, r6, r7)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x0129:
            if (r2 != 0) goto L_0x020c
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to find font-family tag"
            android.util.Log.e(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r17 == 0) goto L_0x013b
            r1 = -3
            r2 = 0
            r0 = r17
            r0.a(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x013b:
            r1 = 0
            goto L_0x004d
        L_0x013e:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x0143:
            int r1 = r8.next()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = 3
            if (r1 == r2) goto L_0x01ea
            int r1 = r8.getEventType()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = 2
            if (r1 != r2) goto L_0x0143
            java.lang.String r1 = r8.getName()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r2 = "font"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01e5
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int[] r2 = defpackage.bt.b     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            android.content.res.TypedArray r11 = r13.obtainAttributes(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r1 = defpackage.bt.k     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            boolean r1 = r11.hasValue(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01c9
            int r1 = defpackage.bt.k     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x0171:
            r2 = 400(0x190, float:5.6E-43)
            int r3 = r11.getInt(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r1 = defpackage.bt.i     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            boolean r1 = r11.hasValue(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01cc
            int r1 = defpackage.bt.i     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x0181:
            r2 = 1
            r4 = 0
            int r1 = r11.getInt(r1, r4)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r2 != r1) goto L_0x01cf
            r4 = 1
        L_0x018a:
            int r1 = defpackage.bt.l     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            boolean r1 = r11.hasValue(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01d1
            int r1 = defpackage.bt.l     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = r1
        L_0x0195:
            int r1 = defpackage.bt.j     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            boolean r1 = r11.hasValue(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01d5
            int r1 = defpackage.bt.j     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x019f:
            java.lang.String r5 = r11.getString(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r1 = 0
            int r6 = r11.getInt(r2, r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r1 = defpackage.bt.h     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            boolean r1 = r11.hasValue(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01d8
            int r1 = defpackage.bt.h     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x01b2:
            r2 = 0
            int r7 = r11.getResourceId(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.String r2 = r11.getString(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
        L_0x01be:
            int r1 = r8.next()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r11 = 3
            if (r1 == r11) goto L_0x01db
            a(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x01be
        L_0x01c9:
            int r1 = defpackage.bt.f     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x0171
        L_0x01cc:
            int r1 = defpackage.bt.d     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x0181
        L_0x01cf:
            r4 = 0
            goto L_0x018a
        L_0x01d1:
            int r1 = defpackage.bt.g     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = r1
            goto L_0x0195
        L_0x01d5:
            int r1 = defpackage.bt.e     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x019f
        L_0x01d8:
            int r1 = defpackage.bt.c     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x01b2
        L_0x01db:
            on r1 = new on     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r10.add(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x0143
        L_0x01e5:
            a(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x0143
        L_0x01ea:
            boolean r1 = r10.isEmpty()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r1 == 0) goto L_0x01f3
            r2 = 0
            goto L_0x0129
        L_0x01f3:
            om r2 = new om     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            int r1 = r10.size()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            on[] r1 = new defpackage.on[r1]     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            java.lang.Object[] r1 = r10.toArray(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            on[] r1 = (defpackage.on[]) r1     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2.<init>(r1)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x0129
        L_0x0206:
            a(r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            r2 = 0
            goto L_0x0129
        L_0x020c:
            r7 = 0
            r1 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            android.graphics.Typeface r1 = defpackage.ov.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x004d
        L_0x021c:
            r0 = r16
            android.graphics.Typeface r1 = defpackage.ov.a(r12, r13, r15, r9, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            if (r17 == 0) goto L_0x004d
            if (r1 == 0) goto L_0x022e
            r2 = 0
            r0 = r17
            r0.a(r1, r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x004d
        L_0x022e:
            r2 = -3
            r3 = 0
            r0 = r17
            r0.a(r2, r3)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0105 }
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, op, boolean):android.graphics.Typeface");
    }

    public static boolean a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, float f2) {
        return !a(xmlPullParser, str) ? f2 : typedArray.getFloat(i, f2);
    }

    public static int a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int b(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static int a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (!a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static java.lang.String b(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static TypedValue a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static android.content.res.TypedArray a(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static float[] a(float[] fArr, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        float[] fArr2 = new float[i];
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, java.lang.Math.min(i, length));
        return fArr2;
    }

    public static android.graphics.Path a(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        defpackage.ou[] b2 = b(str);
        if (b2 == null) {
            return null;
        }
        try {
            defpackage.ou.a(b2, path);
            return path;
        } catch (java.lang.RuntimeException e2) {
            throw new java.lang.RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static defpackage.ou[] b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
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
            java.lang.String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), d(trim));
            }
            i = i3 + 1;
            i2 = i3;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (defpackage.ou[]) arrayList.toArray(new defpackage.ou[arrayList.size()]);
    }

    public static defpackage.ou[] a(defpackage.ou[] ouVarArr) {
        if (ouVarArr == null) {
            return null;
        }
        defpackage.ou[] ouVarArr2 = new defpackage.ou[ouVarArr.length];
        for (int i = 0; i < ouVarArr.length; i++) {
            ouVarArr2[i] = new defpackage.ou(ouVarArr[i]);
        }
        return ouVarArr2;
    }

    public static boolean a(defpackage.ou[] ouVarArr, defpackage.ou[] ouVarArr2) {
        if (ouVarArr == null || ouVarArr2 == null || ouVarArr.length != ouVarArr2.length) {
            return false;
        }
        for (int i = 0; i < ouVarArr.length; i++) {
            if (ouVarArr[i].a != ouVarArr2[i].a || ouVarArr[i].b.length != ouVarArr2[i].b.length) {
                return false;
            }
        }
        return true;
    }

    private static void a(java.util.ArrayList arrayList, char c2, float[] fArr) {
        arrayList.add(new defpackage.ou(c2, fArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ NumberFormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] d(java.lang.String r13) {
        /*
            r3 = 1
            r2 = 0
            char r0 = r13.charAt(r2)
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 == r1) goto L_0x0012
            char r0 = r13.charAt(r2)
            r1 = 90
            if (r0 != r1) goto L_0x0015
        L_0x0012:
            float[] r0 = new float[r2]
        L_0x0014:
            return r0
        L_0x0015:
            int r0 = r13.length()     // Catch:{ NumberFormatException -> 0x008a }
            float[] r8 = new float[r0]     // Catch:{ NumberFormatException -> 0x008a }
            ot r9 = new ot     // Catch:{ NumberFormatException -> 0x008a }
            r9.<init>()     // Catch:{ NumberFormatException -> 0x008a }
            int r10 = r13.length()     // Catch:{ NumberFormatException -> 0x008a }
            r7 = r3
            r1 = r2
        L_0x0026:
            if (r7 >= r10) goto L_0x0085
            r0 = 0
            r9.b = r0     // Catch:{ NumberFormatException -> 0x008a }
            r5 = r2
            r0 = r2
            r4 = r2
            r6 = r7
        L_0x002f:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x008a }
            if (r6 >= r11) goto L_0x0068
            char r11 = r13.charAt(r6)     // Catch:{ NumberFormatException -> 0x008a }
            switch(r11) {
                case 32: goto L_0x0048;
                case 44: goto L_0x0048;
                case 45: goto L_0x004c;
                case 46: goto L_0x0057;
                case 69: goto L_0x0064;
                case 101: goto L_0x0064;
                default: goto L_0x003c;
            }     // Catch:{ NumberFormatException -> 0x008a }
        L_0x003c:
            r5 = r4
            r4 = r0
            r0 = r2
        L_0x003f:
            if (r5 != 0) goto L_0x0068
            int r6 = r6 + 1
            r12 = r0
            r0 = r4
            r4 = r5
            r5 = r12
            goto L_0x002f
        L_0x0048:
            r4 = r0
            r5 = r3
            r0 = r2
            goto L_0x003f
        L_0x004c:
            if (r6 == r7) goto L_0x003c
            if (r5 != 0) goto L_0x003c
            r4 = 1
            r9.b = r4     // Catch:{ NumberFormatException -> 0x008a }
            r4 = r0
            r5 = r3
            r0 = r2
            goto L_0x003f
        L_0x0057:
            if (r0 != 0) goto L_0x005d
            r0 = r2
            r5 = r4
            r4 = r3
            goto L_0x003f
        L_0x005d:
            r4 = 1
            r9.b = r4     // Catch:{ NumberFormatException -> 0x008a }
            r4 = r0
            r5 = r3
            r0 = r2
            goto L_0x003f
        L_0x0064:
            r5 = r4
            r4 = r0
            r0 = r3
            goto L_0x003f
        L_0x0068:
            r9.a = r6     // Catch:{ NumberFormatException -> 0x008a }
            int r4 = r9.a     // Catch:{ NumberFormatException -> 0x008a }
            if (r7 >= r4) goto L_0x00a6
            int r0 = r1 + 1
            java.lang.String r5 = r13.substring(r7, r4)     // Catch:{ NumberFormatException -> 0x008a }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x008a }
            r8[r1] = r5     // Catch:{ NumberFormatException -> 0x008a }
        L_0x007a:
            boolean r1 = r9.b     // Catch:{ NumberFormatException -> 0x008a }
            if (r1 == 0) goto L_0x0081
            r7 = r4
            r1 = r0
            goto L_0x0026
        L_0x0081:
            int r7 = r4 + 1
            r1 = r0
            goto L_0x0026
        L_0x0085:
            float[] r0 = a(r8, r1)     // Catch:{ NumberFormatException -> 0x008a }
            goto L_0x0014
        L_0x008a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00a6:
            r0 = r1
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.d(java.lang.String):float[]");
    }

    public static java.io.File a(Context context) {
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            java.io.File file = new java.io.File(context.getCacheDir(), str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i = i2 + 1;
            } catch (java.io.IOException e2) {
            }
        }
    }

    private static java.nio.ByteBuffer a(java.io.File file) {
        java.lang.Throwable th;
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th2) {
                java.lang.Throwable th3 = th2;
                th = r0;
                th = th3;
            }
            if (th != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    defpackage.cza.a(th, th4);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
            throw th;
        } catch (java.io.IOException e2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        r9 = r1;
        r1 = r0;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0058, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0059, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0058 A[Catch:{ all -> 0x0058, all -> 0x0047 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(Context r10, android.os.CancellationSignal r11, android.net.Uri r12) {
        /*
            r6 = 0
            android.content.ContentResolver r0 = r10.getContentResolver()
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r0.openFileDescriptor(r12, r1, r11)     // Catch:{ IOException -> 0x0036 }
            if (r7 != 0) goto L_0x0014
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0012:
            r0 = r6
        L_0x0013:
            return r0
        L_0x0014:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            java.io.FileDescriptor r0 = r7.getFileDescriptor()     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            r8.<init>(r0)     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            java.nio.channels.FileChannel r0 = r8.getChannel()     // Catch:{ Throwable -> 0x0039, all -> 0x0068 }
            long r4 = r0.size()     // Catch:{ Throwable -> 0x0039, all -> 0x0068 }
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0039, all -> 0x0068 }
            r2 = 0
            java.nio.MappedByteBuffer r0 = r0.map(r1, r2, r4)     // Catch:{ Throwable -> 0x0039, all -> 0x0068 }
            r8.close()     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            if (r7 == 0) goto L_0x0013
            r7.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0013
        L_0x0036:
            r0 = move-exception
            r0 = r6
            goto L_0x0013
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x003f:
            if (r1 == 0) goto L_0x005b
            r8.close()     // Catch:{ Throwable -> 0x0053, all -> 0x0058 }
        L_0x0044:
            throw r0     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x004b:
            if (r7 == 0) goto L_0x0052
            if (r1 == 0) goto L_0x0064
            r7.close()     // Catch:{ Throwable -> 0x005f }
        L_0x0052:
            throw r0     // Catch:{ IOException -> 0x0036 }
        L_0x0053:
            r2 = move-exception
            defpackage.cza.a(r1, r2)     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            goto L_0x0044
        L_0x0058:
            r0 = move-exception
            r1 = r6
            goto L_0x004b
        L_0x005b:
            r8.close()     // Catch:{ Throwable -> 0x0045, all -> 0x0058 }
            goto L_0x0044
        L_0x005f:
            r2 = move-exception
            defpackage.cza.a(r1, r2)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0052
        L_0x0064:
            r7.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0052
        L_0x0068:
            r0 = move-exception
            r1 = r6
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static java.nio.ByteBuffer a(Context context, android.content.res.Resources resources, int i) {
        java.nio.ByteBuffer byteBuffer = null;
        java.io.File a2 = a(context);
        if (a2 != null) {
            try {
                if (a(a2, resources, i)) {
                    byteBuffer = a(a2);
                    a2.delete();
                }
            } finally {
                a2.delete();
            }
        }
        return byteBuffer;
    }

    public static boolean a(java.io.File file, java.io.InputStream inputStream) {
        java.io.FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new java.io.FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        a((java.io.Closeable) fileOutputStream);
                        return true;
                    }
                }
            } catch (java.io.IOException e2) {
                e = e2;
                try {
                    android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a((java.io.Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    a((java.io.Closeable) fileOutputStream);
                    throw th;
                }
            }
        } catch (java.io.IOException e3) {
            e = e3;
            fileOutputStream = null;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a((java.io.Closeable) fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            a((java.io.Closeable) fileOutputStream);
            throw th;
        }
    }

    public static boolean a(java.io.File file, android.content.res.Resources resources, int i) {
        java.io.InputStream inputStream = null;
        try {
            inputStream = resources.openRawResource(i);
            return a(file, inputStream);
        } finally {
            a((java.io.Closeable) inputStream);
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e2) {
            }
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean a(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void a(android.graphics.drawable.Drawable drawable, float f2, float f3) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof defpackage.pf) {
            ((defpackage.pf) drawable).setTint(i);
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof defpackage.pf) {
            ((defpackage.pf) drawable).setTintList(colorStateList);
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof defpackage.pf) {
            ((defpackage.pf) drawable).setTintMode(mode);
        }
    }

    public static int b(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean c(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof defpackage.pf)) {
                return new defpackage.pm(drawable);
            }
            return drawable;
        } else if (android.os.Build.VERSION.SDK_INT >= 19) {
            if (!(drawable instanceof defpackage.pf)) {
                return new defpackage.pk(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof defpackage.pf)) {
            return new defpackage.ph(drawable);
        } else {
            return drawable;
        }
    }

    public static boolean b(android.graphics.drawable.Drawable drawable, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (android.os.Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!e) {
            try {
                java.lang.reflect.Method declaredMethod = android.graphics.drawable.Drawable.class.getDeclaredMethod("setLayoutDirection", new java.lang.Class[]{java.lang.Integer.TYPE});
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e2) {
            }
            e = true;
        }
        if (d != null) {
            try {
                d.invoke(drawable, new java.lang.Object[]{java.lang.Integer.valueOf(i)});
                return true;
            } catch (java.lang.Exception e3) {
                d = null;
            }
        }
        return false;
    }

    public static int e(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (android.os.Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!g) {
            try {
                java.lang.reflect.Method declaredMethod = android.graphics.drawable.Drawable.class.getDeclaredMethod("getLayoutDirection", new java.lang.Class[0]);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e2) {
            }
            g = true;
        }
        if (f != null) {
            try {
                return ((java.lang.Integer) f.invoke(drawable, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception e3) {
                f = null;
            }
        }
        return 0;
    }

    public static boolean a() {
        return android.os.Build.VERSION.CODENAME.equals("P");
    }

    public static void c(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.beginSection(str);
        }
    }

    public static void b() {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.endSection();
        }
    }

    public static void a(java.lang.Object obj, java.lang.StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        java.lang.String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return java.util.Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException();
    }

    public static void a(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            android.view.Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            android.view.Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static int a(int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.view.Gravity.getAbsoluteGravity(i, i2);
        }
        return -8388609 & i;
    }

    public jd(java.lang.StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
        this.c = null;
    }

    public jd(java.lang.StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    public final void a(java.lang.CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (java.io.IOException e2) {
            throw new defpackage.bs(e2);
        }
    }

    private static int a(java.lang.Appendable appendable, java.text.CharacterIterator characterIterator) {
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
        } catch (java.io.IOException e2) {
            throw new defpackage.bs(e2);
        }
    }

    public final void a(java.text.Format format, java.lang.Object obj) {
        if (this.c == null) {
            a((java.lang.CharSequence) format.format(obj));
            return;
        }
        java.text.AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        this.b += a(this.a, (java.text.CharacterIterator) formatToCharacterIterator);
        formatToCharacterIterator.first();
        int index = formatToCharacterIterator.getIndex();
        int endIndex = formatToCharacterIterator.getEndIndex();
        int i2 = i - index;
        int i3 = index;
        while (i3 < endIndex) {
            java.util.Map attributes = formatToCharacterIterator.getAttributes();
            int runLimit = formatToCharacterIterator.getRunLimit();
            if (attributes.size() != 0) {
                for (java.util.Map.Entry entry : attributes.entrySet()) {
                    this.c.add(new defpackage.lf((java.text.AttributedCharacterIterator.Attribute) entry.getKey(), entry.getValue(), i2 + i3, i2 + runLimit));
                }
            }
            formatToCharacterIterator.setIndex(runLimit);
            i3 = runLimit;
        }
    }

    public final void a(java.text.Format format, java.lang.Object obj, java.lang.String str) {
        if (this.c != null || str == null) {
            a(format, obj);
        } else {
            a((java.lang.CharSequence) str);
        }
    }
}
