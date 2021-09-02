package defpackage;

/* renamed from: os reason: default package */
/* compiled from: PG */
public final class os {
    public static int a(int i, int i2) {
        int alpha = android.graphics.Color.alpha(i2);
        int alpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return android.graphics.Color.argb(i3, a(android.graphics.Color.red(i), alpha2, android.graphics.Color.red(i2), alpha, i3), a(android.graphics.Color.green(i), alpha2, android.graphics.Color.green(i2), alpha, i3), a(android.graphics.Color.blue(i), alpha2, android.graphics.Color.blue(i2), alpha, i3));
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static int b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
    }

    static {
        new java.lang.ThreadLocal();
    }
}
