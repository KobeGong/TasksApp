package defpackage;

/* renamed from: cue reason: default package */
/* compiled from: PG */
public enum cue {
    STRING('s', defpackage.cug.a, "-#", true),
    BOOLEAN('b', defpackage.cug.b, "-", true),
    CHAR('c', defpackage.cug.c, "-", true),
    DECIMAL('d', defpackage.cug.d, "-0+ ,", false),
    OCTAL('o', defpackage.cug.d, "-#0", false),
    HEX('x', defpackage.cug.d, "-#0", true),
    FLOAT('f', defpackage.cug.e, "-#0+ ,", false),
    EXPONENT('e', defpackage.cug.e, "-#0+ ", true),
    GENERAL('g', defpackage.cug.e, "-0+ ,", true),
    EXPONENT_HEX('a', defpackage.cug.e, "-#0+ ", true);
    
    public static final defpackage.cue[] b = null;
    public final char c;
    public final defpackage.cug d;
    public final int e;
    public final java.lang.String f;

    private cue(char c2, defpackage.cug cug, java.lang.String str, boolean z) {
        this.c = c2;
        this.d = cug;
        this.e = defpackage.cuf.a(str, z);
        this.f = "%" + c2;
    }

    static {
        defpackage.cue[] values;
        b = new defpackage.cue[26];
        for (defpackage.cue cue : values()) {
            b[(cue.c | ' ') - 'a'] = cue;
        }
    }
}
