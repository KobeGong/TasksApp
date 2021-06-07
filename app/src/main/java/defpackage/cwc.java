package defpackage;

/* renamed from: cwc  reason: default package */
/* compiled from: PG */
public final class cwc {
    private static final cwd a = cwd.a();

    public static StackTraceElement a(Class cls, Throwable th) {
        StackTraceElement stackTraceElement;
        cub.a(cls, "target");
        cub.a(th, "throwable");
        StackTraceElement[] stackTrace = a != null ? null : th.getStackTrace();
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
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static StackTraceElement[] a(Class cls, Throwable th, int i) {
        StackTraceElement[] stackTrace;
        int length;
        StackTraceElement stackTraceElement;
        boolean z;
        cub.a(cls, "target");
        cub.a(th, "throwable");
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
                StackTraceElement a2 = a != null ? a.a(th, i2) : stackTrace[i2];
                if (cls.getName().equals(a2.getClassName())) {
                    z = true;
                } else if (z2) {
                    int i3 = length - i2;
                    if (i <= 0 || i >= i3) {
                        i = i3;
                    }
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    stackTraceElementArr[0] = a2;
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
            return new StackTraceElement[0];
        }
        throw new IllegalArgumentException(new StringBuilder(34).append("invalid maximum depth: ").append(i).toString());
    }
}
