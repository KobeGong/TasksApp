package defpackage;

import java.io.PrintWriter;

/* renamed from: rk  reason: default package */
/* compiled from: PG */
public final class rk {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(char[] cArr, int i, char c, int i2, boolean z) {
        int i3;
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if (i > 99) {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i3 = i2 + 1;
            i4 = i - (i5 * 100);
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i4 > 9 || i2 != i3) {
            int i6 = i4 / 10;
            cArr[i3] = (char) (i6 + 48);
            i3++;
            i4 -= i6 * 10;
        }
        cArr[i3] = (char) (i4 + 48);
        int i7 = i3 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    private static void a(long j, PrintWriter printWriter) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2 = true;
        int i5 = 1;
        synchronized (a) {
            if (b.length < 0) {
                b = new char[0];
            }
            char[] cArr = b;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                if (j > 0) {
                    c = '+';
                } else {
                    j = -j;
                    c = '-';
                }
                int i6 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    int i7 = floor / 86400;
                    floor -= 86400 * i7;
                    i = i7;
                } else {
                    i = 0;
                }
                if (floor > 3600) {
                    int i8 = floor / 3600;
                    floor -= i8 * 3600;
                    i2 = i8;
                } else {
                    i2 = 0;
                }
                if (floor > 60) {
                    int i9 = floor / 60;
                    i3 = floor - (i9 * 60);
                    i4 = i9;
                } else {
                    i3 = floor;
                    i4 = 0;
                }
                cArr[0] = c;
                int a2 = a(cArr, i, 'd', 1, false);
                int a3 = a(cArr, i2, 'h', a2, a2 != 1);
                if (a3 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                int a4 = a(cArr, i4, 'm', a3, z);
                if (a4 == 1) {
                    z2 = false;
                }
                int a5 = a(cArr, i6, 'm', a(cArr, i3, 's', a4, z2), true);
                cArr[a5] = 's';
                i5 = a5 + 1;
            }
            printWriter.print(new String(b, 0, i5));
        }
    }

    public static void a(PrintWriter printWriter) {
        a(0, printWriter);
    }

    public static void a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            a(j - j2, printWriter);
        }
    }
}
