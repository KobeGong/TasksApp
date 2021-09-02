package defpackage;

/* renamed from: cqc reason: default package */
/* compiled from: PG */
public final class cqc implements defpackage.cqi {
    private static final int a = 7;
    private static final int b = 7;
    private final defpackage.cqi[] c;

    public cqc(android.content.Context context, java.util.Set set) {
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.String packageName = context.getPackageName();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.wtf(java.lang.String.format("Could not find application info for package: %s", new java.lang.Object[]{packageName}), e);
            applicationInfo = null;
        }
        android.os.Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (bundle != null) {
            for (java.lang.String str : applicationInfo.metaData.keySet()) {
                if (str.startsWith("MODULE.")) {
                    arrayList.add(a(bundle.getString(str)));
                }
                if (str.startsWith("MODULE:")) {
                    arrayList.add(a(str.substring(a)));
                } else if (str.startsWith("module:")) {
                    java.lang.String substring = str.substring(b);
                    hashSet.add(substring);
                    if (set == null || !set.contains(substring)) {
                        java.lang.String valueOf = java.lang.String.valueOf("gen_binder.");
                        java.lang.String valueOf2 = java.lang.String.valueOf(substring.replace('.', '$'));
                        arrayList.add(a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf)));
                        if (set != null && android.util.Log.isLoggable("Binder", 5)) {
                            java.lang.String str2 = "Binder";
                            java.lang.String str3 = "***WARNING*** Root module does not include ";
                            java.lang.String valueOf3 = java.lang.String.valueOf(substring);
                            android.util.Log.w(str2, valueOf3.length() != 0 ? str3.concat(valueOf3) : new java.lang.String(str3));
                        }
                    }
                }
            }
        }
        this.c = (defpackage.cqi[]) arrayList.toArray(new defpackage.cqi[arrayList.size()]);
    }

    private static defpackage.cqi a(java.lang.String str) {
        try {
            return (defpackage.cqi) java.lang.Class.forName(str).newInstance();
        } catch (java.lang.IllegalAccessException e) {
            java.lang.IllegalAccessException illegalAccessException = e;
            java.lang.String str2 = "Failed to add stitch module ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), illegalAccessException);
        } catch (java.lang.InstantiationException e2) {
            java.lang.InstantiationException instantiationException = e2;
            java.lang.String str3 = "Failed to add stitch module ";
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            throw new java.lang.RuntimeException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new java.lang.String(str3), instantiationException);
        } catch (java.lang.ClassNotFoundException e3) {
            java.lang.ClassNotFoundException classNotFoundException = e3;
            java.lang.String str4 = "Failed to add stitch module ";
            java.lang.String valueOf3 = java.lang.String.valueOf(str);
            throw new java.lang.RuntimeException(valueOf3.length() != 0 ? str4.concat(valueOf3) : new java.lang.String(str4), classNotFoundException);
        }
    }

    public final void a(android.content.Context context, java.lang.Class cls, defpackage.cqd cqd) {
        for (defpackage.cqi a2 : this.c) {
            a2.a(context, cls, cqd);
        }
    }
}
