package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;

/* renamed from: as  reason: default package */
/* compiled from: PG */
public class as extends Format.Field {
    public static final as a = new as("message argument field");
    public static final long serialVersionUID = 7510380454602616157L;

    private as(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // java.text.AttributedCharacterIterator.Attribute
    public Object readResolve() {
        if (getClass() != as.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        } else if (getName().equals(a.getName())) {
            return a;
        } else {
            throw new InvalidObjectException("Unknown attribute name.");
        }
    }
}
