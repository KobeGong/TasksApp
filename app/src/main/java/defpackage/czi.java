package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: czi  reason: default package */
/* compiled from: PG */
public final class czi implements Closeable {
    public final char[] a = new char[1024];
    public int b = 0;
    public int c = 0;
    public long d;
    public int e;
    public String f;
    public int g = 0;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int[] n = new int[32];

    public czi(Reader reader) {
        int[] iArr = this.n;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    public final boolean a() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = c();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final czj b() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = c();
        }
        switch (i2) {
            case 1:
                return czj.BEGIN_OBJECT;
            case 2:
                return czj.END_OBJECT;
            case 3:
                return czj.BEGIN_ARRAY;
            case 4:
                return czj.END_ARRAY;
            case 5:
            case 6:
                return czj.BOOLEAN;
            case 7:
                return czj.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return czj.STRING;
            case 12:
            case 13:
            case 14:
                return czj.NAME;
            case 15:
            case 16:
                return czj.NUMBER;
            case 17:
                return czj.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e0, code lost:
        if (b(r2) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e3, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ef, code lost:
        if (b(r15.a[r15.b]) != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f7, code lost:
        throw a("Expected value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x027c, code lost:
        if (r3 != 2) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x027e, code lost:
        if (r4 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0284, code lost:
        if (r6 != Long.MIN_VALUE) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0286, code lost:
        if (r5 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0288, code lost:
        if (r5 == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x028a, code lost:
        r15.d = r6;
        r15.b += r10;
        r0 = 15;
        r15.c = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0297, code lost:
        r6 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x029a, code lost:
        if (r3 == 2) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x029d, code lost:
        if (r3 == 4) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02a0, code lost:
        if (r3 != 7) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02a2, code lost:
        r15.e = r10;
        r0 = 16;
        r15.c = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02b0, code lost:
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:226:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
        // Method dump skipped, instructions count: 800
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czi.c():int");
    }

    private final boolean b(char c2) {
        switch (c2) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case by.bc:
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            case '#':
            case '/':
            case by.bd:
            case by.bf:
            case '\\':
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            default:
                return true;
        }
    }

    public final String a(char c2) {
        int i2;
        char[] cArr = this.a;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i3 = this.b;
            int i4 = this.k;
            int i5 = i3;
            while (true) {
                if (i5 < i4) {
                    int i6 = i5 + 1;
                    char c3 = cArr[i5];
                    if (c3 == c2) {
                        this.b = i6;
                        sb.append(cArr, i3, (i6 - i3) - 1);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.b = i6;
                        sb.append(cArr, i3, (i6 - i3) - 1);
                        if (this.b != this.k || b(1)) {
                            char[] cArr2 = this.a;
                            int i7 = this.b;
                            this.b = i7 + 1;
                            char c4 = cArr2[i7];
                            switch (c4) {
                                case '\n':
                                    this.l++;
                                    this.m = this.b;
                                    break;
                                case '\"':
                                case '\'':
                                case '/':
                                case '\\':
                                    break;
                                case 'b':
                                    c4 = '\b';
                                    break;
                                case 'f':
                                    c4 = '\f';
                                    break;
                                case 'n':
                                    c4 = '\n';
                                    break;
                                case 'r':
                                    c4 = '\r';
                                    break;
                                case 't':
                                    c4 = '\t';
                                    break;
                                case 'u':
                                    if (this.b + 4 <= this.k || b(4)) {
                                        int i8 = this.b;
                                        int i9 = i8 + 4;
                                        c4 = 0;
                                        for (int i10 = i8; i10 < i9; i10++) {
                                            char c5 = this.a[i10];
                                            char c6 = (char) (c4 << 4);
                                            if (c5 >= '0' && c5 <= '9') {
                                                i2 = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i2 = (c5 - 'a') + 10;
                                            } else if (c5 < 'A' || c5 > 'F') {
                                                break;
                                            } else {
                                                i2 = (c5 - 'A') + 10;
                                            }
                                            c4 = (char) (c6 + i2);
                                        }
                                        this.b += 4;
                                        break;
                                    } else {
                                        throw a("Unterminated escape sequence");
                                    }
                                    break;
                                default:
                                    throw a("Invalid escape sequence");
                            }
                            sb.append(c4);
                        } else {
                            throw a("Unterminated escape sequence");
                        }
                    } else {
                        if (c3 == '\n') {
                            this.l++;
                            this.m = i6;
                        }
                        i5 = i6;
                    }
                } else {
                    sb.append(cArr, i3, i5 - i3);
                    this.b = i5;
                    if (!b(1)) {
                        throw a("Unterminated string");
                    }
                }
            }
        }
        throw new NumberFormatException("\\u" + new String(this.a, this.b, 4));
    }

    public final String d() {
        String sb;
        StringBuilder sb2 = null;
        int i2 = 0;
        while (true) {
            if (this.b + i2 < this.k) {
                switch (this.a[this.b + i2]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case by.bc:
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case by.bd:
                    case by.bf:
                    case '\\':
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                    default:
                        i2++;
                }
            } else if (i2 >= this.a.length) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.a, this.b, i2);
                this.b = i2 + this.b;
                if (!b(1)) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (!b(i2 + 1)) {
            }
        }
        if (sb2 == null) {
            sb = new String(this.a, this.b, i2);
        } else {
            sb2.append(this.a, this.b, i2);
            sb = sb2.toString();
        }
        this.b = i2 + this.b;
        return sb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final void a(int i2) {
        if (this.g == this.n.length) {
            int[] iArr = new int[(this.g << 1)];
            int[] iArr2 = new int[(this.g << 1)];
            String[] strArr = new String[(this.g << 1)];
            System.arraycopy(this.n, 0, iArr, 0, this.g);
            System.arraycopy(this.i, 0, iArr2, 0, this.g);
            System.arraycopy(this.h, 0, strArr, 0, this.g);
            this.n = iArr;
            this.i = iArr2;
            this.h = strArr;
        }
        int[] iArr3 = this.n;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i2;
    }

    private final boolean b(int i2) {
        char[] cArr = this.a;
        this.m -= this.b;
        if (this.k != this.b) {
            this.k -= this.b;
            System.arraycopy(cArr, this.b, cArr, 0, this.k);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            int read = this.j.read(cArr, this.k, cArr.length - this.k);
            if (read == -1) {
                return false;
            }
            this.k = read + this.k;
            if (this.l == 0 && this.m == 0 && this.k > 0 && cArr[0] == 65279) {
                this.b++;
                this.m++;
                i2++;
            }
        } while (this.k < i2);
        return true;
    }

    private final int a(boolean z) {
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (b(1)) {
                    i2 = this.b;
                    i3 = this.k;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + e());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.l++;
                this.m = i4;
                i2 = i4;
            } else if (c2 == ' ' || c2 == '\r' || c2 == '\t') {
                i2 = i4;
            } else if (c2 == '/') {
                this.b = i4;
                if (i4 == i3) {
                    this.b--;
                    boolean b2 = b(2);
                    this.b++;
                    if (!b2) {
                        return c2;
                    }
                }
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (c2 == '#') {
                this.b = i4;
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else {
                this.b = i4;
                return c2;
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + e();
    }

    public final String e() {
        return " at line " + (this.l + 1) + " column " + ((this.b - this.m) + 1) + " path " + f();
    }

    public final String f() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            switch (this.n[i3]) {
                case 1:
                case 2:
                    sb.append('[').append(this.i[i3]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.h[i3] != null) {
                        sb.append(this.h[i3]);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    private final IOException a(String str) {
        throw new bkv(str + e());
    }

    static {
        ")]}'\n".toCharArray();
        new czh((byte) 0);
    }
}
