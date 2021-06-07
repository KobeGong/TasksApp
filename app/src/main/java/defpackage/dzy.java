package defpackage;

import java.nio.ByteBuffer;

/* renamed from: dzy  reason: default package */
/* compiled from: PG */
public final class dzy {
    public static dzx a(int i) {
        return new dzx(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
