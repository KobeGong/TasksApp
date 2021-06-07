package defpackage;

/* renamed from: ehu  reason: default package */
/* compiled from: PG */
public class ehu {
    public final eie a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ehu(android.content.Context r4) {
        /*
            r3 = this;
            java.util.List r1 = defpackage.ehx.a(r4)
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0012
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to find any Cronet provider. Have you included all necessary jars?"
            r0.<init>(r1)
            throw r0
        L_0x0012:
            java.util.Iterator r2 = r1.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            ehx r0 = (defpackage.ehx) r0
            r0.d()
            goto L_0x0016
        L_0x0026:
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0034
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "All available Cronet providers are disabled. A provider should be enabled before it can be used."
            r0.<init>(r1)
            throw r0
        L_0x0034:
            ehv r0 = new ehv
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            ehx r0 = (defpackage.ehx) r0
            ehu r0 = r0.a()
            eie r0 = r0.a
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehu.<init>(android.content.Context):void");
    }

    public ehu(eie eie) {
        this.a = eie;
    }

    public eht a() {
        return this.a.a();
    }

    static int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    return Integer.signum(parseInt - parseInt2);
                }
                i++;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
            }
        }
        return Integer.signum(split.length - split2.length);
    }
}
