package defpackage;

/* renamed from: as reason: default package */
/* compiled from: PG */
public class as extends java.text.Format.Field {
    public static final defpackage.as a = new defpackage.as("message argument field");
    public static final long serialVersionUID = 7510380454602616157L;

    private as(java.lang.String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public java.lang.Object readResolve() {
        if (getClass() != defpackage.as.class) {
            throw new java.io.InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        } else if (getName().equals(a.getName())) {
            return a;
        } else {
            throw new java.io.InvalidObjectException("Unknown attribute name.");
        }
    }
}
