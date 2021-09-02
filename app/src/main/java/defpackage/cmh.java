package defpackage;

/* renamed from: cmh reason: default package */
/* compiled from: PG */
public abstract class cmh {
    private final defpackage.dmf[] a;

    cmh(java.lang.Class cls) {
        this.a = (defpackage.dmf[]) java.lang.reflect.Array.newInstance(cls, 0);
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.dmf a(defpackage.dmf dmf, defpackage.dmf dmf2);

    /* access modifiers changed from: 0000 */
    public abstract defpackage.dmf a(java.lang.String str, java.lang.Object obj);

    /* access modifiers changed from: 0000 */
    public abstract java.lang.String a(defpackage.dmf dmf);

    public final defpackage.dmf[] a(defpackage.dmf[] dmfArr, defpackage.dmf[] dmfArr2) {
        defpackage.dmf dmf;
        if (dmfArr == null || dmfArr2 == null) {
            return dmfArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.dmf dmf2 : dmfArr) {
            java.lang.String a2 = a(dmf2);
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
            defpackage.dmf a3 = a(dmf2, dmf);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (!arrayList.isEmpty()) {
            return (defpackage.dmf[]) arrayList.toArray(this.a);
        }
        return null;
    }

    public final defpackage.dmf[] a(java.util.Map map) {
        if (map == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                defpackage.dmf a2 = a((java.lang.String) entry.getKey(), entry.getValue());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (defpackage.dmf[]) arrayList.toArray(this.a);
    }
}
