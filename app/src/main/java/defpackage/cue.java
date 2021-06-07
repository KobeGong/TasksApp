package defpackage;

/* renamed from: cue  reason: default package */
/* compiled from: PG */
public enum cue {
    STRING('s', cug.GENERAL, "-#", true),
    BOOLEAN('b', cug.BOOLEAN, "-", true),
    CHAR('c', cug.CHARACTER, "-", true),
    DECIMAL('d', cug.INTEGRAL, "-0+ ,", false),
    OCTAL('o', cug.INTEGRAL, "-#0", false),
    HEX('x', cug.INTEGRAL, "-#0", true),
    FLOAT('f', cug.FLOAT, "-#0+ ,", false),
    EXPONENT('e', cug.FLOAT, "-#0+ ", true),
    GENERAL('g', cug.FLOAT, "-0+ ,", true),
    EXPONENT_HEX('a', cug.FLOAT, "-#0+ ", true);
    
    public static final cue[] b = new cue[26];
    public final char c;
    public final cug d;
    public final int e;
    public final String f;

    private cue(char c2, cug cug, String str, boolean z) {
        this.c = c2;
        this.d = cug;
        this.e = cuf.a(str, z);
        this.f = new StringBuilder(2).append("%").append(c2).toString();
    }

    static {
        cue[] values = values();
        for (cue cue : values) {
            b[(cue.c | ' ') - 97] = cue;
        }
    }
}
