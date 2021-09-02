package defpackage;

/* renamed from: dlj reason: default package */
/* compiled from: PG */
abstract class dlj {
    dlj() {
    }

    /* access modifiers changed from: 0000 */
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: 0000 */
    public abstract int a(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract void a(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

    /* access modifiers changed from: 0000 */
    public final boolean a(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }

    static void b(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (java.lang.IndexOutOfBoundsException e) {
            }
        }
        if (i2 == length) {
            byteBuffer.position(position + i2);
            return;
        }
        position += i2;
        while (i2 < length) {
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                i = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i, (byte) ((charAt2 & '?') | 128));
                    position = i;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    position = i;
                    throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (java.lang.Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else if (charAt2 < 55296 || 57343 < charAt2) {
                int i3 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> 12) | 224));
                position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            } else {
                if (i2 + 1 != length) {
                    i2++;
                    char charAt3 = charSequence.charAt(i2);
                    if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                        int i4 = position + 1;
                        try {
                            byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                            i = i4 + 1;
                            byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                            position = i + 1;
                            byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                        } catch (java.lang.IndexOutOfBoundsException e3) {
                            position = i4;
                            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (java.lang.Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                        }
                    }
                }
                throw new defpackage.dll(i2, length);
            }
            i2++;
            position++;
        }
        byteBuffer.position(position);
    }
}
