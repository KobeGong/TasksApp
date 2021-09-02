package defpackage;

/* renamed from: cwk reason: default package */
/* compiled from: PG */
public final class cwk {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.cwk.class.getName());

    private cwk() {
    }

    public static void a(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                try {
                    a.logp(java.util.logging.Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (java.io.IOException e2) {
                    throw new java.lang.AssertionError(e2);
                }
            }
        }
    }
}
