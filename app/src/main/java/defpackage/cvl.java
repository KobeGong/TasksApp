package defpackage;

/* renamed from: cvl reason: default package */
/* compiled from: PG */
class cvl extends defpackage.cuv {
    cvl() {
    }

    public java.lang.String a(java.lang.Class cls) {
        if (defpackage.cvk.e) {
            try {
                java.lang.Class l = defpackage.cvk.l();
                if (cls.equals(l)) {
                    return dalvik.system.VMStack.getStackClass2().getName();
                }
                java.lang.String valueOf = java.lang.String.valueOf(cls);
                java.lang.String valueOf2 = java.lang.String.valueOf(l);
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 43 + java.lang.String.valueOf(valueOf2).length()).append("Unexpected stack depth, expected: ").append(valueOf).append(" but was ").append(valueOf2).toString());
            } catch (Throwable th) {
            }
        }
        if (defpackage.cvk.f) {
            java.lang.StackTraceElement a = defpackage.cwc.a(cls, new java.lang.Throwable());
            if (a != null) {
                return a.getClassName();
            }
        }
        return null;
    }

    public defpackage.ctt a(java.lang.Class cls, int i) {
        return defpackage.ctt.a;
    }
}
