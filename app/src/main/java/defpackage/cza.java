package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: cza  reason: default package */
/* compiled from: PG */
public final class cza {
    public static final czb a;

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    public static void a(Throwable th, PrintStream printStream) {
        a.a(th, printStream);
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cza.<clinit>():void");
    }
}
