package defpackage;

import dalvik.system.VMStack;

/* renamed from: cvl  reason: default package */
/* compiled from: PG */
class cvl extends cuv {
    cvl() {
    }

    @Override // defpackage.cuv
    public String a(Class cls) {
        StackTraceElement a;
        if (cvk.e) {
            try {
                Class l = cvk.l();
                if (cls.equals(l)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(l);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length()).append("Unexpected stack depth, expected: ").append(valueOf).append(" but was ").append(valueOf2).toString());
            } catch (Throwable th) {
            }
        }
        if (!(cvk.f) || (a = cwc.a(cls, new Throwable())) == null) {
            return null;
        }
        return a.getClassName();
    }

    @Override // defpackage.cuv
    public ctt a(Class cls, int i) {
        return ctt.a;
    }
}
