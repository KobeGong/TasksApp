package defpackage;

import java.io.IOException;

/* renamed from: dhr  reason: default package */
/* compiled from: PG */
public final class dhr extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    dhr() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    dhr(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = r1.concat(r0)
        L_0x0014:
            r3.<init>(r0)
            return
        L_0x0018:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhr.<init>(java.lang.String):void");
    }

    dhr(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    dhr(java.lang.String r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = r1.concat(r0)
        L_0x0014:
            r3.<init>(r0, r5)
            return
        L_0x0018:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhr.<init>(java.lang.String, java.lang.Throwable):void");
    }
}
