package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: dlx  reason: default package */
/* compiled from: PG */
public final class dlx {
    public final ByteBuffer a;
    public dhn b;
    public int c;

    private dlx(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    private dlx(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static dlx a(byte[] bArr, int i) {
        return new dlx(bArr, 0, i);
    }

    public final void a(int i, float f) {
        e(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.a.remaining() < 4) {
            throw new dly(this.a.position(), this.a.limit());
        }
        this.a.putInt(floatToIntBits);
    }

    public final void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    public final void a(int i, int i2) {
        e(i, 0);
        if (i2 >= 0) {
            b(i2);
        } else {
            a((long) i2);
        }
    }

    public final void b(int i, long j) {
        e(i, 1);
        if (this.a.remaining() < 8) {
            throw new dly(this.a.position(), this.a.limit());
        }
        this.a.putLong(j);
    }

    public final void a(int i, boolean z) {
        int i2 = 0;
        e(i, 0);
        if (z) {
            i2 = 1;
        }
        byte b2 = (byte) i2;
        if (!this.a.hasRemaining()) {
            throw new dly(this.a.position(), this.a.limit());
        }
        this.a.put(b2);
    }

    public final void a(int i, String str) {
        e(i, 2);
        try {
            int c2 = c(str.length());
            if (c2 == c(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < c2) {
                    throw new dly(c2 + position, this.a.limit());
                }
                this.a.position(position + c2);
                a(str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                b((position2 - position) - c2);
                this.a.position(position2);
                return;
            }
            b(a((CharSequence) str));
            a(str, this.a);
        } catch (BufferOverflowException e) {
            dly dly = new dly(this.a.position(), this.a.limit());
            dly.initCause(e);
            throw dly;
        }
    }

    public final void a(int i, dmf dmf) {
        e(i, 2);
        if (dmf.k < 0) {
            dmf.c();
        }
        b(dmf.k);
        dmf.a(this);
    }

    public final void b(int i, int i2) {
        e(i, 0);
        b(i2);
    }

    private static int a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i) + 4294967296L).toString());
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3 = 0;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = arrayOffset + remaining;
                while (i3 < length && i3 + arrayOffset < i4) {
                    char charAt = charSequence.charAt(i3);
                    if (charAt >= 128) {
                        break;
                    }
                    array[arrayOffset + i3] = (byte) charAt;
                    i3++;
                }
                if (i3 == length) {
                    i = arrayOffset + length;
                } else {
                    int i5 = arrayOffset + i3;
                    while (i3 < length) {
                        char charAt2 = charSequence.charAt(i3);
                        if (charAt2 < 128 && i5 < i4) {
                            i2 = i5 + 1;
                            array[i5] = (byte) charAt2;
                        } else if (charAt2 < 2048 && i5 <= i4 - 2) {
                            int i6 = i5 + 1;
                            array[i5] = (byte) ((charAt2 >>> 6) | 960);
                            i2 = i6 + 1;
                            array[i6] = (byte) ((charAt2 & '?') | 128);
                        } else if ((charAt2 < 55296 || 57343 < charAt2) && i5 <= i4 - 3) {
                            int i7 = i5 + 1;
                            array[i5] = (byte) ((charAt2 >>> '\f') | 480);
                            int i8 = i7 + 1;
                            array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                            i2 = i8 + 1;
                            array[i8] = (byte) ((charAt2 & '?') | 128);
                        } else if (i5 <= i4 - 4) {
                            if (i3 + 1 != charSequence.length()) {
                                i3++;
                                char charAt3 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    int i9 = i5 + 1;
                                    array[i5] = (byte) ((codePoint >>> 18) | 240);
                                    int i10 = i9 + 1;
                                    array[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i10 + 1;
                                    array[i10] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i2 = i11 + 1;
                                    array[i11] = (byte) ((codePoint & 63) | 128);
                                }
                            }
                            throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
                        } else {
                            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charAt2).append(" at index ").append(i5).toString());
                        }
                        i3++;
                        i5 = i2;
                    }
                    i = i5;
                }
                byteBuffer.position(i - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            int length2 = charSequence.length();
            while (i3 < length2) {
                char charAt4 = charSequence.charAt(i3);
                if (charAt4 < 128) {
                    byteBuffer.put((byte) charAt4);
                } else if (charAt4 < 2048) {
                    byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt4 & '?') | 128));
                } else if (charAt4 < 55296 || 57343 < charAt4) {
                    byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                    byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((charAt4 & '?') | 128));
                } else {
                    if (i3 + 1 != charSequence.length()) {
                        i3++;
                        char charAt5 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt4, charAt5)) {
                            int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                            byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                        }
                    }
                    throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
                }
                i3++;
            }
        }
    }

    public static int c(int i, long j) {
        int i2;
        int c2 = c(i << 3);
        if ((-128 & j) == 0) {
            i2 = 1;
        } else if ((-16384 & j) == 0) {
            i2 = 2;
        } else if ((-2097152 & j) == 0) {
            i2 = 3;
        } else if ((-268435456 & j) == 0) {
            i2 = 4;
        } else if ((-34359738368L & j) == 0) {
            i2 = 5;
        } else if ((-4398046511104L & j) == 0) {
            i2 = 6;
        } else if ((-562949953421312L & j) == 0) {
            i2 = 7;
        } else if ((-72057594037927936L & j) == 0) {
            i2 = 8;
        } else if ((Long.MIN_VALUE & j) == 0) {
            i2 = 9;
        } else {
            i2 = 10;
        }
        return i2 + c2;
    }

    public static int c(int i, int i2) {
        return c(i << 3) + a(i2);
    }

    public static int b(int i, String str) {
        return c(i << 3) + a(str);
    }

    public static int b(int i, dmf dmf) {
        int c2 = c(i << 3);
        int c3 = dmf.c();
        return c2 + c3 + c(c3);
    }

    public static int d(int i, int i2) {
        return c(i << 3) + c(i2);
    }

    public static int a(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return a2 + c(a2);
    }

    private final void d(int i) {
        byte b2 = (byte) i;
        if (!this.a.hasRemaining()) {
            throw new dly(this.a.position(), this.a.limit());
        }
        this.a.put(b2);
    }

    private final void e(int i, int i2) {
        b((i << 3) | i2);
    }

    public final void b(int i) {
        while ((i & -128) != 0) {
            d((i & 127) | 128);
            i >>>= 7;
        }
        d(i);
    }

    public static int c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    private final void a(long j) {
        while ((-128 & j) != 0) {
            d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        d((int) j);
    }
}
