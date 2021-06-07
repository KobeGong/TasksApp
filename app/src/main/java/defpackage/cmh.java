package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: cmh  reason: default package */
/* compiled from: PG */
public abstract class cmh {
    private final dmf[] a;

    cmh(Class cls) {
        this.a = (dmf[]) Array.newInstance(cls, 0);
    }

    /* access modifiers changed from: package-private */
    public abstract dmf a(dmf dmf, dmf dmf2);

    /* access modifiers changed from: package-private */
    public abstract dmf a(String str, Object obj);

    /* access modifiers changed from: package-private */
    public abstract String a(dmf dmf);

    public final dmf[] a(dmf[] dmfArr, dmf[] dmfArr2) {
        dmf dmf;
        if (dmfArr == null || dmfArr2 == null) {
            return dmfArr;
        }
        ArrayList arrayList = new ArrayList();
        for (dmf dmf2 : dmfArr) {
            String a2 = a(dmf2);
            int length = dmfArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dmf = null;
                    break;
                }
                dmf = dmfArr2[i];
                if (a2.equals(a(dmf))) {
                    break;
                }
                i++;
            }
            dmf a3 = a(dmf2, dmf);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (!arrayList.isEmpty()) {
            return (dmf[]) arrayList.toArray(this.a);
        }
        return null;
    }

    public final dmf[] a(Map map) {
        dmf a2;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getValue() == null || (a2 = a((String) entry.getKey(), entry.getValue())) == null)) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (dmf[]) arrayList.toArray(this.a);
    }
}
