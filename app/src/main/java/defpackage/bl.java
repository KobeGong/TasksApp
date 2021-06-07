package defpackage;

import java.util.ArrayList;

/* renamed from: bl  reason: default package */
/* compiled from: PG */
public final class bl implements Cloneable {
    public static final bn[] f = bn.values();
    private static final bm g = bm.a(al.a("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL"));
    public bm a = g;
    public String b;
    public ArrayList c = new ArrayList();
    public ArrayList d;
    public boolean e;

    public bl() {
    }

    public bl(String str) {
        a(str);
    }

    public final bl a(String str) {
        this.b = str;
        this.e = false;
        this.c.clear();
        if (this.d != null) {
            this.d.clear();
        }
        a(0, 0, 0, bn.NONE);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bl blVar = (bl) obj;
        return this.a.equals(blVar.a) && (this.b != null ? this.b.equals(blVar.b) : blVar.b == null) && this.c.equals(blVar.c);
    }

    public final int hashCode() {
        return (((this.b != null ? this.b.hashCode() : 0) + (this.a.hashCode() * 37)) * 37) + this.c.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public final bo a(int i) {
        return (bo) this.c.get(i);
    }

    public final bp b(int i) {
        return ((bo) this.c.get(i)).a;
    }

    public final String a(bo boVar) {
        int i = boVar.b;
        return this.b.substring(i, boVar.c + i);
    }

    public final boolean a(bo boVar, String str) {
        return this.b.regionMatches(boVar.b, str, 0, boVar.c);
    }

    public final double b(bo boVar) {
        bp bpVar = boVar.a;
        if (bpVar == bp.ARG_INT) {
            return (double) boVar.d;
        }
        if (bpVar == bp.ARG_DOUBLE) {
            return ((Double) this.d.get(boVar.d)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int c(int i) {
        int i2 = ((bo) this.c.get(i)).e;
        return i2 < i ? i : i2;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return a();
    }

    private final bl a() {
        try {
            bl blVar = (bl) super.clone();
            blVar.c = (ArrayList) this.c.clone();
            if (this.d != null) {
                blVar.d = (ArrayList) this.d.clone();
            }
            return blVar;
        } catch (CloneNotSupportedException e2) {
            throw new bq(e2);
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
        // Method dump skipped, instructions count: 2841
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(int, int, int, bn):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r7, int r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(int, int, boolean):void");
    }

    private final int d(int i) {
        return ap.a(this.b, i);
    }

    private final int e(int i) {
        return ap.b(this.b, i);
    }

    private final int f(int i) {
        while (i < this.b.length() && (((r0 = this.b.charAt(i)) >= '0' || "+-.".indexOf(r0) >= 0) && (r0 <= '9' || r0 == 'e' || r0 == 'E' || r0 == 8734))) {
            i++;
        }
        return i;
    }

    private final boolean g(int i) {
        char charAt;
        int i2 = i + 1;
        char charAt2 = this.b.charAt(i);
        if (charAt2 == 's' || charAt2 == 'S') {
            int i3 = i2 + 1;
            char charAt3 = this.b.charAt(i2);
            if (charAt3 == 'e' || charAt3 == 'E') {
                int i4 = i3 + 1;
                char charAt4 = this.b.charAt(i3);
                if (charAt4 == 'l' || charAt4 == 'L') {
                    int i5 = i4 + 1;
                    char charAt5 = this.b.charAt(i4);
                    if (charAt5 == 'e' || charAt5 == 'E') {
                        int i6 = i5 + 1;
                        char charAt6 = this.b.charAt(i5);
                        if ((charAt6 == 'c' || charAt6 == 'C') && ((charAt = this.b.charAt(i6)) == 't' || charAt == 'T')) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean h(int i) {
        if (i > 0 || ((bo) this.c.get(0)).a == bp.MSG_START) {
            return true;
        }
        return false;
    }

    private final void a(bp bpVar, int i, int i2, int i3) {
        this.c.add(new bo(bpVar, i, i2, i3));
    }

    private final void a(int i, bp bpVar, int i2, int i3, int i4) {
        ((bo) this.c.get(i)).e = this.c.size();
        a(bpVar, i2, i3, i4);
    }

    private final void a(double d2, int i, int i2) {
        int size;
        if (this.d == null) {
            this.d = new ArrayList();
            size = 0;
        } else {
            size = this.d.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.d.add(Double.valueOf(d2));
        a(bp.ARG_DOUBLE, i, i2, size);
    }

    private static String a(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
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
            if (Character.isHighSurrogate(str.charAt(i2 - 1))) {
                i2--;
            }
            sb.append((CharSequence) str, i, i2).append(" ...");
        }
        return sb.append("\"").toString();
    }

    private final String i(int i) {
        return a(this.b, i);
    }

    private final String b() {
        return a(this.b, 0);
    }
}
