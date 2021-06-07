package defpackage;

/* renamed from: bp  reason: default package */
/* compiled from: PG */
public enum bp {
    MSG_START,
    MSG_LIMIT,
    SKIP_SYNTAX,
    INSERT_CHAR,
    REPLACE_NUMBER,
    ARG_START,
    ARG_LIMIT,
    ARG_NUMBER,
    ARG_NAME,
    ARG_TYPE,
    ARG_STYLE,
    ARG_SELECTOR,
    ARG_INT,
    ARG_DOUBLE;

    public final boolean a() {
        return this == ARG_INT || this == ARG_DOUBLE;
    }
}
