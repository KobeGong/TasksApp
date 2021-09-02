package defpackage;

/* renamed from: bwk reason: default package */
/* compiled from: PG */
public final class bwk {
    public android.content.Context a;
    public defpackage.crv b;

    bwk() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            intent.addFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<buv>, for r3v0, types: [java.util.List, java.util.List<buv>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.util.List<defpackage.buv> r3) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.next()
            buv r0 = (defpackage.buv) r0
            java.lang.String r0 = r0.a()
            r1.add(r0)
            goto L_0x0009
        L_0x001d:
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.a(java.util.List):java.lang.String");
    }
}
