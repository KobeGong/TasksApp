package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: ehw  reason: default package */
/* compiled from: PG */
public class ehw {
    public static Context a;

    public static void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static int a(int i) {
        if (i >= 0 && i <= 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(42).append(i).append(" is not a valid enum MetricType").toString());
    }
}
