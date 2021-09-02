package defpackage;

/* renamed from: bl reason: default package */
/* compiled from: PG */
public final class bl implements java.lang.Cloneable {
    public static final defpackage.bn[] f = defpackage.bn.values();
    private static final defpackage.bm g = defpackage.bm.a(defpackage.al.a("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL"));
    public defpackage.bm a = g;
    public java.lang.String b;
    public java.util.ArrayList c = new java.util.ArrayList();
    public java.util.ArrayList d;
    public boolean e;

    public bl() {
    }

    public bl(java.lang.String str) {
        a(str);
    }

    public final defpackage.bl a(java.lang.String str) {
        this.b = str;
        this.e = false;
        this.c.clear();
        if (this.d != null) {
            this.d.clear();
        }
        a(0, 0, 0, defpackage.bn.NONE);
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.bl blVar = (defpackage.bl) obj;
        if (!this.a.equals(blVar.a) || (this.b != null ? !this.b.equals(blVar.b) : blVar.b != null) || !this.c.equals(blVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b != null ? this.b.hashCode() : 0) + (this.a.hashCode() * 37)) * 37) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.b;
    }

    public final defpackage.bo a(int i) {
        return (defpackage.bo) this.c.get(i);
    }

    public final defpackage.bp b(int i) {
        return ((defpackage.bo) this.c.get(i)).a;
    }

    public final java.lang.String a(defpackage.bo boVar) {
        int i = boVar.b;
        return this.b.substring(i, boVar.c + i);
    }

    public final boolean a(defpackage.bo boVar, java.lang.String str) {
        return this.b.regionMatches(boVar.b, str, 0, boVar.c);
    }

    public final double b(defpackage.bo boVar) {
        defpackage.bp bpVar = boVar.a;
        if (bpVar == defpackage.bp.ARG_INT) {
            return (double) boVar.d;
        }
        if (bpVar == defpackage.bp.ARG_DOUBLE) {
            return ((java.lang.Double) this.d.get(boVar.d)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int c(int i) {
        int i2 = ((defpackage.bo) this.c.get(i)).e;
        return i2 < i ? i : i2;
    }

    public final java.lang.Object clone() {
        return a();
    }

    private final defpackage.bl a() {
        try {
            defpackage.bl blVar = (defpackage.bl) super.clone();
            blVar.c = (java.util.ArrayList) this.c.clone();
            if (this.d != null) {
                blVar.d = (java.util.ArrayList) this.d.clone();
            }
            return blVar;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new defpackage.bq(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07a9, code lost:
        if (r9 != h(r21)) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07ab, code lost:
        r5 = r7.toString().toLowerCase(java.util.Locale.ENGLISH);
        r6 = i(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07f0, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder((java.lang.String.valueOf(r5).length() + 21) + java.lang.String.valueOf(r6).length()).append("Bad ").append(r5).append(" pattern syntax: ").append(r6).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07f3, code lost:
        if (r4 != false) goto L_0x0a7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07f5, code lost:
        r5 = r7.toString().toLowerCase(java.util.Locale.ENGLISH);
        r6 = b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0838, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder((java.lang.String.valueOf(r5).length() + 39) + java.lang.String.valueOf(r6).length()).append("Missing 'other' keyword in ").append(r5).append(" pattern in ").append(r6).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a7f, code lost:
        r4 = r7;
        r7 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x052a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(int r19, int r20, int r21, defpackage.bn r22) {
        /*
            r18 = this;
            r4 = 32767(0x7fff, float:4.5916E-41)
            r0 = r21
            if (r0 <= r4) goto L_0x000c
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
        L_0x000c:
            r0 = r18
            java.util.ArrayList r4 = r0.c
            int r11 = r4.size()
            bp r4 = defpackage.bp.MSG_START
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r0.a(r4, r1, r2, r3)
            int r7 = r19 + r20
        L_0x0023:
            r0 = r18
            java.lang.String r4 = r0.b
            int r4 = r4.length()
            if (r7 >= r4) goto L_0x0ab8
            r0 = r18
            java.lang.String r4 = r0.b
            int r10 = r7 + 1
            char r4 = r4.charAt(r7)
            r5 = 39
            if (r4 != r5) goto L_0x00fa
            r0 = r18
            java.lang.String r4 = r0.b
            int r4 = r4.length()
            if (r10 != r4) goto L_0x0051
            bp r4 = defpackage.bp.INSERT_CHAR
            r5 = 0
            r6 = 39
            r0 = r18
            r0.a(r4, r10, r5, r6)
            r7 = r10
            goto L_0x0023
        L_0x0051:
            r0 = r18
            java.lang.String r4 = r0.b
            char r4 = r4.charAt(r10)
            r5 = 39
            if (r4 != r5) goto L_0x0069
            bp r4 = defpackage.bp.SKIP_SYNTAX
            int r7 = r10 + 1
            r5 = 1
            r6 = 0
            r0 = r18
            r0.a(r4, r10, r5, r6)
            goto L_0x0023
        L_0x0069:
            r0 = r18
            bm r5 = r0.a
            bm r6 = defpackage.bm.DOUBLE_REQUIRED
            if (r5 == r6) goto L_0x008d
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L_0x008d
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L_0x008d
            bn r5 = defpackage.bn.CHOICE
            r0 = r22
            if (r0 != r5) goto L_0x0083
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 == r5) goto L_0x008d
        L_0x0083:
            boolean r5 = r22.a()
            if (r5 == 0) goto L_0x00ed
            r5 = 35
            if (r4 != r5) goto L_0x00ed
        L_0x008d:
            bp r4 = defpackage.bp.SKIP_SYNTAX
            int r5 = r10 + -1
            r6 = 1
            r7 = 0
            r0 = r18
            r0.a(r4, r5, r6, r7)
        L_0x0098:
            r0 = r18
            java.lang.String r4 = r0.b
            r5 = 39
            int r6 = r10 + 1
            int r4 = r4.indexOf(r5, r6)
            if (r4 < 0) goto L_0x00d9
            int r5 = r4 + 1
            r0 = r18
            java.lang.String r6 = r0.b
            int r6 = r6.length()
            if (r5 >= r6) goto L_0x00cc
            r0 = r18
            java.lang.String r5 = r0.b
            int r6 = r4 + 1
            char r5 = r5.charAt(r6)
            r6 = 39
            if (r5 != r6) goto L_0x00cc
            bp r5 = defpackage.bp.SKIP_SYNTAX
            int r10 = r4 + 1
            r4 = 1
            r6 = 0
            r0 = r18
            r0.a(r5, r10, r4, r6)
            goto L_0x0098
        L_0x00cc:
            bp r5 = defpackage.bp.SKIP_SYNTAX
            int r7 = r4 + 1
            r6 = 1
            r8 = 0
            r0 = r18
            r0.a(r5, r4, r6, r8)
            goto L_0x0023
        L_0x00d9:
            r0 = r18
            java.lang.String r4 = r0.b
            int r7 = r4.length()
            bp r4 = defpackage.bp.INSERT_CHAR
            r5 = 0
            r6 = 39
            r0 = r18
            r0.a(r4, r7, r5, r6)
            goto L_0x0023
        L_0x00ed:
            bp r4 = defpackage.bp.INSERT_CHAR
            r5 = 0
            r6 = 39
            r0 = r18
            r0.a(r4, r10, r5, r6)
            r7 = r10
            goto L_0x0023
        L_0x00fa:
            boolean r5 = r22.a()
            if (r5 == 0) goto L_0x0112
            r5 = 35
            if (r4 != r5) goto L_0x0112
            bp r4 = defpackage.bp.REPLACE_NUMBER
            int r5 = r10 + -1
            r6 = 1
            r7 = 0
            r0 = r18
            r0.a(r4, r5, r6, r7)
            r7 = r10
            goto L_0x0023
        L_0x0112:
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 != r5) goto L_0x0a83
            int r4 = r10 + -1
            r0 = r18
            java.util.ArrayList r5 = r0.c
            int r5 = r5.size()
            bn r7 = defpackage.bn.NONE
            bp r6 = defpackage.bp.ARG_START
            r8 = 1
            int r9 = r7.ordinal()
            r0 = r18
            r0.a(r6, r4, r8, r9)
            int r4 = r4 + 1
            r0 = r18
            int r10 = r0.d(r4)
            r0 = r18
            java.lang.String r4 = r0.b
            int r4 = r4.length()
            if (r10 != r4) goto L_0x0160
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unmatched '{' braces in message "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x015a
            java.lang.String r4 = r6.concat(r4)
        L_0x0156:
            r5.<init>(r4)
            throw r5
        L_0x015a:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0156
        L_0x0160:
            r0 = r18
            int r12 = r0.e(r10)
            r0 = r18
            java.lang.String r13 = r0.b
            if (r10 < r12) goto L_0x0196
            r4 = -2
        L_0x016d:
            if (r4 < 0) goto L_0x0210
            int r6 = r12 - r10
            r8 = 65535(0xffff, float:9.1834E-41)
            if (r6 > r8) goto L_0x017a
            r8 = 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r8) goto L_0x01df
        L_0x017a:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument number too large: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x01d9
            java.lang.String r4 = r6.concat(r4)
        L_0x0192:
            r5.<init>(r4)
            throw r5
        L_0x0196:
            int r8 = r10 + 1
            char r4 = r13.charAt(r10)
            r6 = 48
            if (r4 != r6) goto L_0x01c3
            if (r8 != r12) goto L_0x01a4
            r4 = 0
            goto L_0x016d
        L_0x01a4:
            r6 = 0
            r4 = 1
        L_0x01a6:
            if (r8 >= r12) goto L_0x01d3
            int r9 = r8 + 1
            char r8 = r13.charAt(r8)
            r14 = 48
            if (r14 > r8) goto L_0x01d1
            r14 = 57
            if (r8 > r14) goto L_0x01d1
            r14 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r6 < r14) goto L_0x01bc
            r4 = 1
        L_0x01bc:
            int r6 = r6 * 10
            int r8 = r8 + -48
            int r6 = r6 + r8
            r8 = r9
            goto L_0x01a6
        L_0x01c3:
            r6 = 49
            if (r6 > r4) goto L_0x01cf
            r6 = 57
            if (r4 > r6) goto L_0x01cf
            int r6 = r4 + -48
            r4 = 0
            goto L_0x01a6
        L_0x01cf:
            r4 = -1
            goto L_0x016d
        L_0x01d1:
            r4 = -1
            goto L_0x016d
        L_0x01d3:
            if (r4 == 0) goto L_0x01d7
            r4 = -2
            goto L_0x016d
        L_0x01d7:
            r4 = r6
            goto L_0x016d
        L_0x01d9:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0192
        L_0x01df:
            bp r8 = defpackage.bp.ARG_NUMBER
            r0 = r18
            r0.a(r8, r10, r6, r4)
        L_0x01e6:
            r0 = r18
            int r4 = r0.d(r12)
            r0 = r18
            java.lang.String r6 = r0.b
            int r6 = r6.length()
            if (r4 != r6) goto L_0x0272
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unmatched '{' braces in message "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x026c
            java.lang.String r4 = r6.concat(r4)
        L_0x020c:
            r5.<init>(r4)
            throw r5
        L_0x0210:
            r6 = -1
            if (r4 != r6) goto L_0x024a
            int r4 = r12 - r10
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 <= r6) goto L_0x023c
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument name too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0236
            java.lang.String r4 = r6.concat(r4)
        L_0x0232:
            r5.<init>(r4)
            throw r5
        L_0x0236:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0232
        L_0x023c:
            r6 = 1
            r0 = r18
            r0.e = r6
            bp r6 = defpackage.bp.ARG_NAME
            r8 = 0
            r0 = r18
            r0.a(r6, r10, r4, r8)
            goto L_0x01e6
        L_0x024a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad argument syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0266
            java.lang.String r4 = r6.concat(r4)
        L_0x0262:
            r5.<init>(r4)
            throw r5
        L_0x0266:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0262
        L_0x026c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x020c
        L_0x0272:
            r0 = r18
            java.lang.String r6 = r0.b
            char r6 = r6.charAt(r4)
            r8 = 125(0x7d, float:1.75E-43)
            if (r6 == r8) goto L_0x0b12
            r7 = 44
            if (r6 == r7) goto L_0x02a4
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad argument syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x029e
            java.lang.String r4 = r6.concat(r4)
        L_0x029a:
            r5.<init>(r4)
            throw r5
        L_0x029e:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x029a
        L_0x02a4:
            int r4 = r4 + 1
            r0 = r18
            int r6 = r0.d(r4)
            r4 = r6
        L_0x02ad:
            r0 = r18
            java.lang.String r7 = r0.b
            int r7 = r7.length()
            if (r4 >= r7) goto L_0x02d7
            r0 = r18
            java.lang.String r7 = r0.b
            char r7 = r7.charAt(r4)
            r8 = 97
            if (r8 > r7) goto L_0x02c7
            r8 = 122(0x7a, float:1.71E-43)
            if (r7 <= r8) goto L_0x02cf
        L_0x02c7:
            r8 = 65
            if (r8 > r7) goto L_0x02d5
            r8 = 90
            if (r7 > r8) goto L_0x02d5
        L_0x02cf:
            r7 = 1
        L_0x02d0:
            if (r7 == 0) goto L_0x02d7
            int r4 = r4 + 1
            goto L_0x02ad
        L_0x02d5:
            r7 = 0
            goto L_0x02d0
        L_0x02d7:
            int r9 = r4 - r6
            r0 = r18
            int r8 = r0.d(r4)
            r0 = r18
            java.lang.String r4 = r0.b
            int r4 = r4.length()
            if (r8 != r4) goto L_0x0309
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unmatched '{' braces in message "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0303
            java.lang.String r4 = r6.concat(r4)
        L_0x02ff:
            r5.<init>(r4)
            throw r5
        L_0x0303:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x02ff
        L_0x0309:
            if (r9 == 0) goto L_0x031b
            r0 = r18
            java.lang.String r4 = r0.b
            char r12 = r4.charAt(r8)
            r4 = 44
            if (r12 == r4) goto L_0x033d
            r4 = 125(0x7d, float:1.75E-43)
            if (r12 == r4) goto L_0x033d
        L_0x031b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad argument syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0337
            java.lang.String r4 = r6.concat(r4)
        L_0x0333:
            r5.<init>(r4)
            throw r5
        L_0x0337:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0333
        L_0x033d:
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r9 <= r4) goto L_0x0364
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument type name too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x035e
            java.lang.String r4 = r6.concat(r4)
        L_0x035a:
            r5.<init>(r4)
            throw r5
        L_0x035e:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x035a
        L_0x0364:
            bn r4 = defpackage.bn.SIMPLE
            r7 = 6
            if (r9 != r7) goto L_0x049d
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r6 + 1
            char r7 = r7.charAt(r6)
            r14 = 99
            if (r7 == r14) goto L_0x037b
            r14 = 67
            if (r7 != r14) goto L_0x041a
        L_0x037b:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 104(0x68, float:1.46E-43)
            if (r7 == r13) goto L_0x038d
            r13 = 72
            if (r7 != r13) goto L_0x041a
        L_0x038d:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 111(0x6f, float:1.56E-43)
            if (r7 == r14) goto L_0x039f
            r14 = 79
            if (r7 != r14) goto L_0x041a
        L_0x039f:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x03b1
            r13 = 73
            if (r7 != r13) goto L_0x041a
        L_0x03b1:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 99
            if (r7 == r14) goto L_0x03c3
            r14 = 67
            if (r7 != r14) goto L_0x041a
        L_0x03c3:
            r0 = r18
            java.lang.String r7 = r0.b
            char r7 = r7.charAt(r13)
            r13 = 101(0x65, float:1.42E-43)
            if (r7 == r13) goto L_0x03d3
            r13 = 69
            if (r7 != r13) goto L_0x041a
        L_0x03d3:
            r7 = 1
        L_0x03d4:
            if (r7 == 0) goto L_0x041c
            bn r4 = defpackage.bn.CHOICE
            r7 = r4
        L_0x03d9:
            r0 = r18
            java.util.ArrayList r4 = r0.c
            java.lang.Object r4 = r4.get(r5)
            bo r4 = (defpackage.bo) r4
            int r13 = r7.ordinal()
            short r13 = (short) r13
            r4.d = r13
            bn r4 = defpackage.bn.SIMPLE
            if (r7 != r4) goto L_0x03f6
            bp r4 = defpackage.bp.ARG_TYPE
            r13 = 0
            r0 = r18
            r0.a(r4, r6, r9, r13)
        L_0x03f6:
            r4 = 125(0x7d, float:1.75E-43)
            if (r12 != r4) goto L_0x0538
            bn r4 = defpackage.bn.SIMPLE
            if (r7 == r4) goto L_0x0b0b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No style field for complex argument: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0531
            java.lang.String r4 = r6.concat(r4)
        L_0x0416:
            r5.<init>(r4)
            throw r5
        L_0x041a:
            r7 = 0
            goto L_0x03d4
        L_0x041c:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r6 + 1
            char r7 = r7.charAt(r6)
            r14 = 112(0x70, float:1.57E-43)
            if (r7 == r14) goto L_0x042e
            r14 = 80
            if (r7 != r14) goto L_0x048e
        L_0x042e:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 108(0x6c, float:1.51E-43)
            if (r7 == r13) goto L_0x0440
            r13 = 76
            if (r7 != r13) goto L_0x048e
        L_0x0440:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 117(0x75, float:1.64E-43)
            if (r7 == r14) goto L_0x0452
            r14 = 85
            if (r7 != r14) goto L_0x048e
        L_0x0452:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 114(0x72, float:1.6E-43)
            if (r7 == r13) goto L_0x0464
            r13 = 82
            if (r7 != r13) goto L_0x048e
        L_0x0464:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 97
            if (r7 == r14) goto L_0x0476
            r14 = 65
            if (r7 != r14) goto L_0x048e
        L_0x0476:
            r0 = r18
            java.lang.String r7 = r0.b
            char r7 = r7.charAt(r13)
            r13 = 108(0x6c, float:1.51E-43)
            if (r7 == r13) goto L_0x0486
            r13 = 76
            if (r7 != r13) goto L_0x048e
        L_0x0486:
            r7 = 1
        L_0x0487:
            if (r7 == 0) goto L_0x0490
            bn r4 = defpackage.bn.PLURAL
            r7 = r4
            goto L_0x03d9
        L_0x048e:
            r7 = 0
            goto L_0x0487
        L_0x0490:
            r0 = r18
            boolean r7 = r0.g(r6)
            if (r7 == 0) goto L_0x0b0f
            bn r4 = defpackage.bn.SELECT
            r7 = r4
            goto L_0x03d9
        L_0x049d:
            r7 = 13
            if (r9 != r7) goto L_0x0b0f
            r0 = r18
            boolean r7 = r0.g(r6)
            if (r7 == 0) goto L_0x0b0f
            int r7 = r6 + 6
            r0 = r18
            java.lang.String r13 = r0.b
            int r14 = r7 + 1
            char r7 = r13.charAt(r7)
            r13 = 111(0x6f, float:1.56E-43)
            if (r7 == r13) goto L_0x04bd
            r13 = 79
            if (r7 != r13) goto L_0x052f
        L_0x04bd:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 114(0x72, float:1.6E-43)
            if (r7 == r14) goto L_0x04cf
            r14 = 82
            if (r7 != r14) goto L_0x052f
        L_0x04cf:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 100
            if (r7 == r13) goto L_0x04e1
            r13 = 68
            if (r7 != r13) goto L_0x052f
        L_0x04e1:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 105(0x69, float:1.47E-43)
            if (r7 == r14) goto L_0x04f3
            r14 = 73
            if (r7 != r14) goto L_0x052f
        L_0x04f3:
            r0 = r18
            java.lang.String r7 = r0.b
            int r14 = r13 + 1
            char r7 = r7.charAt(r13)
            r13 = 110(0x6e, float:1.54E-43)
            if (r7 == r13) goto L_0x0505
            r13 = 78
            if (r7 != r13) goto L_0x052f
        L_0x0505:
            r0 = r18
            java.lang.String r7 = r0.b
            int r13 = r14 + 1
            char r7 = r7.charAt(r14)
            r14 = 97
            if (r7 == r14) goto L_0x0517
            r14 = 65
            if (r7 != r14) goto L_0x052f
        L_0x0517:
            r0 = r18
            java.lang.String r7 = r0.b
            char r7 = r7.charAt(r13)
            r13 = 108(0x6c, float:1.51E-43)
            if (r7 == r13) goto L_0x0527
            r13 = 76
            if (r7 != r13) goto L_0x052f
        L_0x0527:
            r7 = 1
        L_0x0528:
            if (r7 == 0) goto L_0x0b0f
            bn r4 = defpackage.bn.SELECTORDINAL
            r7 = r4
            goto L_0x03d9
        L_0x052f:
            r7 = 0
            goto L_0x0528
        L_0x0531:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0416
        L_0x0538:
            int r8 = r8 + 1
            bn r4 = defpackage.bn.SIMPLE
            if (r7 != r4) goto L_0x0606
            r4 = 0
            r6 = r8
        L_0x0540:
            r0 = r18
            java.lang.String r9 = r0.b
            int r9 = r9.length()
            if (r6 >= r9) goto L_0x05e6
            r0 = r18
            java.lang.String r10 = r0.b
            int r9 = r6 + 1
            char r6 = r10.charAt(r6)
            r10 = 39
            if (r6 != r10) goto L_0x0589
            r0 = r18
            java.lang.String r6 = r0.b
            r10 = 39
            int r6 = r6.indexOf(r10, r9)
            if (r6 >= 0) goto L_0x0586
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Quoted literal argument style text reaches to the end of the message: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0580
            java.lang.String r4 = r6.concat(r4)
        L_0x057c:
            r5.<init>(r4)
            throw r5
        L_0x0580:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x057c
        L_0x0586:
            int r6 = r6 + 1
            goto L_0x0540
        L_0x0589:
            r10 = 123(0x7b, float:1.72E-43)
            if (r6 != r10) goto L_0x0591
            int r4 = r4 + 1
            r6 = r9
            goto L_0x0540
        L_0x0591:
            r10 = 125(0x7d, float:1.75E-43)
            if (r6 != r10) goto L_0x05e3
            if (r4 <= 0) goto L_0x059b
            int r4 = r4 + -1
            r6 = r9
            goto L_0x0540
        L_0x059b:
            int r4 = r9 + -1
            int r6 = r4 - r8
            r9 = 65535(0xffff, float:9.1834E-41)
            if (r6 <= r9) goto L_0x05c6
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument style text too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x05c0
            java.lang.String r4 = r6.concat(r4)
        L_0x05bc:
            r5.<init>(r4)
            throw r5
        L_0x05c0:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x05bc
        L_0x05c6:
            bp r9 = defpackage.bp.ARG_STYLE
            r10 = 0
            r0 = r18
            r0.a(r9, r8, r6, r10)
            r17 = r7
            r7 = r4
            r4 = r17
        L_0x05d3:
            bp r6 = defpackage.bp.ARG_LIMIT
            r8 = 1
            int r9 = r4.ordinal()
            r4 = r18
            r4.a(r5, r6, r7, r8, r9)
            int r7 = r7 + 1
            goto L_0x0023
        L_0x05e3:
            r6 = r9
            goto L_0x0540
        L_0x05e6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unmatched '{' braces in message "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0600
            java.lang.String r4 = r6.concat(r4)
        L_0x05fc:
            r5.<init>(r4)
            throw r5
        L_0x0600:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x05fc
        L_0x0606:
            bn r4 = defpackage.bn.CHOICE
            if (r7 != r4) goto L_0x077f
            r0 = r18
            int r4 = r0.d(r8)
            r0 = r18
            java.lang.String r6 = r0.b
            int r6 = r6.length()
            if (r4 == r6) goto L_0x0626
            r0 = r18
            java.lang.String r6 = r0.b
            char r6 = r6.charAt(r4)
            r9 = 125(0x7d, float:1.75E-43)
            if (r6 != r9) goto L_0x064e
        L_0x0626:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Missing choice argument pattern in "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0640
            java.lang.String r4 = r6.concat(r4)
        L_0x063c:
            r5.<init>(r4)
            throw r5
        L_0x0640:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x063c
        L_0x0646:
            int r4 = r4 + 1
            r0 = r18
            int r4 = r0.d(r4)
        L_0x064e:
            r0 = r18
            int r6 = r0.f(r4)
            int r9 = r6 - r4
            if (r9 != 0) goto L_0x067a
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad choice pattern syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0674
            java.lang.String r4 = r6.concat(r4)
        L_0x0670:
            r5.<init>(r4)
            throw r5
        L_0x0674:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0670
        L_0x067a:
            r10 = 65535(0xffff, float:9.1834E-41)
            if (r9 <= r10) goto L_0x06a1
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Choice number too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x069b
            java.lang.String r4 = r6.concat(r4)
        L_0x0697:
            r5.<init>(r4)
            throw r5
        L_0x069b:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0697
        L_0x06a1:
            r9 = 1
            r0 = r18
            r0.a(r4, r6, r9)
            r0 = r18
            int r4 = r0.d(r6)
            r0 = r18
            java.lang.String r6 = r0.b
            int r6 = r6.length()
            if (r4 != r6) goto L_0x06d9
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad choice pattern syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x06d3
            java.lang.String r4 = r6.concat(r4)
        L_0x06cf:
            r5.<init>(r4)
            throw r5
        L_0x06d3:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x06cf
        L_0x06d9:
            r0 = r18
            java.lang.String r6 = r0.b
            char r6 = r6.charAt(r4)
            r9 = 35
            if (r6 == r9) goto L_0x0720
            r9 = 60
            if (r6 == r9) goto L_0x0720
            r9 = 8804(0x2264, float:1.2337E-41)
            if (r6 == r9) goto L_0x0720
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = r18
            java.lang.String r5 = r0.i(r8)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Expected choice separator (#<≤) instead of '"
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = "' in choice pattern "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0720:
            bp r6 = defpackage.bp.ARG_SELECTOR
            r9 = 1
            r10 = 0
            r0 = r18
            r0.a(r6, r4, r9, r10)
            int r4 = r4 + 1
            r6 = 0
            int r9 = r21 + 1
            bn r10 = defpackage.bn.CHOICE
            r0 = r18
            int r4 = r0.a(r4, r6, r9, r10)
            r0 = r18
            java.lang.String r6 = r0.b
            int r6 = r6.length()
            if (r4 != r6) goto L_0x0747
        L_0x0740:
            r17 = r7
            r7 = r4
            r4 = r17
            goto L_0x05d3
        L_0x0747:
            r0 = r18
            java.lang.String r6 = r0.b
            char r6 = r6.charAt(r4)
            r9 = 125(0x7d, float:1.75E-43)
            if (r6 != r9) goto L_0x0646
            r0 = r18
            r1 = r21
            boolean r6 = r0.h(r1)
            if (r6 != 0) goto L_0x0740
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Bad choice pattern syntax: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0779
            java.lang.String r4 = r6.concat(r4)
        L_0x0775:
            r5.<init>(r4)
            throw r5
        L_0x0779:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0775
        L_0x077f:
            r6 = 1
            r4 = 0
            r9 = r8
        L_0x0782:
            r0 = r18
            int r10 = r0.d(r9)
            r0 = r18
            java.lang.String r9 = r0.b
            int r9 = r9.length()
            if (r10 != r9) goto L_0x07f1
            r9 = 1
        L_0x0793:
            if (r9 != 0) goto L_0x07a1
            r0 = r18
            java.lang.String r12 = r0.b
            char r12 = r12.charAt(r10)
            r13 = 125(0x7d, float:1.75E-43)
            if (r12 != r13) goto L_0x0839
        L_0x07a1:
            r0 = r18
            r1 = r21
            boolean r6 = r0.h(r1)
            if (r9 != r6) goto L_0x07f3
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r7.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            r0 = r18
            java.lang.String r6 = r0.i(r8)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 21
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Bad "
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " pattern syntax: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x07f1:
            r9 = 0
            goto L_0x0793
        L_0x07f3:
            if (r4 != 0) goto L_0x0a7f
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r7.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String r6 = r18.b()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 39
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Missing 'other' keyword in "
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " pattern in "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0839:
            boolean r9 = r7.a()
            if (r9 == 0) goto L_0x0937
            r0 = r18
            java.lang.String r9 = r0.b
            char r9 = r9.charAt(r10)
            r12 = 61
            if (r9 != r12) goto L_0x0937
            int r6 = r10 + 1
            r0 = r18
            int r6 = r0.f(r6)
            int r9 = r6 - r10
            r12 = 1
            if (r9 != r12) goto L_0x089e
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r7.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            r0 = r18
            java.lang.String r6 = r0.i(r8)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 21
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Bad "
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " pattern syntax: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x089e:
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r9 <= r12) goto L_0x08c5
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument selector too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x08bf
            java.lang.String r4 = r6.concat(r4)
        L_0x08bb:
            r5.<init>(r4)
            throw r5
        L_0x08bf:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x08bb
        L_0x08c5:
            bp r12 = defpackage.bp.ARG_SELECTOR
            r13 = 0
            r0 = r18
            r0.a(r12, r10, r9, r13)
            int r9 = r10 + 1
            r12 = 0
            r0 = r18
            r0.a(r9, r6, r12)
        L_0x08d5:
            r0 = r18
            int r6 = r0.d(r6)
            r0 = r18
            java.lang.String r9 = r0.b
            int r9 = r9.length()
            if (r6 == r9) goto L_0x08f1
            r0 = r18
            java.lang.String r9 = r0.b
            char r9 = r9.charAt(r6)
            r12 = 123(0x7b, float:1.72E-43)
            if (r9 == r12) goto L_0x0a73
        L_0x08f1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r7.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            r0 = r18
            java.lang.String r6 = r0.i(r10)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 37
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "No message fragment after "
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " selector: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0937:
            r0 = r18
            int r9 = r0.e(r10)
            int r12 = r9 - r10
            if (r12 != 0) goto L_0x0987
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r7.toString()
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r6)
            r0 = r18
            java.lang.String r6 = r0.i(r8)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 21
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Bad "
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " pattern syntax: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0987:
            boolean r13 = r7.a()
            if (r13 == 0) goto L_0x0a33
            r13 = 6
            if (r12 != r13) goto L_0x0a33
            r0 = r18
            java.lang.String r13 = r0.b
            int r13 = r13.length()
            if (r9 >= r13) goto L_0x0a33
            r0 = r18
            java.lang.String r13 = r0.b
            java.lang.String r14 = "offset:"
            r15 = 0
            r16 = 7
            r0 = r16
            boolean r13 = r13.regionMatches(r10, r14, r15, r0)
            if (r13 == 0) goto L_0x0a33
            if (r6 != 0) goto L_0x09cf
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Plural argument 'offset:' (if present) must precede key-message pairs: "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x09c9
            java.lang.String r4 = r6.concat(r4)
        L_0x09c5:
            r5.<init>(r4)
            throw r5
        L_0x09c9:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x09c5
        L_0x09cf:
            int r6 = r9 + 1
            r0 = r18
            int r6 = r0.d(r6)
            r0 = r18
            int r9 = r0.f(r6)
            if (r9 != r6) goto L_0x0a01
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Missing value for plural 'offset:' "
            r0 = r18
            java.lang.String r4 = r0.i(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x09fb
            java.lang.String r4 = r6.concat(r4)
        L_0x09f7:
            r5.<init>(r4)
            throw r5
        L_0x09fb:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x09f7
        L_0x0a01:
            int r10 = r9 - r6
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r10 <= r12) goto L_0x0a2a
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = "Plural offset value too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r6 = r4.length()
            if (r6 == 0) goto L_0x0a24
            java.lang.String r4 = r7.concat(r4)
        L_0x0a20:
            r5.<init>(r4)
            throw r5
        L_0x0a24:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
            goto L_0x0a20
        L_0x0a2a:
            r10 = 0
            r0 = r18
            r0.a(r6, r9, r10)
            r6 = 0
            goto L_0x0782
        L_0x0a33:
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r12 <= r6) goto L_0x0a5a
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "Argument selector too long: "
            r0 = r18
            java.lang.String r4 = r0.i(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0a54
            java.lang.String r4 = r6.concat(r4)
        L_0x0a50:
            r5.<init>(r4)
            throw r5
        L_0x0a54:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0a50
        L_0x0a5a:
            bp r6 = defpackage.bp.ARG_SELECTOR
            r13 = 0
            r0 = r18
            r0.a(r6, r10, r12, r13)
            r0 = r18
            java.lang.String r6 = r0.b
            java.lang.String r13 = "other"
            r14 = 0
            boolean r6 = r6.regionMatches(r10, r13, r14, r12)
            if (r6 == 0) goto L_0x0b08
            r4 = 1
            r6 = r9
            goto L_0x08d5
        L_0x0a73:
            r9 = 1
            int r10 = r21 + 1
            r0 = r18
            int r9 = r0.a(r6, r9, r10, r7)
            r6 = 0
            goto L_0x0782
        L_0x0a7f:
            r4 = r7
            r7 = r10
            goto L_0x05d3
        L_0x0a83:
            if (r21 <= 0) goto L_0x0a89
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L_0x0a93
        L_0x0a89:
            bn r5 = defpackage.bn.CHOICE
            r0 = r22
            if (r0 != r5) goto L_0x0ab5
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 != r5) goto L_0x0ab5
        L_0x0a93:
            bn r5 = defpackage.bn.CHOICE
            r0 = r22
            if (r0 != r5) goto L_0x0ab3
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 != r5) goto L_0x0ab3
            r8 = 0
        L_0x0a9e:
            bp r6 = defpackage.bp.MSG_LIMIT
            int r7 = r10 + -1
            r4 = r18
            r5 = r11
            r9 = r21
            r4.a(r5, r6, r7, r8, r9)
            bn r4 = defpackage.bn.CHOICE
            r0 = r22
            if (r0 != r4) goto L_0x0ab2
            int r10 = r10 + -1
        L_0x0ab2:
            return r10
        L_0x0ab3:
            r8 = 1
            goto L_0x0a9e
        L_0x0ab5:
            r7 = r10
            goto L_0x0023
        L_0x0ab8:
            if (r21 <= 0) goto L_0x0afb
            r4 = 1
            r0 = r21
            if (r0 != r4) goto L_0x0af3
            bn r4 = defpackage.bn.CHOICE
            r0 = r22
            if (r0 != r4) goto L_0x0af3
            r0 = r18
            java.util.ArrayList r4 = r0.c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            bo r4 = (defpackage.bo) r4
            bp r4 = r4.a
            bp r5 = defpackage.bp.MSG_START
            if (r4 == r5) goto L_0x0af3
            r4 = 1
        L_0x0ad7:
            if (r4 != 0) goto L_0x0afb
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unmatched '{' braces in message "
            java.lang.String r4 = r18.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r4.length()
            if (r7 == 0) goto L_0x0af5
            java.lang.String r4 = r6.concat(r4)
        L_0x0aef:
            r5.<init>(r4)
            throw r5
        L_0x0af3:
            r4 = 0
            goto L_0x0ad7
        L_0x0af5:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0aef
        L_0x0afb:
            bp r6 = defpackage.bp.MSG_LIMIT
            r8 = 0
            r4 = r18
            r5 = r11
            r9 = r21
            r4.a(r5, r6, r7, r8, r9)
            r10 = r7
            goto L_0x0ab2
        L_0x0b08:
            r6 = r9
            goto L_0x08d5
        L_0x0b0b:
            r4 = r7
            r7 = r8
            goto L_0x05d3
        L_0x0b0f:
            r7 = r4
            goto L_0x03d9
        L_0x0b12:
            r17 = r7
            r7 = r4
            r4 = r17
            goto L_0x05d3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(int, int, int, bn):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            r2 = 0
            java.lang.String r0 = r6.b
            int r3 = r7 + 1
            char r0 = r0.charAt(r7)
            r1 = 45
            if (r0 != r1) goto L_0x002b
            r4 = 1
            if (r3 == r8) goto L_0x0078
            java.lang.String r0 = r6.b
            int r1 = r3 + 1
            char r0 = r0.charAt(r3)
            r3 = r4
        L_0x0019:
            r4 = 8734(0x221e, float:1.2239E-41)
            if (r0 != r4) goto L_0x004a
            if (r9 == 0) goto L_0x0078
            if (r1 != r8) goto L_0x0078
            if (r3 == 0) goto L_0x003b
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L_0x0025:
            int r2 = r8 - r7
            r6.a(r0, r7, r2)
        L_0x002a:
            return
        L_0x002b:
            r1 = 43
            if (r0 != r1) goto L_0x009a
            if (r3 == r8) goto L_0x0078
            java.lang.String r0 = r6.b
            int r1 = r3 + 1
            char r0 = r0.charAt(r3)
            r3 = r2
            goto L_0x0019
        L_0x003b:
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0025
        L_0x003e:
            java.lang.String r4 = r6.b
            int r2 = r1 + 1
            char r1 = r4.charAt(r1)
            r5 = r1
            r1 = r2
            r2 = r0
            r0 = r5
        L_0x004a:
            r4 = 48
            if (r4 > r0) goto L_0x0068
            r4 = 57
            if (r0 > r4) goto L_0x0068
            int r2 = r2 * 10
            int r0 = r0 + -48
            int r0 = r0 + r2
            int r2 = r3 + 32767
            if (r0 > r2) goto L_0x0068
            if (r1 != r8) goto L_0x003e
            bp r1 = defpackage.bp.ARG_INT
            int r2 = r8 - r7
            if (r3 == 0) goto L_0x0064
            int r0 = -r0
        L_0x0064:
            r6.a(r1, r7, r2, r0)
            goto L_0x002a
        L_0x0068:
            java.lang.String r0 = r6.b
            java.lang.String r0 = r0.substring(r7, r8)
            double r0 = java.lang.Double.parseDouble(r0)
            int r2 = r8 - r7
            r6.a(r0, r7, r2)
            goto L_0x002a
        L_0x0078:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Bad syntax for numeric value: "
            java.lang.String r0 = r6.b
            java.lang.String r0 = r0.substring(r7, r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0094
            java.lang.String r0 = r2.concat(r0)
        L_0x0090:
            r1.<init>(r0)
            throw r1
        L_0x0094:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0090
        L_0x009a:
            r1 = r3
            r3 = r2
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(int, int, boolean):void");
    }

    private final int d(int i) {
        return defpackage.ap.a(this.b, i);
    }

    private final int e(int i) {
        return defpackage.ap.b(this.b, i);
    }

    private final int f(int i) {
        while (i < this.b.length()) {
            char charAt = this.b.charAt(i);
            if ((charAt < '0' && "+-.".indexOf(charAt) < 0) || (charAt > '9' && charAt != 'e' && charAt != 'E' && charAt != 8734)) {
                break;
            }
            i++;
        }
        return i;
    }

    private final boolean g(int i) {
        int i2 = i + 1;
        char charAt = this.b.charAt(i);
        if (charAt == 's' || charAt == 'S') {
            int i3 = i2 + 1;
            char charAt2 = this.b.charAt(i2);
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i4 = i3 + 1;
                char charAt3 = this.b.charAt(i3);
                if (charAt3 == 'l' || charAt3 == 'L') {
                    int i5 = i4 + 1;
                    char charAt4 = this.b.charAt(i4);
                    if (charAt4 == 'e' || charAt4 == 'E') {
                        int i6 = i5 + 1;
                        char charAt5 = this.b.charAt(i5);
                        if (charAt5 == 'c' || charAt5 == 'C') {
                            char charAt6 = this.b.charAt(i6);
                            if (charAt6 == 't' || charAt6 == 'T') {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean h(int i) {
        return i > 0 || ((defpackage.bo) this.c.get(0)).a == defpackage.bp.MSG_START;
    }

    private final void a(defpackage.bp bpVar, int i, int i2, int i3) {
        this.c.add(new defpackage.bo(bpVar, i, i2, i3));
    }

    private final void a(int i, defpackage.bp bpVar, int i2, int i3, int i4) {
        ((defpackage.bo) this.c.get(i)).e = this.c.size();
        a(bpVar, i2, i3, i4);
    }

    private final void a(double d2, int i, int i2) {
        int size;
        if (this.d == null) {
            this.d = new java.util.ArrayList();
            size = 0;
        } else {
            size = this.d.size();
            if (size > 32767) {
                throw new java.lang.IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.d.add(java.lang.Double.valueOf(d2));
        a(defpackage.bp.ARG_DOUBLE, i, i2, size);
    }

    private static java.lang.String a(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ").append(i).append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = (i + 24) - 4;
            if (java.lang.Character.isHighSurrogate(str.charAt(i2 - 1))) {
                i2--;
            }
            sb.append(str, i, i2).append(" ...");
        }
        return sb.append("\"").toString();
    }

    private final java.lang.String i(int i) {
        return a(this.b, i);
    }

    private final java.lang.String b() {
        return a(this.b, 0);
    }
}
