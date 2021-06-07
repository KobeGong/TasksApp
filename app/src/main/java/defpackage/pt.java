package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pt  reason: default package */
/* compiled from: PG */
public final class pt {
    public static final qy a = new qy(16);
    public static final Object b = new Object();
    public static final ri c = new ri();
    private static final qb d = new qb("fonts");
    private static final Comparator e = new px();

    static qa a(Context context, ps psVar, int i) {
        List a2;
        ProviderInfo providerInfo;
        py pyVar;
        boolean z;
        int i2 = -3;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = psVar.a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (!resolveContentProvider.packageName.equals(psVar.b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + psVar.b);
            } else {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, e);
                if (psVar.d != null) {
                    a2 = psVar.d;
                } else {
                    a2 = jd.a(resources, 0);
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= a2.size()) {
                        providerInfo = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) a2.get(i3));
                    Collections.sort(arrayList2, e);
                    if (arrayList.size() == arrayList2.size()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                z = true;
                                break;
                            } else if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                                z = false;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                    i3++;
                }
                if (providerInfo == null) {
                    pyVar = new py(1, null);
                } else {
                    pyVar = new py(0, a(context, psVar, providerInfo.authority));
                }
                if (pyVar.a == 0) {
                    Typeface a3 = ov.a.a(context, pyVar.b, i);
                    return new qa(a3, a3 != null ? 0 : -3);
                }
                if (pyVar.a == 1) {
                    i2 = -2;
                }
                return new qa(null, i2);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            return new qa(null, -1);
        }
    }

    public static Typeface a(Context context, ps psVar, op opVar, Handler handler, boolean z, int i, int i2) {
        String str = psVar.e + "-" + i2;
        Typeface typeface = (Typeface) a.a(str);
        if (typeface != null) {
            if (opVar != null) {
                opVar.a(typeface);
            }
            return typeface;
        } else if (!z || i != -1) {
            pu puVar = new pu(context, psVar, i2, str);
            if (z) {
                try {
                    return ((qa) d.a(puVar, i)).a;
                } catch (InterruptedException e2) {
                    return null;
                }
            } else {
                pv pvVar = opVar == null ? null : new pv(opVar, handler);
                synchronized (b) {
                    if (c.containsKey(str)) {
                        if (pvVar != null) {
                            ((ArrayList) c.get(str)).add(pvVar);
                        }
                        return null;
                    }
                    if (pvVar != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(pvVar);
                        c.put(str, arrayList);
                    }
                    d.a(new qd(puVar, new Handler(), new pw(str)));
                    return null;
                }
            }
        } else {
            qa a2 = a(context, psVar, i2);
            if (opVar != null) {
                if (a2.b == 0) {
                    opVar.a(a2.a, handler);
                } else {
                    opVar.a(a2.b, handler);
                }
            }
            return a2.a;
        }
    }

    public static Map a(Context context, pz[] pzVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (pz pzVar : pzVarArr) {
            if (pzVar.e == 0) {
                Uri uri = pzVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, jd.a(context, (CancellationSignal) null, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.pz[] a(android.content.Context r18, defpackage.ps r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt.a(android.content.Context, ps, java.lang.String):pz[]");
    }
}
