package defpackage;

@java.lang.Deprecated
/* renamed from: bb reason: default package */
/* compiled from: PG */
public final class bb extends java.lang.Number implements java.lang.Comparable {
    public static final long serialVersionUID = -4756200506571685661L;
    @java.lang.Deprecated
    public final double a;
    @java.lang.Deprecated
    public final int b;
    @java.lang.Deprecated
    public final int c;
    @java.lang.Deprecated
    public final long d;
    @java.lang.Deprecated
    public final long e;
    @java.lang.Deprecated
    public final long f;
    @java.lang.Deprecated
    private final boolean g;

    @java.lang.Deprecated
    private bb(double d2, int i, long j) {
        double d3;
        long j2;
        this.g = d2 < 0.0d;
        if (this.g) {
            d3 = -d2;
        } else {
            d3 = d2;
        }
        this.a = d3;
        this.b = i;
        this.d = j;
        if (d2 > 1.0E18d) {
            j2 = 1000000000000000000L;
        } else {
            j2 = (long) d2;
        }
        this.f = j2;
        if (j == 0) {
            this.e = 0;
            this.c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.e = j;
            this.c = i2;
        }
        java.lang.Math.pow(10.0d, (double) i);
    }

    @java.lang.Deprecated
    private bb(double d2, int i) {
        double d3;
        int round;
        if (i == 0) {
            round = 0;
        } else {
            if (d2 < 0.0d) {
                d3 = -d2;
            } else {
                d3 = d2;
            }
            int pow = (int) java.lang.Math.pow(10.0d, (double) i);
            round = (int) (java.lang.Math.round(d3 * ((double) pow)) % ((long) pow));
        }
        long j = (long) round;
        this(d2, i, j);
    }

    @java.lang.Deprecated
    public bb(double d2) {
        int i;
        double d3;
        if (java.lang.Double.isInfinite(d2) || java.lang.Double.isNaN(d2)) {
            i = 0;
        } else {
            if (d2 < 0.0d) {
                d3 = -d2;
            } else {
                d3 = d2;
            }
            if (d3 < 1.0E9d) {
                long j = ((long) (d3 * 1000000.0d)) % 1000000;
                int i2 = 10;
                i = 6;
                while (true) {
                    if (i > 0) {
                        if (j % ((long) i2) != 0) {
                            break;
                        }
                        i2 *= 10;
                        i--;
                    } else {
                        i = 0;
                        break;
                    }
                }
            } else {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%1.15e", new java.lang.Object[]{java.lang.Double.valueOf(d3)});
                int lastIndexOf = format.lastIndexOf(101);
                int i3 = lastIndexOf + 1;
                if (format.charAt(i3) == '+') {
                    i3++;
                }
                int parseInt = (lastIndexOf - 2) - java.lang.Integer.parseInt(format.substring(i3));
                if (parseInt < 0) {
                    i = 0;
                } else {
                    int i4 = lastIndexOf - 1;
                    int i5 = parseInt;
                    while (i > 0 && format.charAt(i4) == '0') {
                        i4--;
                        i5 = i - 1;
                    }
                }
            }
        }
        this(d2, i);
    }

    @java.lang.Deprecated
    public bb(java.lang.String str) {
        int length;
        double parseDouble = java.lang.Double.parseDouble(str);
        java.lang.String trim = str.trim();
        int indexOf = trim.indexOf(46) + 1;
        if (indexOf == 0) {
            length = 0;
        } else {
            length = trim.length() - indexOf;
        }
        this(parseDouble, length);
    }

    @java.lang.Deprecated
    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bb)) {
            return false;
        }
        defpackage.bb bbVar = (defpackage.bb) obj;
        if (this.a == bbVar.a && this.b == bbVar.b && this.d == bbVar.d) {
            return true;
        }
        return false;
    }

    @java.lang.Deprecated
    public final int hashCode() {
        return (int) (this.d + ((long) ((this.b + ((int) (37.0d * this.a))) * 37)));
    }

    @java.lang.Deprecated
    public final java.lang.String toString() {
        return java.lang.String.format("%." + this.b + "f", new java.lang.Object[]{java.lang.Double.valueOf(this.a)});
    }

    @java.lang.Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @java.lang.Deprecated
    public final long longValue() {
        return this.f;
    }

    @java.lang.Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @java.lang.Deprecated
    public final double doubleValue() {
        return this.g ? -this.a : this.a;
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        throw new java.io.NotSerializableException();
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        throw new java.io.NotSerializableException();
    }

    @java.lang.Deprecated
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.bb bbVar = (defpackage.bb) obj;
        if (this.f != bbVar.f) {
            if (this.f < bbVar.f) {
                return -1;
            }
            return 1;
        } else if (this.a != bbVar.a) {
            if (this.a >= bbVar.a) {
                return 1;
            }
            return -1;
        } else if (this.b == bbVar.b) {
            long j = this.d - bbVar.d;
            if (j == 0) {
                return 0;
            }
            if (j >= 0) {
                return 1;
            }
            return -1;
        } else if (this.b >= bbVar.b) {
            return 1;
        } else {
            return -1;
        }
    }
}
