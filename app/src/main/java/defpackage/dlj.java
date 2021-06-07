package defpackage;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: dlj  reason: default package */
/* compiled from: PG */
public abstract class dlj {
    dlj() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);

    /* access modifiers changed from: package-private */
    public final boolean a(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }

    static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException e) {
                int position2 = byteBuffer.position();
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i)).append(" at index ").append(Math.max(i, (position - byteBuffer.position()) + 1) + position2).toString());
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        int i2 = position + i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < 128) {
                byteBuffer.put(i2, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i3 = i2 + 1;
                try {
                    byteBuffer.put(i2, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i3, (byte) ((charAt2 & '?') | 128));
                    i2 = i3;
                } catch (IndexOutOfBoundsException e2) {
                    position = i3;
                    int position22 = byteBuffer.position();
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i)).append(" at index ").append(Math.max(i, (position - byteBuffer.position()) + 1) + position22).toString());
                }
            } else if (charAt2 < 55296 || 57343 < charAt2) {
                int i4 = i2 + 1;
                byteBuffer.put(i2, (byte) ((charAt2 >>> '\f') | 224));
                i2 = i4 + 1;
                byteBuffer.put(i4, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
            } else {
                if (i + 1 != length) {
                    i++;
                    char charAt3 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i5 = i2 + 1;
                        try {
                            byteBuffer.put(i2, (byte) ((codePoint >>> 18) | 240));
                            int i6 = i5 + 1;
                            byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                            i2 = i6 + 1;
                            byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put(i2, (byte) ((codePoint & 63) | 128));
                        } catch (IndexOutOfBoundsException e3) {
                            position = i5;
                            int position222 = byteBuffer.position();
                            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i)).append(" at index ").append(Math.max(i, (position - byteBuffer.position()) + 1) + position222).toString());
                        }
                    }
                }
                throw new dll(i, length);
            }
            i++;
            i2++;
        }
        byteBuffer.position(i2);
    }
}
