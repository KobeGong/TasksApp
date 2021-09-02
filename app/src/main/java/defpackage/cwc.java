package defpackage;

/* renamed from: cwc reason: default package */
/* compiled from: PG */
public final class cwc {
    private static final defpackage.cwd a = defpackage.cwd.a();

    public static java.lang.StackTraceElement a(java.lang.Class cls, java.lang.Throwable th) {
        java.lang.StackTraceElement stackTraceElement;
        defpackage.cub.a((java.lang.Object) cls, "target");
        defpackage.cub.a((java.lang.Object) th, "throwable");
        java.lang.StackTraceElement[] stackTrace = a != null ? null : th.getStackTrace();
        boolean z = false;
        int i = 1;
        while (true) {
            try {
                if (a != null) {
                    stackTraceElement = a.a(th, i);
                } else {
                    stackTraceElement = stackTrace[i];
                }
                if (cls.getName().equals(stackTraceElement.getClassName())) {
                    z = true;
                } else if (z) {
                    return stackTraceElement;
                }
                i++;
            } catch (java.lang.Exception e) {
                return null;
            }
        }
    }

    public static java.lang.StackTraceElement[] a(java.lang.Class cls, java.lang.Throwable th, int i) {
        java.lang.StackTraceElement[] stackTrace;
        int length;
        java.lang.StackTraceElement stackTraceElement;
        boolean z;
        defpackage.cub.a((java.lang.Object) cls, "target");
        defpackage.cub.a((java.lang.Object) th, "throwable");
        if (i > 0 || i == -1) {
            if (a != null) {
                stackTrace = null;
                length = a.a(th);
            } else {
                stackTrace = th.getStackTrace();
                length = stackTrace.length;
            }
            int i2 = 2;
            boolean z2 = false;
            while (i2 < length) {
                java.lang.StackTraceElement stackTraceElement2 = a != null ? a.a(th, i2) : stackTrace[i2];
                if (cls.getName().equals(stackTraceElement2.getClassName())) {
                    z = true;
                } else if (z2) {
                    int i3 = length - i2;
                    if (i <= 0 || i >= i3) {
                        i = i3;
                    }
                    java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i];
                    stackTraceElementArr[0] = stackTraceElement2;
                    for (int i4 = 1; i4 < i; i4++) {
                        if (a != null) {
                            stackTraceElement = a.a(th, i2 + i4);
                        } else {
                            stackTraceElement = stackTrace[i2 + i4];
                        }
                        stackTraceElementArr[i4] = stackTraceElement;
                    }
                    return stackTraceElementArr;
                } else {
                    z = z2;
                }
                i2++;
                z2 = z;
            }
            return new java.lang.StackTraceElement[0];
        }
        throw new java.lang.IllegalArgumentException("invalid maximum depth: " + i);
    }
}
