package defpackage;

/* renamed from: cuu reason: default package */
/* compiled from: PG */
final class cuu {
    public static final defpackage.cut a = a(defpackage.cut.d);

    private static defpackage.cut a(java.lang.String[] strArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.cut cut = null;
        try {
            cut = defpackage.cub.a();
        } catch (java.lang.NoClassDefFoundError e) {
        }
        if (cut == null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                java.lang.String str = strArr[i];
                try {
                    cut = (defpackage.cut) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (Throwable th) {
                    sb.append(10).append(str).append(": ").append(th);
                    i++;
                }
            }
            throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        return cut;
    }
}
