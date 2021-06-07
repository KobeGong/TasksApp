package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cqc  reason: default package */
/* compiled from: PG */
public final class cqc implements cqi {
    private static final int a = 7;
    private static final int b = 7;
    private final cqi[] c;

    public cqc(Context context, Set set) {
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf(String.format("Could not find application info for package: %s", packageName), e);
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            for (String str : applicationInfo.metaData.keySet()) {
                if (str.startsWith("MODULE.")) {
                    arrayList.add(a(bundle.getString(str)));
                }
                if (str.startsWith("MODULE:")) {
                    arrayList.add(a(str.substring(a)));
                } else if (str.startsWith("module:")) {
                    String substring = str.substring(b);
                    hashSet.add(substring);
                    if (set == null || !set.contains(substring)) {
                        String valueOf = String.valueOf("gen_binder.");
                        String valueOf2 = String.valueOf(substring.replace('.', '$'));
                        arrayList.add(a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                        if (set != null && Log.isLoggable("Binder", 5)) {
                            String valueOf3 = String.valueOf(substring);
                            Log.w("Binder", valueOf3.length() != 0 ? "***WARNING*** Root module does not include ".concat(valueOf3) : new String("***WARNING*** Root module does not include "));
                        }
                    }
                }
            }
        }
        this.c = (cqi[]) arrayList.toArray(new cqi[arrayList.size()]);
    }

    private static cqi a(String str) {
        try {
            return (cqi) Class.forName(str).newInstance();
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Failed to add stitch module ".concat(valueOf) : new String("Failed to add stitch module "), e);
        } catch (InstantiationException e2) {
            String valueOf2 = String.valueOf(str);
            throw new RuntimeException(valueOf2.length() != 0 ? "Failed to add stitch module ".concat(valueOf2) : new String("Failed to add stitch module "), e2);
        } catch (ClassNotFoundException e3) {
            String valueOf3 = String.valueOf(str);
            throw new RuntimeException(valueOf3.length() != 0 ? "Failed to add stitch module ".concat(valueOf3) : new String("Failed to add stitch module "), e3);
        }
    }

    @Override // defpackage.cqi
    public final void a(Context context, Class cls, cqd cqd) {
        for (int i = 0; i < this.c.length; i++) {
            this.c[i].a(context, cls, cqd);
        }
    }
}
