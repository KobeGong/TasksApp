package defpackage;

/* renamed from: at reason: default package */
/* compiled from: PG */
final class at {
    public int a;
    public java.lang.String b;
    public java.lang.Number c;
    public double d;
    public int e;
    public java.text.Format f;
    public java.lang.String g;
    public boolean h;

    at(int i, java.lang.String str, java.lang.Number number, double d2) {
        this.a = i;
        this.b = str;
        if (d2 == 0.0d) {
            this.c = number;
        } else {
            this.c = java.lang.Double.valueOf(number.doubleValue() - d2);
        }
        this.d = d2;
    }

    public final java.lang.String toString() {
        throw new java.lang.AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
