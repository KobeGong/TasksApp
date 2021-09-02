package defpackage;

@java.lang.Deprecated
/* renamed from: ehw reason: default package */
/* compiled from: PG */
public class ehw {
    public static android.content.Context a;

    public static void a(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static int a(int i) {
        if (i >= 0 && i <= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(i + " is not a valid enum MetricType");
    }
}
