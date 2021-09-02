package defpackage;

/* renamed from: cva reason: default package */
/* compiled from: PG */
enum cva {
    ;

    /* access modifiers changed from: 0000 */
    public abstract int a(java.lang.Object obj, java.lang.Object obj2);

    static defpackage.cva a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return b;
        }
        if (obj instanceof java.lang.Boolean) {
            return a;
        }
        if (obj instanceof java.lang.Long) {
            return c;
        }
        if (obj instanceof java.lang.Double) {
            return d;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
        throw new java.lang.AssertionError(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 18).append("invalid tag type: ").append(valueOf).toString());
    }
}
